package org.iclass.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.vo.Community;

@Mapper
public interface CommunityMapper {
	int insert(Community vo);
	int update(Community vo);
	int delete(long idx);
	Community selectByIdx(long idx);
	int count();
	long setReadCount();
	long commentsCount(long mref);
	int maxOf();
	List<Community> list();
}
