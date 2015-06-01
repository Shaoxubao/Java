package com.msm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 对照品登记
 */
@Entity
@Table(name = "t_reference")
public class ReferenceReg {

	private int referenId;       // 对照品Id（主键）
	private String referenNo;    // 对照品编号
	private String referenName;  // 对照品名称
	private String referenSpecs; // 对照品规格
	private String amount;       // 对照品数量
	private String source;       // 对照品来源
	private String receiver;     // 接收者
	private String revceiveDate; // 接收日期
	private String checker;      // 审核人
	private String checkDate;    // 审核日期

	 @NotNull(message="对照品Id号不能为空！")
	 @GeneratedValue
	 @Id
	public int getReferenId() {
		return referenId;
	}

	public void setReferenId(int referenId) {
		this.referenId = referenId;
	}

	@NotEmpty(message="对照品编码不能为空！")
	public String getReferenNo() {
		return referenNo;
	}

	public void setReferenNo(String referenNo) {
		this.referenNo = referenNo;
	}

	@NotEmpty(message="对照品名称不能为空！")
	public String getReferenName() {
		return referenName;
	}

	public void setReferenName(String referenName) {
		this.referenName = referenName;
	}

	public String getReferenSpecs() {
		return referenSpecs;
	}

	public void setReferenSpecs(String referenSpecs) {
		this.referenSpecs = referenSpecs;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getRevceiveDate() {
		return revceiveDate;
	}

	public void setRevceiveDate(String revceiveDate) {
		this.revceiveDate = revceiveDate;
	}

	public String getChecker() {
		return checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	@Override
	public String toString() {
		return "ReferenceReg [referenId=" + referenId + ", referenNo="
				+ referenNo + ", referenName=" + referenName
				+ ", referenSpecs=" + referenSpecs + ", amount=" + amount
				+ ", source=" + source + ", receiver=" + receiver
				+ ", revceiveDate=" + revceiveDate + ", checker=" + checker
				+ ", checkDate=" + checkDate + "]";
	}

}
