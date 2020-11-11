package com.giaking.user.service.rest;

import com.giaking.user.feign.interfaces.IFeignUser;
import com.giaking.user.feign.vo.UserVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 17:05 2020/11/9
 */
@RestController
@RequestMapping
public class UserApi implements IFeignUser {

    @Value("${server.port}")

    private Integer port;
    @Override
    public UserVO getById(Long id) {
        UserVO userVO=new UserVO();
        userVO.setId(port);
         return userVO;
    }
}
