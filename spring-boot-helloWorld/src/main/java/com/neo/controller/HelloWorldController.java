package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
  * ClassName: HelloWorldController<br>
  * Description:  <br>
  * Company: com.cxj
  * @author chenxj
  * @date  2019/1/20-14:15
  */
@RestController //必须是这个annotation 才有效, controller注解没有效果.

public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}