package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dao.EmployeesDAO;
import dao.MybatisConfig;

public class Main {

	public static void main(String[] args) {
		SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		EmployeesDAO dao = session.getMapper(EmployeesDAO.class);

		List<EmployeesDAO> list = dao.selectAll();
		
		for(EmployeesDAO employees : list) {
			System.out.println(employees);
		}
	}

}