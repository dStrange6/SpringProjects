package com.mayank.dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DAO
{
    public DAO()
    {
        System.out.println("DAO bean created");
    }
}
