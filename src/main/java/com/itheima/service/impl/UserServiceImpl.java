package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*定义bean*/
@Service("userService")
/*设定bean作用域*/
@Scope("singleton")
public class UserServiceImpl implements UserService {

    public void save() {
        System.out.println("user service running...");
    }

    @PostConstruct
    public void init(){
        System.out.println("user servier init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("user servier destroy...");
    }

}
