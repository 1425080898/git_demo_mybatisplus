package com.lzb;

import com.lzb.dto.DeptDTO;
import com.lzb.service.DeptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class GitDemoMybatisplusApplicationTests {

    @Autowired
    private DeptService deptService;
    @Test
    void contextLoads() {
//        List<Integer> list = new ArrayList<>();
//        list.add(123);
//        if (CollectionUtils.isEmpty(list)){
//            throw new RuntimeException("集合为null");
//        }
        List<DeptDTO> deptDTOS = deptService.getPage("张",null);
        System.out.println(deptDTOS);
    }
}
