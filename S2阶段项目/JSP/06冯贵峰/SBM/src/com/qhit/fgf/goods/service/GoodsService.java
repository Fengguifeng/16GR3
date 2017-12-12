package com.qhit.fgf.goods.service;

import com.qhit.fgf.goods.bean.Goods;
import com.qhit.fgf.goods.dao.GoodsDao;

public class GoodsService implements IGoodsService {

	@Override
	public Goods getGoodsInfoByName(String goodsName) {
		// TODO Auto-generated method stub
		return new GoodsDao().getGoodsInfoByName(goodsName);
	}

	@Override
	public int updateStore(int num, int goodsId) {
		// TODO Auto-generated method stub
		return new GoodsDao().updateStore(num, goodsId);
	}
	
	
}
