package com.crmww.sale.req;

import io.swagger.annotations.ApiModelProperty;

/**
 * 分页查询请求
 * @param <T>
 */
public abstract class BasePageRequest<T> extends BaseCrmRequest{

    /**
     * 分页页面
     */
    @ApiModelProperty(required=true, value="页码编号", example = "1")
    private Integer pageNo = 1;

    /**
     * 每页数据大小
     */
    @ApiModelProperty(required=true, value="每页数据大小", example = "20")
    private Integer pageSize = 20;

    /**
     * 查询参数
     */
    @ApiModelProperty(required=false, value="查询参数", example = "")
    private T queryParam;

    public BasePageRequest() {}

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

    public T getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(T queryParam) {
        this.queryParam = queryParam;
    }

    @Override
    public String toString() {
        return "BasePageRequest{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", queryParam=" + queryParam +
                '}';
    }
}
