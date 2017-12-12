package com.qhit.fgf.common.service;

import java.util.List;

import com.qhit.fgf.common.dao.CommonDao;

public class CommonService implements ICommonService {

	@Override
	public int getCount(String tableName, List<String> wheres, List<String> values) {
		return new CommonDao().getCount(tableName, wheres, values);
	}
	
}
