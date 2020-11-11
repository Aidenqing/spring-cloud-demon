package com.giaking.common.vo;

import lombok.Data;

/**
 * @author ChengJiangWu
 * @description :
 * @date Create: 15:41 2020/11/9
 */
@Data
public class Result {

    private Integer code;
    private String msg;
    private Object data;
}
