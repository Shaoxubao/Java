package com.msm.service.sample.service;

import java.util.List;

import com.msm.model.Pager;
import com.msm.model.Sample;

public interface ISampleService {
    public void addSample(Sample sample);
    public void updateSample(Sample sample);
    public void deleteSample(int id);
    public Sample load(int id);
    public List<Sample> list();
    public Pager<Sample> find();

    public Sample loadBySampleName(String samplenName);
    public Sample loadBySampleNo(String sampleNo);

    public Pager<Sample> findByCheckConditionsF(String condition);
    public Pager<Sample> findByCheckConditionsT(String condition);

    public Pager<Sample> findByPassConditionsT(String condition);
    public Pager<Sample> findByPassConditionsF(String condition);
}
