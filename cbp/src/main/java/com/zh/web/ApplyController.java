package com.zh.web;

import com.github.pagehelper.PageInfo;
import com.zh.po.Apply;
import com.zh.service.ApplyService;
import com.zh.web.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apply")
@CrossOrigin
public class ApplyController {
    @Autowired
    private ApplyService applyService;

    @GetMapping("/page/{pageNum}/{pageSize}/{userId}")
    public ResponseVO<PageInfo<Apply>> page(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable Integer userId){
        PageInfo<Apply> applyPageInfo = applyService.findAll(pageNum, pageSize, userId);
        return new ResponseVO<>(applyPageInfo,"查询成功",2000);
    }
    @GetMapping("/page/{pageNum}/{pageSize}")
    public ResponseVO<PageInfo<Apply>> page(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        PageInfo<Apply> applyPageInfo = applyService.findAll(pageNum, pageSize);
        return new ResponseVO<>(applyPageInfo,"查询成功",2000);
    }
    @PutMapping("/access")//管理员通过
    public ResponseVO accessApply(@RequestBody Apply apply){
        int row = applyService.accessApply(apply);
        if (row >0 ){
            return new ResponseVO<>(row,"修改成功",2000);
        }
        return new ResponseVO<>(null,"修改失败",4000);
    }
    @PutMapping("/back")//管理员驳回
    public ResponseVO backApply(@RequestBody Apply apply){
        int row = applyService.backApply(apply);
        if (row >0 ){
            return new ResponseVO<>(row,"修改成功",2000);
        }
        return new ResponseVO<>(null,"修改失败",4000);
    }
    @PutMapping("/withdraw")//撤回
    public ResponseVO withdrawApply(@RequestBody Apply apply){
        int row = applyService.withdrawApply(apply);
        if (row >0 ){
            return new ResponseVO<>(row,"修改成功",2000);
        }
        return new ResponseVO<>(null,"修改失败",4000);
    }
    @PutMapping("/reapply")//重新申请
    public ResponseVO reapplyApply(@RequestBody Apply apply){
        int row = applyService.reapplyApply(apply);
        if (row >0 ){
            return new ResponseVO<>(row,"修改成功",2000);
        }
        return new ResponseVO<>(null,"修改失败",4000);
    }
    @PostMapping// 新增申请
    public ResponseVO addApply(@RequestBody Apply apply){
        int row = applyService.addApply(apply);
        if (row >0 ){
            return new ResponseVO<>(row,"修改成功",2000);
        }
        return new ResponseVO<>(null,"修改失败",4000);
    }
    @GetMapping("/{applyId}")
    public ResponseVO<Apply> findApplyById(@PathVariable Integer applyId){
        Apply apply = applyService.findApplyById(applyId);
        if (apply == null){
            return new ResponseVO<>(null,"查询失败",4000);
        }else {
            return new ResponseVO<>(apply, "查询成功", 2000);
        }
    }
    @PutMapping("/update")//修改申请
    public ResponseVO updateApply(@RequestBody Apply apply){
        int row = applyService.updateApply(apply);
        if (row >0 ){
            return new ResponseVO<>(row,"修改成功",2000);
        }
        return new ResponseVO<>(null,"修改失败",4000);
    }
}
