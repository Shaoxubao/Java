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
 * 校对管理模块
 */
@Controller
@RequestMapping("/jiaodui")
public class JiaoduiController {

	@Autowired
	private ISampleService sampleService;

	/**
	 * 校对检验流程提交
	 */
	@RequestMapping(value = "/jiaoduiflowcommit", method = RequestMethod.GET)
	public String reportcommit(Model model) {
		model.addAttribute("pagers", sampleService.findSampleFlow());
		return "jiaodui/list_sampleflow";
	}

	@RequestMapping(value = "/{sampleNo}/jiaoduiflowcommit", method = RequestMethod.GET)
	public String reportcommit(@PathVariable String sampleNo, Model model) {
		model.addAttribute(sampleService.loadBySampleFlowNo(sampleNo));
		return "jiaodui/sampleflow_jiaodui";
	}

	@RequestMapping(value = "/{sampleNo}/jiaoduiflowcommit", method = RequestMethod.POST)
	public String reportcommit(@PathVariable String sampleNo,
			@Validated SampleFlow sampleFlow, BindingResult br, Model model) {
		if (br.hasErrors()) {
			model.addAttribute(sampleFlow);
			return "jiaodui/sampleflow_jiaodui";
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
