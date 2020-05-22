package pres.qianmuna.vue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/5/22
 * @time 14:34
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "This is my Vue Demo!";
    }

    @GetMapping("/success")
    public Integer suc(){
        return 200;
    }
}
