package com.msm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msm.model.SampleFlow;
import com.msm.service.sample.service.ISampleService;

/**
 * 审签模块管理
 */
@Controller
@RequestMapping("/shenqian")
public class ShenqianController {

	@Autowired
	private ISampleService sampleService;

	/**
	 * 最终检验流程提交
	 */
	@RequestMapping(value = "/shenqianflowcommit", method = RequestMethod.GET)
	public String reportcommit(Model model) {
		model.addAttribute("pagers", sampleService.findSampleFlow());
		return "shenqian/list_sampleflow";
	}

	@RequestMapping(value = "/{sampleNo}/shenqianflowcommit", method = RequestMethod.GET)
	public String reportcommit(@PathVariable String sampleNo, Model model) {
		model.addAttribute(sampleService.loadBySampleFlowNo(sampleNo));
		return "shenqian/sampleflow_shenqian";
	}

	@RequestMapping(value = "/{sampleNo}/shenqianflowcommit", method = RequestMethod.POST)
	public String reportcommit(@PathVariable String sampleNo,
			@Validated SampleFlow sampleFlow, BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute(sampleFlow);
			return "shenqian/sampleflow_shenqian";
		}

		SampleFlow s = sampleService.loadBySampleFlowNo(sampleNo);
		s.setSampleNo(sampleFlow.getSampleNo());
		s.setSampleName(sampleFlow.getSampleName());
		s.setMianRev(sampleFlow.getMianRev());
		s.setMianSend(sampleFlow.getMianSend());
		s.setSecondRev(sampleFlow.getSecondRev());
		s.setSecondSend(sampleFlow.getSecondSend());
		s.setZhurenRev(sampleFlow.getZhurenRev());
		s.setZhurenSend(sampleFlow.getZhurenSend());
		s.setYwssqRev(sampleFlow.getYwssqRev());
		s.setYwssqSend(sampleFlow.getYwssqSend());
		s.setHeadRev(sampleFlow.getHeadRev());
		s.setHeadSend(sampleFlow.getHeadSend());
		s.setJiaoduiRev(sampleFlow.getJiaoduiRev());
		s.setJiaoduiSend(sampleFlow.getJiaoduiSend());
		s.setFachuRev(sampleFlow.getFachuRev());
		s.setFachuSend(sampleFlow.getFachuSend());
		s.setPrintRev(sampleFlow.getPrintRev());
		s.setPrintSend(sampleFlow.getPrintSend());
		sampleService.updateSampleFlow(s);

		return "redirect:/samplem/sampleflow";
	}

}