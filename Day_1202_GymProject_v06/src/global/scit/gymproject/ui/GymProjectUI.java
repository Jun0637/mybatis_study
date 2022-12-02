package global.scit.gymproject.ui;

import java.util.List;
import java.util.Scanner;

import global.scit.gymproject.service.GymService;
import global.scit.gymproject.vo.GymVO;

public class GymProjectUI {
	Scanner keyin = new Scanner(System.in);
	GymService service = new GymService(); // has-a 관계
	
	//생성자
	public GymProjectUI() {
		String choice;
		
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : 
				//regist(); // 회원 등록
				break;
			case "2" :
				//findById(); // 회원 조회
				break;
			case "3" :
				//update();// 정보 수정
				break;
			case "4" :
				//delete();// 삭제
				break;
			case "5" :
				//findAll();// 회원 정보출력
				break;
			case "0" :
				System.out.println("*프로그램 종료합니다.");
				System.exit(0);
			default:
				System.out.println("*메뉴를 다시 선택해주세요.");
			}
		}
	}
	/*
	private void delete() {
		String usrid;
		List<GymVO> list = service.selectAll();
		if(list.size() == 0) {
			System.out.println("**회원이 없습니다.");
			return;
		}
		System.out.println("탈퇴 하시겠습니까?(Y/N)");
		usrid = keyin.next();
		if ( !(usrid.equals("Y") || usrid.equals("N"))){
			System.out.println("**작업이 취소되었습니다.");
			return;
		}
		usrid = null;
		System.out.println("탈퇴 완료되었습니다.");
	}

	// 전체 회원정보 출력
	private void findAll() {
		List<GymVO> list = service.selectAll();
		if(list.size() == 0) {
			System.out.println("**회원이 없습니다.");
			return;
		}
		Iterator<GymVO> iter = list.iterator();
		while(iter.hasNext()) {
			iter.next().output();
		}
		
	}
	
	// 전체 회원정보 수정
	private void update() {
		String usrid;
		double height, weight;
		
		System.out.println("* 아이디 : ");
		usrid = keyin.next();
		
		GymVO temp = service.selectOne(usrid);
		if(temp == null) {
			System.out.println("동일한 아이디가 존재합니다.");
			return;
		}
		temp.output();
		
		System.out.println("아이디 : ");
		usrid = keyin.next();
		
		System.out.println("키(cm) : ");
		height = keyin.nextDouble();
		
		System.out.println("몸무게(weight) : ");
		weight = keyin.nextDouble();
		
		GymVO vo = new GymVO(usrid, null, height, weight);
		boolean result = service.insert(vo);
		
		if(result) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 오류");
		}
		
	}
// 회원 조회
	private void findById() {
		String usrid;
		
		System.out.println("* 아이디 : ");
		usrid = keyin.next();
		
		GymVO vo = service.selectOne(usrid);
		if(vo == null) {
			System.out.println("** 해당 아이디의 회원은 업습니다.");
			return;
		}
		vo.output();
	}

	//회원 가입
	private void regist() {
		String usrid, usrname;
		double height, weight;
		
		System.out.println("* 아이디 : ");
		usrid = keyin.next();
		if(service.selectOne(usrid) != null) {
			System.out.println("동일한 아이디가 존재합니다.");
			return;//돌려보내기
		}
		
		System.out.println("* 이 름 : ");
		usrname = keyin.next();
		
		System.out.println("* 몸무게(kg) : ");
		weight = keyin.nextDouble();
		
		System.out.println("* 키(cm) : ");
		height = keyin.nextDouble();
		
		GymVO vo = new GymVO(usrid, usrname, height, weight);
		boolean result = service.insert(vo);
		
		if(result) {
			System.out.println("** 가입 완료");
		}else {
			System.out.println("** 가입 실패");
		}
	}*/
	//매뉴화면
	private void menu() {
		System.out.println("[피티니스클럽 회원관리]");
		System.out.println("     1. 등  록");
		System.out.println("     2. 조  회");
		System.out.println("     3. 정보수정 ");
		System.out.println("     4. 탈  퇴");
		System.out.println("     5. 전체출력 ");
		System.out.println("     0. 종  료 ");
		System.out.println("======================");
		System.out.println("      > 선택 : ");		
	}
	//입력, 삭제, 수정 조회. 전체출력
	
}


//}
