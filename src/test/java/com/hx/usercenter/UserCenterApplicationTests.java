package com.hx.usercenter;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hx.usercenter.mapper.UserMapper;
import com.hx.usercenter.model.domain.User;
import com.hx.usercenter.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@SpringBootTest
class UserCenterApplicationTests {
    @Resource
    UserMapper userMapper;
    @Resource
    UserService userService;
    @Test
    void testDigest() throws NoSuchAlgorithmException {
        String newPassword= DigestUtils.md5DigestAsHex(("abcd" + "mypassword").getBytes());
        System.out.println(newPassword);
    }


    @Test
    void contextLoads() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserAccount,"godhanxing");

        List<User> list = userService.list(queryWrapper);
        System.out.println(list);


    }

}
