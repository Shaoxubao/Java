package com.msm.dao.support.dao;

import com.msm.model.Pager;
import com.msm.model.ReferenceReg;

public interface ISupportDao {
	public void add(ReferenceReg reference);

	public Pager<ReferenceReg> find();
}
