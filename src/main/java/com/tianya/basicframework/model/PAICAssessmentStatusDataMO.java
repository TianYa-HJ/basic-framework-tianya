package com.tianya.basicframework.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: xuguangxing
 * @Date: 2019/9/24 15:42
 * @Description: 平安的定损单状态同步接口推送
 */
public class PAICAssessmentStatusDataMO implements Serializable {
    private static final long serialVersionUID = 5411649257139522725L;
    // 唯一流水号
    private String messageId;
    /**
     * ASSESSMENT_SUBMIT 定损提交
     * ASSESSMENT_BACK 核价退回
     * ASSESSMENT_PASS 核价通过
     * GUIDE_BACK   核损退回
     * GUIDE_PASS 核损通过
     * DOCUMENT_COLLECTION 单证收集完成
     * END_CASE 结案
     * CANCEL_CASE 注销
     */
    private String notificationType;
    // 报案号
    private String reportNo;
    // 上汽定损单号
    private String insaicAssessmentNo;
    // 定损单号
    private String assessmentNo;
    // 保险公司代码
    private String insurer;
    // 车牌号
    private String plateNo;
    // 车架号
    private String vin;
    /**
     * 2:立案
     * 3:结案
     * 4:注销
     * 6:零结案
     * 7:拒赔
     * END_CASE 结案，
     * CANCEL_CASE 注销传该案件状态
     */
    private String caseStatus;
    /**
     * 2 估损单状态 -定损提交
     * 7 估损单状态 - 核损通过
     * 8 估损单状态 - 核损退回
     * 录入定损单后才会返回此状态，仅针对通知场景为定损提交、核损通过、核损退回时
     */
    private String assessmentStatus;
    // 操作员代码
    private String operatePersonCode;
    // 操作员名称
    private String operatePersonName;
    // 状态变更备注
    private String operateReason;
    // 操作时间
    private Date operatingTime;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    public String getInsaicAssessmentNo() {
        return insaicAssessmentNo;
    }

    public void setInsaicAssessmentNo(String insaicAssessmentNo) {
        this.insaicAssessmentNo = insaicAssessmentNo;
    }

    public String getAssessmentNo() {
        return assessmentNo;
    }

    public void setAssessmentNo(String assessmentNo) {
        this.assessmentNo = assessmentNo;
    }

    public String getInsurer() {
        return insurer;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getAssessmentStatus() {
        return assessmentStatus;
    }

    public void setAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    public String getOperatePersonCode() {
        return operatePersonCode;
    }

    public void setOperatePersonCode(String operatePersonCode) {
        this.operatePersonCode = operatePersonCode;
    }

    public String getOperatePersonName() {
        return operatePersonName;
    }

    public void setOperatePersonName(String operatePersonName) {
        this.operatePersonName = operatePersonName;
    }

    public String getOperateReason() {
        return operateReason;
    }

    public void setOperateReason(String operateReason) {
        this.operateReason = operateReason;
    }

    public Date getOperatingTime() {
        return operatingTime;
    }

    public void setOperatingTime(Date operatingTime) {
        this.operatingTime = operatingTime;
    }
}
