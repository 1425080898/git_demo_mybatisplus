package com.lzb.service;

import com.lzb.dto.DeptDTO;
import com.lzb.entity.Dept;
import com.baomidou.mybatisplus.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 部门表 服务类
 * </p>
 *
 * @author Mr.Liu
 * @since 2020-09-13
 */
public interface DeptService extends IService<Dept> {
    List<DeptDTO> selectDeptDTO();
    int insertDept(DeptDTO deptDTO);
    DeptDTO selectDeptByDeptId(Integer deptId);
    int updateDept(DeptDTO deptDTO);
    int deleteDeptByDeptId(Integer deptId);
    int deleteDeptsById(List<Integer> deptIds);
    List<DeptDTO> getPage(String deptName, Integer orderNum);

}
