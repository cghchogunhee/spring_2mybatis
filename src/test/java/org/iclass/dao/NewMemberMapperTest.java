package org.iclass.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.iclass.vo.NewMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;
@DisplayName("NewMemberMapper 구현체 생성확인")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/applicationContext.xml")
@Slf4j
class NewMemberMapperTest {
	
	@Autowired
	private ApplicationContext context;
	@Autowired
	private NewMemberMapper dao;
	
	@DisplayName("NewMemberMapper context, dao bean 생성 확인")
	@Test
	void bean() {
		log.info("NewMemberMapper dao의 구현체 - {}",dao.getClass().getName());
		assertNotNull(dao);
		assertNotNull(context);
	}
	
	@DisplayName("list는 4개이다.")
	@Test
	void list() {
		assertEquals(dao.selectAll().size(),4);
	}
	@DisplayName("모모가 있는지 확인")
	@Test
	void selectById() {
		assertNotNull(dao.selectOne("momo"));
	}
	@DisplayName("insert 확인")
	@Test
	void insert() {
		NewMember vo = NewMember.builder()
				.id("abcd")
				.name("test")
				.password("1234")
				.email("test.com")
				.age(23)
				.gender("1")
				.hobbies("야구")
				.build();
		int a = dao.insert(vo);
		assertEquals(1, a);
	}
	@DisplayName("update 확인")
	@Test
	void update() {
		NewMember vo = NewMember.builder()
				.id("momo")
				.email("test.com.test")
				.hobbies("댄스")
				.build();
		int a = dao.update(vo);
		assertEquals(1, a);
	}
	@DisplayName("delete 확인")
	@Test
	void delete() {
		int a = dao.delete("yioop38");
		assertEquals(1, a);
	}
}
