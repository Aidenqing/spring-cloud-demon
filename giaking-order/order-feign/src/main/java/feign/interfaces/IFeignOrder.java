package feign.interfaces;

import feign.vo.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 16:58 2020/11/9
 */
@FeignClient(value = "app-order-service")
public interface IFeignOrder {

    @GetMapping(value = "/feign/order/get/{id}")
    OrderVO getById(@PathVariable(value = "id") Long id);


    @PostMapping(value = "/feign/order/create")
    OrderVO create(OrderVO orderVO);
}
