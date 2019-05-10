package com.test.service.imp;

import com.test.domain.Items;
import com.test.mapper.UserMapper;
import com.test.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImp implements ItemsService {

    @Autowired
    private UserMapper userMapper;

    public Items findById(Integer id){
        return userMapper.findById(id);
    }
}
