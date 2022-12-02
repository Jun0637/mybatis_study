package global.scit.member.dao;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import global.scit.member.vo.MemberInfo;
import global.scit.member.vo.Members;

public class MemberDAO {
	// 1) 접속한다
	SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

	// 2) 회원의 모든 목록
	public List<MemberInfo> selectAll() {
		SqlSession session = null;

		session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		List<MemberInfo> list = mapper.selectAll();

		return list;
	}

	// 3) 한 사람의 회원정보를 조회
	public MemberInfo selectOne(String usrid) {
		SqlSession session = null;

		session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		MemberInfo member = mapper.selectOne(usrid);

		return member;
	}

	// 모든 사람 정보 조회
	public List<MemberInfo> selectAll(String usrid) {
		SqlSession session = null;

		session = factory.openSession();
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		List<MemberInfo> member = mapper.selectAll();

		return member;

	}
	// 회원가입
	public int insertMember(Members m) {
		SqlSession session = null;
		session = factory.openSession();

		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int result = mapper.insertMember(m);

		session.commit();
		return result;
	}

	public int deleteMember(String usrid) {
		SqlSession session = null;
		session = factory.openSession();
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int result = mapper.deleteMember(usrid);
		
		session.commit();
		return result;
	}

	public int updateMember(Members ms) {
		SqlSession session = null;
		session = factory.openSession();
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int result = mapper.updateMember(ms);
		
		session.commit();
		return result;
	}

}
