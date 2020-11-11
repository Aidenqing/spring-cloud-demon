package com.giakin.order.service.rest.com.giakin.order.service;

import com.giaking.user.feign.interfaces.IFeignUser;
import com.giaking.user.feign.vo.UserVO;
import feign.interfaces.IFeignOrder;
import feign.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 17:21 2020/11/9
 */
@RestController
@RequestMapping
public class OrderService implements IFeignOrder {

    @Autowired
    private IFeignUser user;

    @Value("${server.port}")
    private Integer port;

    @Override
    public OrderVO getById(Long id) {
        OrderVO orderVO = new OrderVO();
        orderVO.setOrderId(port);
        orderVO.setUserId(user.getById(1l).getId());
        return orderVO;
    }

    @Override
    public OrderVO create(OrderVO orderVO) {
        orderVO.setUserId(user.getById(1l).getId());
        return orderVO;
    }

    @GetMapping("/test")
    public Integer getTest() {
        return user.getById(1L).getId();
    }
}
