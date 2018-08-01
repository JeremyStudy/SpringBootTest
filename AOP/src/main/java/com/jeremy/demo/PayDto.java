package com.jeremy.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

@Document(collection = "Pay")
public class PayDto {

    public PayDto() {
    }



    @Id
    private String payId = null;

    @Indexed
    private String orderId = null;

    private String sccbaPrePay = null;

    private String payType = null;

    private String merId = null;

    private String userAck = null;

    private String tn = null;

    private String orderDesc = null;

    private String payAmt = null;

    private String submerId = null;

    private OffsetDateTime payTime = null;

    private String payTimeOut = null;


    private java.math.BigDecimal payStatus = null;

    private LocalDate settleDate = null;

    private OffsetDateTime paySucessTime = null;

    private String checkStatus = null;

    private String clearStatus = null;

    private String useful = null;
    
    private String sccbaReturnUrl = null;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSccbaPrePay() {
        return sccbaPrePay;
    }

    public void setSccbaPrePay(String sccbaPrePay) {
        this.sccbaPrePay = sccbaPrePay;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getUserAck() {
        return userAck;
    }

    public void setUserAck(String userAck) {
        this.userAck = userAck;
    }

    public String getTn() {
        return tn;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(String payAmt) {
        this.payAmt = payAmt;
    }

    public String getSubmerId() {
        return submerId;
    }

    public void setSubmerId(String submerId) {
        this.submerId = submerId;
    }

    public OffsetDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(OffsetDateTime payTime) {
        this.payTime = payTime;
    }

    public String getPayTimeOut() {
        return payTimeOut;
    }

    public void setPayTimeOut(String payTimeOut) {
        this.payTimeOut = payTimeOut;
    }

    public java.math.BigDecimal getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(java.math.BigDecimal payStatus) {
        this.payStatus = payStatus;
    }

    public LocalDate getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(LocalDate settleDate) {
        this.settleDate = settleDate;
    }

    public OffsetDateTime getPaySucessTime() {
        return paySucessTime;
    }

    public void setPaySucessTime(OffsetDateTime paySucessTime) {
        this.paySucessTime = paySucessTime;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getClearStatus() {
        return clearStatus;
    }

    public void setClearStatus(String clearStatus) {
        this.clearStatus = clearStatus;
    }

    public String getUseful() {
        return useful;
    }

    public void setUseful(String useful) {
        this.useful = useful;
    }

    public String getSccbaReturnUrl() {
        return sccbaReturnUrl;
    }

    public void setSccbaReturnUrl(String sccbaReturnUrl) {
        this.sccbaReturnUrl = sccbaReturnUrl;
    }


}
