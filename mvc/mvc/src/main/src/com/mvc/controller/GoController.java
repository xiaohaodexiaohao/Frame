package com.mvc.controller;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author wsw
 * @Date 2018/11/25
 */
@Controller
public class GoController {

    @GetMapping("/aaa")
    public String index() {
        System.out.println(123);
        return "index";
    }

    @GetMapping("/index/{num}/{cc}")
//    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public String index2( @PathVariable String num, @RequestParam String count, @PathVariable String cc) {
        System.out.println(num + "--" + count + "--" + cc);
        return "two";
    }

    @GetMapping("/index")
    public String index3() {
        return "two";
    }
}
