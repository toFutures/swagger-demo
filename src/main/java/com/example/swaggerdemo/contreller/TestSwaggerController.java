package com.example.swaggerdemo.contreller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value = "类描述")
@RestController
public class TestSwaggerController {


    @ApiOperation(value = "获取用户名",notes = "String类型")  //方法注解
    @RequestMapping(value = "/getName",method = RequestMethod.GET)
    public String getName(
            @ApiParam(value = "用户名",required = true)  /*参数注解*/
            @RequestParam String name){
        return "Swagger name:" + name;
    }
}
