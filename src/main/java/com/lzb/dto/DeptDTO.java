package com.lzb.dto;

/**
 * @author :xiaoLiu
 * @date ：Created in 2020/9/13 22:24
 * @description：deptDTO
 * @modified By：
 * @version:
 */


public class DeptDTO {

    private Integer deptId;
    private String deptName;
    private Integer orderNum;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "DeptDTO{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}
