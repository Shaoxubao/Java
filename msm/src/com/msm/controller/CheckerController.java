package com.msm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msm.model.Sample;
import com.msm.service.checker.service.ICheckService;

/**
 * 检品检验人员管理模块
 */
@Controller
@RequestMapping("/check")
public class CheckerController {

	@Autowired
	private ICheckService checkService;

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
        System.out.println(sample.getIsChecked());
        s.setIsCheckPassed(sample.getIsCheckPassed());
        s.setReceiveDate(sample.getReceiveDate());
        s.setConclusionDate(sample.getConclusionDate());
        checkService.updateSample(s);

		return "redirect:/samplem/samples";
	}

	/**
	 * 查看检品的基本信息
	 */

	/**
	 * 查看检品的相关标准
	 */

	/**
	 * 查看有关的对照品信息
	 */

}
