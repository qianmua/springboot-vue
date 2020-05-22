package pres.qianmuna.vue.common;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/5/22
 * @time 15:16
 */
@Data
public class ModelCommon<T> {

    private Integer code;
    private String message;
    private T data;
}
