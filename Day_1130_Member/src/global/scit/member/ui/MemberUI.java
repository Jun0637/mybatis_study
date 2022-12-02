package global.scit.member.ui;

import java.util.List;
import java.util.Scanner;

import global.scit.member.service.MemberService;
import global.scit.member.vo.MemberInfo;
import global.scit.member.vo.Members;

public class MemberUI {
	Scanner keyin = new Scanner(System.in);
	MemberService service = new MemberService();

	public MemberUI() {
		String choice;

		while (true) {
			mainMenu();

			choice = keyin.next();
			switch (choice) {
			case "1":
				findById();
				break;
			case "2":
				findAll();
				break;
			case "3":
				insertMember();
				break;
			case "4":
				deleteMember();
				break;
			case "5":
				updateMember();
				break;
			case "0":
				System.out.println("*** 프로그램 종료합니다.");
				return;
			default:
				keyin.nextLine();
			}
		}
	}

	private void updateMember() {
		String usrid, email;
		int addrno;
		System.out.println(">아이디 : ");
		usrid = keyin.next();
		
		MemberInfo info = service.findById(usrid);
		
		if(info == null) {
			System.out.println("해당하는 ID가 없습니다.");
			return;
		}

		System.out.println("주소 : ");
		addrno = keyin.nextInt();
		
		Members ms = new Members(usrid, null, null, addrno);
		int result = service.updateMember(ms);
	}

	private void deleteMember() {
		String usrid;
		System.out.println(">아이디 : ");
		usrid = keyin.next();

		MemberInfo info = service.findById(usrid);
		//null 체크해서 없는 아이디면 return;
		if(info == null) {
			System.out.println("해당하는 ID가 없습니다.");
			return;
		}
		
		System.out.println(">삭제하시겠습니까?(y/n) :");
		String choice = keyin.next();
		
		if (choice.equals("y")) {
			//삭제작업
			int result = service.deleteMember(usrid);
			System.out.println("**삭제 되었습니다.");
			return;
		}
		
		System.out.println("삭제 취소되었습니다.");

	}

	private void insertMember() {
		System.out.println("[회원가입]");
		String usrid, usrname, email;
		int addrno;
		System.out.print("> 아이디 : ");
		usrid = keyin.next();

		MemberInfo info = service.findById(usrid);
		if (info != null) {
			System.out.println("** 사용할수 없는 아이디입니다.");
			return;
		}

		System.out.print("> 이름 : ");
		usrname = keyin.next();

		System.out.print("> 이메일 : ");
		email = keyin.next();

		while(true) {
			System.out.println(">> 주소 목록 <<");
			System.out.println("1) 서울시	종로구");
			System.out.println("2) 인천시	연수구");
			System.out.println("3) 서울시	강남구");
			System.out.println("4) 부산시	연제구");
			System.out.println("5) 제주시	북제주군");

			System.out.print("> 사는 곳 : ");
			try {
				addrno = keyin.nextInt();
				
				if(!(addrno >=1 && addrno <=5)) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("**오류 : 주소를 잘못 선택했습니다.");
				keyin.nextLine();
				continue;
			}
			break;
		}
		
		Members m = new Members(usrid, usrname, email, addrno);

		int result = service.insertMember(m);
		if (result == 1)
			System.out.println("**회원 가입이 완료되었습니다.**");
		else
			System.out.println("**회원가입을 실패했습니다.**");
	}

	private void findAll() {
		System.out.println("   [전체 회원 조회]  ");

		List<MemberInfo> memberinfo = service.findAll();
		if (memberinfo.isEmpty()) {
			System.out.println("**회원 정보가 없습니다.");
			return;
		}
		for (MemberInfo im : memberinfo)
			System.out.println(im);

	}

	private void findById() {
		String usrid = null;

		System.out.println("   [회원 정보 조회]  ");
		System.out.println("> 회원 아이디 : ");
		usrid = keyin.next();

		MemberInfo info = service.findById(usrid);
		if (info == null) {
			System.out.println("**회원 정보가 없습니다.");
			return;
		}
		System.out.println(info);

	}

	private void mainMenu() {
		System.out.println("===[회원 정보 관리]===");
		System.out.println("   1.회원 정보 조회");
		System.out.println("   2.전체 회원 조회");
		System.out.println("   3.회원 가입"); 
		System.out.println("   4.삭 제"); 
		System.out.println("   5.정보 수정"); 
		System.out.println("   0.종 료");
		System.out.println("==================");
		System.out.print("    > 선 택 : ");

	}
}
