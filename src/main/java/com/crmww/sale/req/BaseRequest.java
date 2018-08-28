package com.crmww.sale.req;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public abstract class BaseRequest implements Serializable{

    /**
     * 请求号,每次请求都应该分配一个唯一的请求号
     */
	@NotNull(message="请求编码不能为空")
	@ApiModelProperty(required=false, value="唯一请求号", example = "1233234")
    private String reqNo;

    /**
     * 当前请求的时间戳
     */
	@NotNull
	@ApiModelProperty(required=false, value="当前请求的时间戳", example = "12435354")
    private int reqTime;

 
    /**
     * 请求来源渠道
     * 1 
     * 2 
     * 3 微信公众号
     */
	@NotNull
	@ApiModelProperty(required=true, value="请求来源[1:PC,2:IOS,3:android]", example = "999")
    private Short reqChannelId;
	
	/**
	 * 用户IP
	 */
	@NotNull
	@ApiModelProperty(required=true, value="用户ip", example="127.0.0.1")
	private String reqUserIp;
	
	/**
     * 登录ssesionid
     */
	@ApiModelProperty(required = false, value = "sessionId", example = "12312431241")
	private String sessionId;

    public BaseRequest() {
        this.setReqTime((int)(System.currentTimeMillis() / 1000));
//        this.setReqNo(UUIDUtil.getUUID());
        this.setReqUserIp("0.0.0.0");
       
    }

    public int getReqTime() {
		return reqTime;
	}

	public void setReqTime(int reqTime) {
		this.reqTime = reqTime;
	}

	public Short getReqChannelId() {
		return reqChannelId;
	}

	public void setReqChannelId(Short reqChannelId) {
		this.reqChannelId = reqChannelId;
	}

	public String getReqUserIp() {
		return reqUserIp;
	}

	public void setReqUserIp(String reqUserIp) {
		this.reqUserIp = reqUserIp;
	}

	public String getReqNo() {
        return reqNo;
    }

    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }
    
    public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}


	@Override
	public String toString() {
		return "BaseRequest [reqNo=" + reqNo + ", reqTime=" + reqTime
				+ ", reqChannelId=" + reqChannelId + ", reqUserIp=" + reqUserIp
				+ "]";
	}
  
}
