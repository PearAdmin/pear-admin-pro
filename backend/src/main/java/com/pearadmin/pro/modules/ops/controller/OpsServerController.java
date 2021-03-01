package com.pearadmin.pro.modules.ops.controller;

import com.pearadmin.pro.common.constant.ControllerConstant;
import com.pearadmin.pro.common.tools.support.server.Server;
import com.pearadmin.pro.common.web.base.BaseController;
import com.pearadmin.pro.common.web.domain.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ControllerConstant.PREFIX_OPS + "server")
public class OpsServerController extends BaseController {

    @GetMapping("info")
    public Result server() throws Exception{
        Server server = new Server();
        server.copyTo();
        return success(server);
    }
}
