package com.hk.dao;
/*
 * 数据字典
 */

import java.util.List;

import com.hk.po.BaseDict;

public interface BaseDictDao {
  //根据类别代码查询数据字典
	public List<BaseDict> selectBaseDictByTypeCode(String typecode);
	
}
