package com.giaking.gateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.giaking.common.vo.Result;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 15:23 2020/11/9
 */
@Order(-200)
public class CommonAuthFilter implements GatewayFilter {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
       // if(xx)   return exchange.getResponse().writeWith(Flux.just(this.getBodyBuffer(exchange.getResponse(), result)));

        //keep
        return chain.filter(exchange);
    }

    /**
     *直接返回
     * @param response
     * @param result 定义的
     * @return
     */
    private DataBuffer getBodyBuffer(ServerHttpResponse response, Result result) {
        return response.bufferFactory().wrap(JSONObject.toJSONBytes(result));
    }
}
