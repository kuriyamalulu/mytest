package com.zh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zh.dao.ApplyMapper;
import com.zh.po.Apply;
import com.zh.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@Transactional
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public PageInfo<Apply> findAll(Integer pageNum, Integer pageSize, Integer userId) {
        PageHelper.startPage(pageNum,pageSize);
        List<Apply> applyList = applyMapper.getAllByUserId(userId);
        if (applyList.size() == 0){
            return null;
        }else {
            return new PageInfo<>(applyList);
        }
    }

    @Override
    public PageInfo<Apply> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Apply> applyList = applyMapper.getAll();
        if (applyList.size() == 0){
            return null;
        }else {
            return new PageInfo<>(applyList);
        }
    }

    @Override
    public int accessApply(Apply apply) {
        apply.setApplyState(1);
        return applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public int backApply(Apply apply) {
        apply.setApplyState(-1);
        return applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public int withdrawApply(Apply apply) {
        apply.setApplyState(2);
        return applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public int reapplyApply(Apply apply) {
        apply.setApplyState(0);
        return applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public int addApply(Apply apply) {
        return applyMapper.insertSelective(apply);
    }

    @Override
    public Apply findApplyById(Integer applyId) {
        return applyMapper.selectByPrimaryKey(applyId);
    }

    @Override
    public int updateApply(Apply apply) {
        return applyMapper.updateByPrimaryKeySelective(apply);
    }
}
