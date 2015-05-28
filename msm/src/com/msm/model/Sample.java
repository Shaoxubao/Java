package com.msm.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 检品
 */
@Entity
@Table(name = "t_sample")
public class Sample {

    private int sampleId;         // 检品Id
    private String sampleNo;      // 检品编号（主码）
    private String sampleName;    // 检品名称
    private String sampleKind;    // 检品种类
    private String mianSection;   // 主检科室
    private String secondSection; // 会检科室
    private String produce;       // 生产单位或产地
    private String specs;         // 规格
    private String amount;        // 检品数量
    private String isChecked;     // 是否被检查过
    private String isCheckPassed; // 是否通过检查
    private String receiveDate;     // 收检日期
    private String conclusionDate;  // 报告日期

    @NotNull(message="检品Id号不能为空！")
    @GeneratedValue
    @Id
    public int getSampleId() {
        return sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    @NotEmpty(message="检品编码不能为空！")
    public String getSampleNo() {
        return sampleNo;
    }

    public void setSampleNo(String sampleNo) {
        this.sampleNo = sampleNo;
    }

    @NotEmpty(message="检品名不能为空！")
    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    @NotEmpty(message="检品种类不能为空！")
    public String getSampleKind() {
        return sampleKind;
    }

    public void setSampleKind(String sampleKind) {
        this.sampleKind = sampleKind;
    }

    @NotEmpty(message="检品主检不能为空！")
    public String getMianSection() {
        return mianSection;
    }

    public void setMianSection(String mianSection) {
        this.mianSection = mianSection;
    }
    
    @NotEmpty(message="检品是否被检查！")
    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    @NotEmpty(message="检品是否被检查通过！")
    public String getIsCheckPassed() {
        return isCheckPassed;
    }

    public void setIsCheckPassed(String isCheckPassed) {
        this.isCheckPassed = isCheckPassed;
    }

    @NotEmpty(message="检品会检不能为空！")
    public String getSecondSection() {
        return secondSection;
    }

    public void setSecondSection(String secondSection) {
        this.secondSection = secondSection;
    }

    @NotEmpty(message="检品生产地不能为空！")
    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    @NotEmpty(message="检品规格不能为空！")
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @NotEmpty(message="检品数量不能为空！")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @NotEmpty(message="检品收检日期不能为空！")
    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    @NotEmpty(message="检品报告日期不能为空！")
    public String getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(String conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    @Override
    public String toString() {
        return "Sample [sampleId=" + sampleId + ", sampleNo=" + sampleNo + ", sampleName=" + sampleName
               + ", sampleKind=" + sampleKind + ", mianSection=" + mianSection + ", secondSection=" + secondSection
               + ", produce=" + produce + ", specs=" + specs + ", amount=" + amount + ", isChecked=" + isChecked
               + ", isCheckPassed=" + isCheckPassed + ", receiveDate=" + receiveDate + ", conclusionDate="
               + conclusionDate + "]";
    }
}