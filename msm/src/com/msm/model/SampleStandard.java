package com.msm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 样品标准表
 */
@Entity
@Table(name = "t_standard")
public class SampleStandard {
	private int sampleId;           // 检品Id（主键）
	private String sampleNo;        // 检品编号
	private String sampleName;      // 检品名称
	private String samplePurity;    // 检品纯度
	private String sampleComponent; // 检品成分
	private String sampleEffect;    // 检品成效
	private String toxicity;        // 毒副作用
	private String pyrogenDegrees;  // 热原度
	private String sterility;       // 无菌度
	private String phyProperty;     // 物理化学性质
	private String impurity;        // 杂质

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

	@NotEmpty(message="检品名称不能为空！")
	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getSamplePurity() {
		return samplePurity;
	}

	public void setSamplePurity(String samplePurity) {
		this.samplePurity = samplePurity;
	}

	public String getSampleComponent() {
		return sampleComponent;
	}

	public void setSampleComponent(String sampleComponent) {
		this.sampleComponent = sampleComponent;
	}

	public String getSampleEffect() {
		return sampleEffect;
	}

	public void setSampleEffect(String sampleEffect) {
		this.sampleEffect = sampleEffect;
	}

	public String getToxicity() {
		return toxicity;
	}

	public void setToxicity(String toxicity) {
		this.toxicity = toxicity;
	}

	public String getPyrogenDegrees() {
		return pyrogenDegrees;
	}

	public void setPyrogenDegrees(String pyrogenDegrees) {
		this.pyrogenDegrees = pyrogenDegrees;
	}

	public String getSterility() {
		return sterility;
	}

	public void setSterility(String sterility) {
		this.sterility = sterility;
	}

	public String getPhyProperty() {
		return phyProperty;
	}

	public void setPhyProperty(String phyProperty) {
		this.phyProperty = phyProperty;
	}

	public String getImpurity() {
		return impurity;
	}

	public void setImpurity(String impurity) {
		this.impurity = impurity;
	}

	@Override
	public String toString() {
		return "SampleStandard [sampleId=" + sampleId + ", sampleNo="
				+ sampleNo + ", sampleName=" + sampleName + ", samplePurity="
				+ samplePurity + ", sampleComponent=" + sampleComponent
				+ ", sampleEffect=" + sampleEffect + ", toxicity=" + toxicity
				+ ", pyrogenDegrees=" + pyrogenDegrees + ", sterility="
				+ sterility + ", phyProperty=" + phyProperty + ", impurity="
				+ impurity + "]";
	}

}
