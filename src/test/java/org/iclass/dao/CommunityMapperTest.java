package org.iclass.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.iclass.vo.Community;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;
@DisplayName("CommunityMapper 구현체 생성확인")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/applicationContext.xml")
@Slf4j
class CommunityMapperTest {
	
	@Autowired
	private ApplicationContext context;
	@Autowired
	private CommunityMapper dao;
	
	@DisplayName("context, dao bean 생성 확인")
	@Test
	void bean() {
		log.info("dao의 구현체 - {}",dao.getClass().getName());
		assertNotNull(dao);
		assertNotNull(context);
	}
	
	@DisplayName("list로 가져오는 개수와 count 함수 결과는 같아야 한다.")
	@Test
	void list() {
		List<Community>list = dao.list();
		int size = list.size();
		assertEquals(dao.count(), size);
	}

}
