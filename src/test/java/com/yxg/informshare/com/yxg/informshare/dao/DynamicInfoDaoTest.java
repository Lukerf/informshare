package com.yxg.informshare.com.yxg.informshare.dao;


import com.yxg.informshare.dao.DynamicInfoDao;
import com.yxg.informshare.entity.DynamicInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yxg.informshare.BaseTest;

public class DynamicInfoDaoTest extends BaseTest {

    @Autowired
    private DynamicInfoDao dynamicInfoDao;

    @Test
    public void testQueryById() throws Exception {
        int bookId = 1;
        DynamicInfo book = dynamicInfoDao.queryById(bookId);
        System.out.println(book.getTitle());
    }

}
