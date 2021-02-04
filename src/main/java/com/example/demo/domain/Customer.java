package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * Created on 2021-02-03
 */
@TableName(value = "t_customer")
public class Customer {
    private Integer id;
    private String name;
    private String password;
    private Long account;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", account=").append(account);
        sb.append('}');
        return sb.toString();
    }
}