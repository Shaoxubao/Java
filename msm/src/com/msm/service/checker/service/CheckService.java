package com.msm.service.checker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msm.dao.checker.dao.ICheckDao;
import com.msm.model.Pager;
import com.msm.model.Sample;

@Service("checkService")
public class CheckService implements ICheckService {

	@Autowired
	private ICheckDao checkDao;

	@Override
	public Pager<Sample> find() {
		return checkDao.find();
	}

	@Override
	public Sample loadBySampleName(String samplenName) {
		return checkDao.loadBySampleName(samplenName);
	}

	@Override
	public Sample loadBySampleNo(String sampleNo) {
		return checkDao.loadBySampleNo(sampleNo);
	}

	@Override
	public void updateSample(Sample sample) {
		checkDao.updateSample(sample);
	}

}
