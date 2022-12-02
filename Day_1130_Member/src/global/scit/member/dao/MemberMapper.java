package global.scit.member.dao;

import java.util.List;

import global.scit.member.vo.Addr;
import global.scit.member.vo.MemberInfo;
import global.scit.member.vo.Members;

public interface MemberMapper {
	public int insertMember(Members member);
	public int insertAddr(Addr addr);
	public MemberInfo selectOne(String usrid);
	public List<MemberInfo> selectAll();
	public int updateMember(Members member);
	public int deleteMember(String usrid);
}
