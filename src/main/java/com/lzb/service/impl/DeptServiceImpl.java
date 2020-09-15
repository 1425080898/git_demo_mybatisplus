package com.lzb.service.impl;

import com.lzb.bean.ServiceTypeBean;
import com.lzb.dto.DeptDTO;
import com.lzb.entity.Dept;
import com.lzb.dao.DeptDao;
import com.lzb.entity.Dept2;
import com.lzb.enums.StatusEnum;
import com.lzb.service.DeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lzb.utils.TimeUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.sound.sampled.Line;
import java.sql.Timestamp;
import java.util.Date;
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
@Log4j2
public class DeptServiceImpl extends ServiceImpl<DeptDao, Dept> implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private ServiceTypeBean serviceTypeBean;
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

    @Override
    public int deleteDeptsById(List<Integer> deptIds) {
        return deptDao.deleteDeptsById(deptIds);
    }

    @Override
    public List<DeptDTO> getPage(String deptName, Integer orderNum) {
        Integer num = 2;
        String name = null;
        if (num == null){
           throw new RuntimeException("参数不能为null");
        }
        name = serviceTypeBean.getServerTypeMap().get(num);
        log.info("类型名称: {}",name);

        Dept dept = Dept.builder().deptId(11).deptName("开发部").status("0").build();
        Dept2 dept2 = new Dept2();
        BeanUtils.copyProperties(dept,dept2);
        log.info("实体: {}",dept);
        log.info("copy entity is {}",dept2);


        Integer logLevel = 2;
        if (logLevel == null){
            throw  new RuntimeException("参数不能为null");
        }
        String level = serviceTypeBean.getLogLevel().get(logLevel);
        log.info("日志级别: {}",level);

        Long aLong = TimeUtil.monthTimeInMillis();
        log.info("时间: {}",aLong);

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        log.info("时间戳: {}",timestamp);


        //模拟 操作状态 1查询成功  2查询失败
//        String code = StatusEnum.FAILED_CODE.getCode();
        String queryStatus = null;
        Integer status = 2;
        if (status==null){
            throw new RuntimeException("参数不能为null");
        }
        queryStatus = StatusEnum.getCodeByStatus(status);
        log.info("操作状态：{}",queryStatus);

//操作userId 1
        String operationUserId = null;
        //行动 2
        String action = null;
        String searchContent = null;
        Integer searchType = 1;
        //如果搜索内容不为null
        if (!StringUtils.isEmpty(searchContent)) {
//            //如果搜索类型==1
//            if (1 == searchType) {
//                //searchContent 赋值 operationUserId
//                operationUserId = searchContent;
//            } else if (2 == searchType) {
//                //searchContent 赋值 action
//                action = searchContent;
//            }

        }

        return deptDao.getPage(deptName,orderNum);
    }
}
