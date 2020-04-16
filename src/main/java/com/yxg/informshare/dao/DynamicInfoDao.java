package com.yxg.informshare.dao;

import com.yxg.informshare.entity.DynamicInfo;

import java.util.List;

/**
 * @Description TODO
 * @Author xiguang_yin
 * @Date 2020/4/14 18:45
 */
public interface DynamicInfoDao {
    DynamicInfo queryById(int pid);

    List<DynamicInfo> queryAll();
}
