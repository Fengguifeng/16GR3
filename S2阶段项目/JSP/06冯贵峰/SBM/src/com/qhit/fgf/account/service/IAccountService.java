package com.qhit.fgf.account.service;

import java.util.List;

import com.qhit.fgf.common.bean.PageBean;
import com.qhit.fgf.goods.bean.Goods;

public interface IAccountService {
	
	/**
	 * @param pageBean
	 * @return
	 * 分页
	 */
	public PageBean getPageBean(PageBean pageBean);
	
	/**
	 * @param goods
	 * @param businessNum
	 * @param providerId
	 * @param isPayed
	 * @return
	 * 添加账单
	 */
	int addAccount(Goods goods,int businessNum,int providerId,int isPayed);
	
	/**
	 * @param wheres
	 * @param values
	 * @return
	 * 根据参数查询
	 */
	PageBean getPageBeanByParam(List<String> wheres,List<String> values);
	
	/**
	 * @param accountId
	 * @return
	 * 删除账单
	 */
	int delAccount(int accountId);
	
	/**
	 * @param accountId
	 * @param providerId
	 * @param isPayed
	 * @return
	 * 更新
	 */
	int upDateAccountById(int accountId,int providerId,int isPayed);
}