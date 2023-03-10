package org.iclass.app;

import org.iclass.dao.CommunityMapper;
import org.iclass.dao.NewMemberMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class MybatisApp {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
		CommunityMapper dao = context.getBean(CommunityMapper.class);
		log.info("CommunityMapper bean의 클래스 이름 - {}",dao.getClass().getName());
		NewMemberMapper dao2 = context.getBean(NewMemberMapper.class);
		log.info("NewMemberMapper bean의 클래스 이름 - {}",dao2.getClass().getName());
		((AbstractApplicationContext)context).close();
	}
}
