package com.zd.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zd.project.model.entity.InterfaceInfo;
import com.zd.project.model.entity.Post;

/**
* @author zdsss
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-03-14 19:55:22
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
