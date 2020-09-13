package com.lzb.controller;


import com.lzb.dto.DeptDTO;
import com.lzb.entity.Dept;
import com.lzb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 *
 * @author Mr.Liu
 * @since 2020-09-13
 */
@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("selectAll")
    public List<Dept> selectAll(){
        return deptService.selectList(null);
    }
    @GetMapping("selectDeptDTO")
    public List<DeptDTO> selectDeptDTO(){
        return deptService.selectDeptDTO();
    }
    @PostMapping("insertDept")
    public int insertDept(@RequestBody DeptDTO deptDTO){
        return deptService.insertDept(deptDTO);
    }
    @GetMapping("selectDeptByDeptId")
    public DeptDTO selectDeptByDeptId(@RequestParam("deptId") Integer deptId){
        return deptService.selectDeptByDeptId(deptId);
    }
    //updateDept
    @PutMapping("updateDept")
    public int updateDept(@RequestBody DeptDTO deptDTO){
        return deptService.updateDept(deptDTO);
    }
    @DeleteMapping("deleteDeptByDeptId")
    public int deleteDeptByDeptId(@RequestParam("deptId") Integer deptId){
        return deptService.deleteDeptByDeptId(deptId);
    }
}

