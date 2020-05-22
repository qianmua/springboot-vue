package pres.qianmuna.vue.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/5/22
 * @time 14:36
 */
@Configuration
public class WebCrosConfig implements WebMvcConfigurer {


    /**
     * 跨域请求访问配置
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // 请求源
                .allowedOrigins("http://localhost:8080" , "null")
                // 允许方法
                .allowedMethods("GET" ,"POST" , "PUT" , "DELETE" , "OPTION")
                // 是否可以携带参数
                .allowCredentials(true)
                // 链接生命周期
                .maxAge(3600);
    }
}
