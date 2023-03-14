package com.zd.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zd.project.service.InterfaceInfoService;
import com.zd.project.model.entity.InterfaceInfo;
import generator.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author zdsss
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-03-14 19:55:22
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

}




