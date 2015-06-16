package com.msm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msm.model.ReportResult;
import com.msm.model.Sample;
import com.msm.model.SampleFlow;
import com.msm.service.checker.service.ICheckService;
import com.msm.service.sample.service.ISampleService;

/**
 * 检品检验人员管理模块
 */
@Controller
@RequestMapping("/check")
public class CheckerController {

	@Autowired
	private ICheckService checkService;

	@Autowired
    private ISampleService sampleService;

	/**
	 * 进行检验记录的提交
	 */
	@RequestMapping(value="/commit", method=RequestMethod.GET)
	public String checkCommit(Model model) {
		model.addAttribute("pagers", checkService.find());
		return "checker/commit_list";
	}

	@RequestMapping(value="/{sampleNo}/commit", method=RequestMethod.GET)
	public String checkCommit(@PathVariable String sampleNo, Model model) {
		model.addAttribute(checkService.loadBySampleNo(sampleNo));
		return "checker/commit_result";
	}

	@RequestMapping(value="/{sampleNo}/commit", method=RequestMethod.POST)
	public String checkCommit(@PathVariable String sampleNo, @Validated Sample sample, BindingResult br, Model  model) {
		if (br.hasErrors()) {
            model.addAttribute(sample);
            return "checker/commit_result";
        }

		Sample s = checkService.loadBySampleNo(sampleNo);
        s.setSampleNo(sample.getSampleNo());
        s.setSampleName(sample.getSampleName());
        s.setSampleKind(sample.getSampleKind());
        s.setMianSection(sample.getMianSection());
        s.setSecondSection(sample.getSecondSection());
        s.setProduce(sample.getProduce());
        s.setSpecs(sample.getSpecs());
        s.setAmount(sample.getAmount());
        s.setIsChecked(sample.getIsChecked());
        s.setIsCheckPassed(sample.getIsCheckPassed());
        s.setReceiveDate(sample.getReceiveDate());
        s.setConclusionDate(sample.getConclusionDate());
        checkService.updateSample(s);

		return "redirect:/samplem/samples";
	}

	/**
	 * 检验流程提交
	 */
	@RequestMapping(value="/sampleflowcommit", method=RequestMethod.GET)
	public String sampleflowcommit(Model model) {
		model.addAttribute("pagers", sampleService.findSampleFlow());
		return "checker/list_sampleflow";
	}

	@RequestMapping(value="/{sampleNo}/sampleflowcommit", method=RequestMethod.GET)
	public String sampleflowcommit(@PathVariable String sampleNo, Model model) {
				model.addAttribute(sampleService.loadBySampleFlowNo(sampleNo));
		return "checker/sampleflow_result";
	}

	@RequestMapping(value="/{sampleNo}/sampleflowcommit", method=RequestMethod.POST)
	public String sampleflowcommit(@PathVariable String sampleNo, @Validated SampleFlow sampleFlow, BindingResult br, Model  model) {
		if (br.hasErrors()) {
			model.addAttribute(sampleFlow);
			return "checker/sampleflow_result";
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

	/**
	 * 检验报告注册
	 */
	@RequestMapping(value="/addreport", method=RequestMethod.GET)
	public String addreport(Model model) {
		model.addAttribute(new ReportResult());
		return "checker/add_report";
	}

	@RequestMapping(value="/addreport", method=RequestMethod.POST)
    public String addSample(@Validated ReportResult reportResult, BindingResult br) {
        if (br.hasErrors()) {
            return "checker/add_report";
        }

        System.out.println(reportResult);
        checkService.addReport(reportResult);
        return "redirect:/check/listreport";
    }

	/**
     * 所有报告列表
     */
    @RequestMapping(value="/listreport", method=RequestMethod.GET)
    public String listreport(Model model) {
        model.addAttribute("pagers", checkService.findReport());
        return "checker/list_report";
    }

}
