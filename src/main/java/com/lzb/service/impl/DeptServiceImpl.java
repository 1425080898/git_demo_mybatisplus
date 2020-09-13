package com.lzb.service.impl;

import com.lzb.dto.DeptDTO;
import com.lzb.entity.Dept;
import com.lzb.dao.DeptDao;
import com.lzb.service.DeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author Mr.Liu
 * @since 2020-09-13
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptDao, Dept> implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public List<DeptDTO> selectDeptDTO() {
        return deptDao.selectDeptDTO();
    }

    @Override
    public int insertDept(DeptDTO deptDTO) {
        int i = deptDao.insertDept(deptDTO);
        if (i>0){
            return i;
        }
        return 0;
    }

    @Override
    public DeptDTO selectDeptByDeptId(Integer deptId) {
        return deptDao.selectDeptByDeptId(deptId);
    }

    @Override
    public int updateDept(DeptDTO deptDTO) {
        int i = deptDao.updateDept(deptDTO);
        if (i>0){
            return i;
        }
        return 0;
    }

    @Override
    public int deleteDeptByDeptId(Integer deptId) {
        int i = deptDao.deleteDeptByDeptId(deptId);
        if (i>0){
            return i;
        }
        return 0;
    }
}
