package com.test.controller;

import com.test.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@Controller
@RequestMapping("/test")
public class testController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/success")
    public String success(){
        System.out.print(itemsService.findById(1));
        return "hello";
    }
}
