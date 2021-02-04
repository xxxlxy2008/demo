package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Customer;
import com.example.demo.mapper.CustomerMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void testSelect() {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Bob");
        customer.setPassword("pwd");
        customer.setAccount(10097L);
        int insert = customerMapper.insert(customer);
        System.out.println("affect row num:" + insert);

        List<Customer> userList = customerMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}