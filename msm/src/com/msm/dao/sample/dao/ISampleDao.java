package com.msm.dao.sample.dao;

import java.util.List;

import com.msm.model.Pager;
import com.msm.model.Sample;
import com.msm.model.SampleFlow;

public interface ISampleDao {
    public void addSample(Sample sample);
    public void updateSample(Sample sample);
    public void deleteSample(int id);
    public Sample load(int id);
    public List<Sample> list();
    public Pager<Sample> find();

    public Pager<SampleFlow> findSampleFlow();
    public void addsampleflow(SampleFlow sampleFlow);
    public SampleFlow loadBySampleFlowNo(String sampleNo);
    public void updateSampleFlow(SampleFlow sampleFlow);

    public Sample loadBySampleName(String samplenName);
    public Sample loadBySampleNo(String sampleNo);

    public Pager<Sample> findByCheckConditionsF(String condition);
    public Pager<Sample> findByCheckConditionsT(String condition);

    public Pager<Sample> findByPassConditionsT(String condition);
    public Pager<Sample> findByPassConditionsF(String condition);
}
