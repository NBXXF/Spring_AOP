package com.asange.aop.match_param;

import org.springframework.stereotype.Service;

/**
 * com.asange.aop.match_param
 * icourt
 * 2018/4/7
 * author:asange
 * email:xuanyouwu@163.com
 **/
@Service
public class MatchParamService {

    public void sayNum(Long num) {
        System.out.println("\n=======sayNum:" + num + "\n");
    }
}
