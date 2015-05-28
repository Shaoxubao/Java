package com.msm.service.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msm.dao.sample.dao.ISampleDao;
import com.msm.model.Pager;
import com.msm.model.Sample;

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

}
