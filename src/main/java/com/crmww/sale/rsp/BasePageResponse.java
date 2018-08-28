package com.crmww.sale.rsp;

import java.io.Serializable;
import java.util.List;

public class BasePageResponse<T> extends BaseResponse<T> implements Serializable{

	/**
	 * 当前页码
	 */
	private Integer pageNo;

	/**
	 * 每页数据大小
	 */
	private Integer pageSize;

	/**
	 * 总页数
	 */
	private Integer totalPage;

	/**
	 * 总记录数
	 */
	private Long totalRecords;

	/**
	 * 当前页的数据内容列表
	 */
	private List<T> data;

	public BasePageResponse() {}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BasePageResponse{" +
				"pageNo=" + pageNo +
				", pageSize=" + pageSize +
				", totalPage=" + totalPage +
				", totalRecords=" + totalRecords +
				", data=" + data +
				'}';
	}
}
