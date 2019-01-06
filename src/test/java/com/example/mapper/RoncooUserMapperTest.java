package com.example.mapper;

import com.example.bean.Owner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


/**
 * Created by zhuhanchao on 2019/1/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoncooUserMapperTest {
    @Autowired
    private RoncooUserMapper mapper;
    @Test
    public void insert() throws Exception {
        for (int i = 0; i < 10; i++) {

            Owner owner=new Owner();
            owner.setName("啊哈哈");
            owner.setChainid(333);
            System.out.println("===="+owner);
            mapper.insert(owner);
        }

    }

}