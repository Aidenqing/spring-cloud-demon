package com.giaking.user.feign.interfaces;

import com.giaking.user.feign.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 16:58 2020/11/9
 */
@FeignClient(value = "app-user-service")
public interface IFeignUser {

    @GetMapping(value = "/feign/user/get/{id}")
    UserVO getById(@PathVariable(value = "id") Long id);

}
