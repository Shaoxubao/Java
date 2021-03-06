package com.msm.service.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msm.dao.sample.dao.ISampleDao;
import com.msm.model.Pager;
import com.msm.model.Sample;
import com.msm.model.SampleFlow;

@Service("sampleService")
public class SampleService implements ISampleService {

    @Autowired
    private ISampleDao sampleDao;

    @Override
    public void addSample(Sample sample) {
        sampleDao.addSample(sample);
    }

    @Override
    public void updateSample(Sample sample) {
        sampleDao.updateSample(sample);
    }

    @Override
    public void deleteSample(int id) {
        sampleDao.deleteSample(id);
    }

    @Override
    public Sample load(int id) {
        return sampleDao.load(id);
    }

    @Override
    public List<Sample> list() {
        return sampleDao.list();
    }

    @Override
    public Pager<Sample> find() {
        return sampleDao.find();
    }

    @Override
    public Sample loadBySampleName(String samplenName) {
        return sampleDao.loadBySampleName(samplenName);
    }

    @Override
    public Sample loadBySampleNo(String sampleNo) {
        return sampleDao.loadBySampleNo(sampleNo);
    }

	@Override
	public Pager<Sample> findByCheckConditionsF(String condition) {
		return sampleDao.findByCheckConditionsF(condition);
	}

	@Override
	public Pager<Sample> findByCheckConditionsT(String condition) {
		return sampleDao.findByCheckConditionsT(condition);
	}

	@Override
	public Pager<Sample> findByPassConditionsT(String condition) {
		return sampleDao.findByPassConditionsT(condition);
	}

	@Override
	public Pager<Sample> findByPassConditionsF(String condition) {
		return sampleDao.findByPassConditionsF(condition);
	}

	@Override
	public Pager<SampleFlow> findSampleFlow() {
		return sampleDao.findSampleFlow();
	}

	@Override
	public void addsampleflow(SampleFlow sampleFlow) {
		sampleDao.addsampleflow(sampleFlow);
	}

	@Override
	public SampleFlow loadBySampleFlowNo(String sampleNo) {
		return sampleDao.loadBySampleFlowNo(sampleNo);
	}

	@Override
	public void updateSampleFlow(SampleFlow sampleFlow) {
		sampleDao.updateSampleFlow(sampleFlow);
	}

}
