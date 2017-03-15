package com.ittx.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ittx.car.dao.CarDao;
import com.ittx.car.model.Car;

public class CarDaoTest {

	@Test
	public void testGetUserLists() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CarDao carDao = (CarDao) ctx.getBean("carDao");
		List<Car> lists = carDao.getAllStudent();
		System.out.println(">>>>" + lists.size());
		for (Car user : lists) {
			System.out.println(user);
		}

	}

}
