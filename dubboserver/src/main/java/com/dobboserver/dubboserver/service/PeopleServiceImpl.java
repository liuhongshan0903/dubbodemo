package com.dobboserver.dubboserver.service;

import java.util.Random;

import com.api.dubboapi.entity.People;
import com.api.dubboapi.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 分销中心
 *
 * @author: liuhongshan
 * @email: liuhongshan@sinovatech.com
 * @date:2019/10/14 20:56
 * 注意，这里的service注解用的不是spring的注解，而是com.alibaba.dubbo.config.annotation.Service;
 */
@Service
public class PeopleServiceImpl implements PeopleService {
    private static final Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);
    /**
     * 这个方法的作用是接收传过来的People实体，将其ID赋为随机数
     */
    @Override
    public People getPeople(People people) {
        people.setId(new Random().nextInt(10000));
        logger.debug("People:{},ID:{}",people.getName(),people.getId());
        return people;
    }

}
