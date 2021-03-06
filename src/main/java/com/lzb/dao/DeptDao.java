package com.lzb.dao;

import com.lzb.dto.DeptDTO;
import com.lzb.entity.Dept;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.sun.deploy.panel.ITreeNode;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 部门表 Mapper 接口
 * </p>
 *
 * @author Mr.Liu
 * @since 2020-09-13
 */
@Repository
public interface DeptDao extends BaseMapper<Dept> {

    List<DeptDTO> selectDeptDTO();
    int insertDept(DeptDTO deptDTO);
    DeptDTO selectDeptByDeptId(Integer deptId);
    int updateDept(DeptDTO deptDTO);
    int deleteDeptByDeptId(Integer deptId);
    int deleteDeptsById(@Param("deptIds") List<Integer> deptIds);
    //条件查询
    List<DeptDTO> getPage(@Param("deptName") String deptName, @Param("orderNum") Integer orderNum);
}
