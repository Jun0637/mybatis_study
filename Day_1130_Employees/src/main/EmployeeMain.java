package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dao.EmployeeMapper;
import dao.MybatisConfig;
import vo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// 1) 접속한다
		SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
		// 2) 세션을 오픈한다
		SqlSession session = factory.openSession();
		
		// 3) 매퍼인터페이스를 통해 데이터를 주고받을수 있도록 준비
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		
		// 4) 쿼리문을 동작시킨다.
		/*
		int empid = 100;
		Employee emp = mapper.selectOne(empid);
		
		if(emp != null)
			System.out.println(emp);
		else
			System.out.println("그런 직원 없어요");
		*/
		//4-2) 전체 직원 명단을 질의하는 쿼리를 동작 시킨다.(selectAll)
		
		int deptno = 110;
		List<Employee> list = mapper.selectByDepartment(deptno);
		
		if(list.size() !=0) {
			for(Employee e : list)
				System.out.println(e);
		} else {
			System.out.println(deptno + "번 부서는 없는습니다.");
		}
	}

}
