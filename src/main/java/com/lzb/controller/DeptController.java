package com.lzb.controller;


import com.lzb.dto.DeptDTO;
import com.lzb.entity.Dept;
import com.lzb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

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
    @PutMapping("updateDept")
    public int updateDept(@RequestBody DeptDTO deptDTO){
        String deptName = Optional.ofNullable(deptDTO).map(DeptDTO::getDeptName).orElse(null);
        Integer deptId = Optional.ofNullable(deptDTO).map(DeptDTO::getDeptId).orElse(null);
        Integer orderNum = Optional.ofNullable(deptDTO).map(DeptDTO::getOrderNum).orElse(null);
        if (StringUtils.isEmpty(deptName)){
            throw new RuntimeException("部门名称不能为null");
        }
        if (StringUtils.isEmpty(deptId)){
            throw new RuntimeException("部门id不能为null");
        }
        if (StringUtils.isEmpty(orderNum)){
            throw new RuntimeException("排序id不能为null");
        }
        return deptService.updateDept(deptDTO);
    }
    @DeleteMapping("deleteDeptByDeptId")
    public int deleteDeptByDeptId(@RequestParam("deptId") Integer deptId){
        return deptService.deleteDeptByDeptId(deptId);
    }
    @PostMapping("deleteDeptsById")
    public int deleteDeptsById(@RequestBody List<Integer> deptIds){
        return deptService.deleteDeptsById(deptIds);
    }
    //getPage
    @GetMapping("getPage")
    public List<DeptDTO> getPage(@RequestParam(value = "deptName") String deptName, @RequestParam(value = "orderNum") Integer orderNum){
        return deptService.getPage(deptName,orderNum);
    }
}

