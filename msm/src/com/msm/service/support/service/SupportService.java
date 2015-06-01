package com.msm.service.support.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msm.dao.support.dao.ISupportDao;
import com.msm.model.Pager;
import com.msm.model.ReferenceReg;

@Service("supportService")
public class SupportService implements ISupportService {

	@Autowired
	private ISupportDao supportDao;

	@Override
	public void addReference(ReferenceReg reference) {
		supportDao.add(reference);
	}

	@Override
	public Pager<ReferenceReg> find() {
		return supportDao.find();
	}

}
