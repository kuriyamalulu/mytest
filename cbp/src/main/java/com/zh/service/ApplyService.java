package com.zh.service;

import com.github.pagehelper.PageInfo;
import com.zh.po.Apply;

public interface ApplyService {
    PageInfo<Apply> findAll(Integer pageNum,Integer pageSize,Integer userId);

    PageInfo<Apply> findAll(Integer pageNum,Integer pageSize);

    int accessApply(Apply apply);

    int backApply(Apply apply);

    int withdrawApply(Apply apply);

    int reapplyApply(Apply apply);

    int addApply(Apply apply);

    Apply findApplyById(Integer applyId);

    int updateApply(Apply apply);
}
