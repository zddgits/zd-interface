package com.zd.zdinterface;

import com.zd.zdapiclientsdk.client.ZdApiClient;
import com.zd.zdapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ZdInterfaceApplicationTests {
    @Resource
    private ZdApiClient zdApiClient;

    @Test
    void contextLoads() {
        String res1 = zdApiClient.getNameByGet("张迪1");
        User user = new User();
        user.setUsername("张迪");
        String res = zdApiClient.getUserNameByPost(user);
        System.out.println(res1);
        System.out.println(res);
    }

}
