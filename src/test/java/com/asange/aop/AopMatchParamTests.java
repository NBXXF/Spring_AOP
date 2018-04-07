package com.asange.aop;

import com.asange.aop.match_param.MatchParamService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * com.asange.aop
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class AopMatchParamTests {

    @Autowired
    MatchParamService service;

    @Test
    public void test() {
        service.sayNum(100L);
    }
}
