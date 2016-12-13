package com.yujian.IceServer.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yujian.IceServer.demo.bean.ZBType;

@Mapper
public interface ZBTypeDao {

	ZBType getZBTypeById(@Param("id")Long id);
}
