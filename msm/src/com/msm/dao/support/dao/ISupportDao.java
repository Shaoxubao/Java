package com.msm.dao.support.dao;

import com.msm.model.Pager;
import com.msm.model.ReferenceReg;

public interface ISupportDao {
	public void add(ReferenceReg reference);

	public ReferenceReg load(int id);

	public void delete(int id);

	public Pager<ReferenceReg> find();

	public ReferenceReg loadByRefId(String refId);
}
