package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.dao.BaseDictDao;
import com.hk.po.BaseDict;

@Service
public class BaseDictService {
   
	@Autowired
	private BaseDictDao baseDictDao;
	//根据类别代码查询数据字典
	
	public List<BaseDict> findBaseDictByTypeCode(String typecode) {
		return baseDictDao.selectBaseDictByTypeCode(typecode);
	}
}
