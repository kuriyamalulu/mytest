package com.zh.dao;

import com.zh.po.Apply;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ApplyMapper extends Mapper<Apply> {
    List<Apply> getAllByUserId(Integer userId);
    List<Apply> getAll();
}
