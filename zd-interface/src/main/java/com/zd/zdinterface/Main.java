package com.zd.zdinterface;

import com.zd.zdinterface.client.ZdApiClient;
import com.zd.zdinterface.model.User;

public class Main {
    public static void main(String[] args) {
        String accessKey = "12345";
        String secretKey = "abcdef";
        ZdApiClient zdApiClient = new ZdApiClient(accessKey,secretKey);
        String res1 =  zdApiClient.getNameByGet("zd");
        String res2 =  zdApiClient.getNameByPost("zd");
        User user = new User();
        user.setUsername("张迪");
        String res3 =   zdApiClient.getUserNameByPost(user);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
