package com.crmww.sale.util;


import tk.mybatis.mapper.common.MySqlMapper;

public interface MyMapper<T> extends tk.mybatis.mapper.common.Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}