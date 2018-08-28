package com.crmww.sale.model;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "sale_opptunity")
@NameStyle(Style.camelhumpAndUppercase)
public class OpportunityDTO extends BaseEntity{
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long opptId;

    private String opptName;

    private String sourceType;

    private Long sourceId;

    private String leadDetail;

    private String industryType;

    private String serviceCode;

    private Long teamId;

    private Long managerId;

    private String assignType;

    private Long partyId;

    private String customerName;

    private String customerType;

    private Long customerIndustry;

    private Long identificationType;

    private String identificationNumber;

    private String intention;

    private String customerSize;

    private String customerAddress;

    private Long productId;

    private String amount;

    private String contact;

    private String contactInformation;

    private String mobile;

    private String home;

    private String office;

    private String wechat;

    private Timestamp limitedDate;

    private String attachment;

    private String status;

    private String remark;

    private String qq;

    private String productName;

    private String industryName;

    private String managerName;

    private String devNumber;

    public Long getOpptId() {
        return opptId;
    }

    public void setOpptId(Long opptId) {
        this.opptId = opptId;
    }

    public String getOpptName() {
        return opptName;
    }

    public void setOpptName(String opptName) {
        this.opptName = opptName;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String getLeadDetail() {
        return leadDetail;
    }

    public void setLeadDetail(String leadDetail) {
        this.leadDetail = leadDetail;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getAssignType() {
        return assignType;
    }

    public void setAssignType(String assignType) {
        this.assignType = assignType;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Long getCustomerIndustry() {
        return customerIndustry;
    }

    public void setCustomerIndustry(Long customerIndustry) {
        this.customerIndustry = customerIndustry;
    }

    public Long getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(Long identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public String getCustomerSize() {
        return customerSize;
    }

    public void setCustomerSize(String customerSize) {
        this.customerSize = customerSize;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Timestamp getLimitedDate() {
        return limitedDate;
    }

    public void setLimitedDate(Timestamp limitedDate) {
        this.limitedDate = limitedDate;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getDevNumber() {
        return devNumber;
    }

    public void setDevNumber(String devNumber) {
        this.devNumber = devNumber;
    }
}
