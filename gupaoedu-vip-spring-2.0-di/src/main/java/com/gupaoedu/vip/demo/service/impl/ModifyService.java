package com.gupaoedu.vip.demo.service.impl;

import com.gupaoedu.vip.demo.service.IAddService;
import com.gupaoedu.vip.demo.service.IModifyService;
import com.gupaoedu.vip.demo.service.IQueryService;
import com.gupaoedu.vip.spring.framework.annotation.GPAutowired;
import com.gupaoedu.vip.spring.framework.annotation.GPService;

/**
 * 增删改业务
 * @author Tom
 *
 */
@GPService
public class ModifyService implements IModifyService {

	@GPAutowired private IQueryService queryService;
	@GPAutowired private IAddService addService;


	/**
	 * 增加
	 */

	public String add(String name,String addr) {
		// 开启事务
//		insert into aa()
		return "modifyService add,name=" + name + ",addr=" + addr;
		// 提交事务
	}


	/**
	 * 修改
	 */
	public String edit(Integer id,String name) {
		return "modifyService edit,id=" + id + ",name=" + name;
	}

	/**
	 * 删除
	 */
	public String remove(Integer id) {
		return "modifyService id=" + id;
	}
	
}
