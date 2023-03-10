package org.iclass.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.vo.NewMember;

@Mapper
public interface NewMemberMapper {
	int insert(NewMember vo);
	int update(NewMember vo);
	int delete(String id);
	List<NewMember> selectAll();
	NewMember selectOne(String id);
}
