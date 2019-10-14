package com.dubbocustomer.dubbocustomer.crontroller;


import com.api.dubboapi.entity.People;
import com.api.dubboapi.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * 分销中心
 *
 * @author: liuhongshan
 * @email: liuhongshan@sinovatech.com
 * @date:2019/10/14 21:16
 */
@RestController
public class PeopleController {

    @Reference
    private PeopleService peopleService;
    @GetMapping("/people/{name}")
    public People getPeople(@PathVariable("name") String name) {
        People people = new People();
        people.setName(name);
        return peopleService.getPeople(people);
    }
}
