package com.itwopqq.booting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanzhen
 * @desx
 * @date 2020-03-23
 */
@RequestMapping("/user")
@RestController
public class PageController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/order/docker")
    public String order() throws Exception {

        return "hello docker";
    }


    @GetMapping("/order/index")
    public String index() throws Exception {

        return "服务端口号:" + "\t" + port + "\t";
    }
}
