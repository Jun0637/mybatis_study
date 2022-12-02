package global.scit.member.service;

import java.util.List;

import global.scit.member.dao.MemberDAO;
import global.scit.member.vo.MemberInfo;
import global.scit.member.vo.Members;

public class MemberService {
	MemberDAO dao = new MemberDAO();

	public MemberInfo findById(String usrid) {
		MemberInfo info = dao.selectOne(usrid);
		return info;
	}

	public List<MemberInfo> findAll() {

		return dao.selectAll();
	}

	public int insertMember(Members m) {
		int result = dao.insertMember(m);
		return result;
	}

	public int deleteMember(String usrid) {
		int result = dao.deleteMember(usrid);
		return result;
	}

	public int updateMember(Members ms) {
		int result = dao.updateMember(ms);
		return result;
	}

}
