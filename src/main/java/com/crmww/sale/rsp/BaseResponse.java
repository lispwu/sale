package com.crmww.sale.rsp;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable{
	private String code;
	
	private String message;

	/**
	 * 请求号,每次请求都应该分配一个唯一的请求号,请求返回时,将该号码返回
	 */
	private String reqNo;
	
	private T messageBody;

	public BaseResponse() {}

	public BaseResponse(T messageBody) {
		this.messageBody = messageBody;
	}

	public BaseResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public BaseResponse(String code, String message, T messageBody) {
		this.code = code;
		this.message = message;
		this.messageBody = messageBody;
	}

	public BaseResponse(String code, String message, String reqNo, T messageBody) {
		this.code = code;
		this.message = message;
		this.reqNo = reqNo;
		this.messageBody = messageBody;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(T messageBody) {
		this.messageBody = messageBody;
	}

	public String getReqNo() {
		return reqNo;
	}

	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

	@Override
	public String toString() {
		return "BaseResponse{" +
				"code=" + code +
				", message='" + message + '\'' +
				", reqNo='" + reqNo + '\'' +
				", messageBody=" + messageBody +
				'}';
	}
}
