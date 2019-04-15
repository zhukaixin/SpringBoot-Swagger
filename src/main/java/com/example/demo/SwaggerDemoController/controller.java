package com.example.demo.SwaggerDemoController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:zhukaixin
 * @create 2019-04-16-3:24
 * @descrption:
 */
@RestController
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class controller {

    @ApiOperation(value = "测试swagger", notes = "测试swagger")
    @GetMapping(value = "/")
    public String getStudent() {

        return "success";
    }
}
