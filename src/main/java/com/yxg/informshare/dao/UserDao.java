package com.yxg.informshare.dao;

/**
 * @Description TODO
 * @Author xiguang_yin
 * @Date 2020/4/14 18:45
 */
public interface UserDao {
    void addUser(String account,String password,String studentId,String userName,String email);

    String queryId(String account,String password);
}
