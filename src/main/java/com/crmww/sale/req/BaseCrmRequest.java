package com.crmww.sale.req;

import io.swagger.annotations.ApiModelProperty;

/**
 * @desc CRM前台发起请求的基础参数请求体
 */
public abstract class BaseCrmRequest extends BaseRequest {

	/**
	 * 当前操作员
	 */
	@ApiModelProperty(value = "opId", example = "2000001")
	private String opId;
	/**
	 * 当前操作员所属组织
	 */
	@ApiModelProperty(value = "orgId", example = "10001")
	private String orgId;
	
	
	/**
	 * 当前操作员所属行政区划
	 */
	@ApiModelProperty(value = "distinctId", example = "10001")
	private String distinctId;
	
	public String getDistinctId() {
		return distinctId;
	}

	public void setDistinctId(String distinctId) {
		this.distinctId = distinctId;
	}

	public String getOpId() {
		return opId;
	}

	public void setOpId(String opId) {
		this.opId = opId;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	@Override
	public String toString() {
		return "{\"sessionId\":\"" + this.getSessionId() + "\",\"opId\":\"" + opId
				+ "\",\"orgId\":\"" + orgId + "\",\"distinctId\":\""
				+ distinctId + "\"}";
	}

}
