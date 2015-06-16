package com.msm.service.checker.service;

import com.msm.model.Pager;
import com.msm.model.ReportResult;
import com.msm.model.Sample;

public interface ICheckService {

	public void updateSample(Sample sample);

	public Pager<Sample> find();

	public Sample loadBySampleName(String samplenName);

    public Sample loadBySampleNo(String sampleNo);

    public Pager<ReportResult> findReport();

    public void addReport(ReportResult reportResult);

}
