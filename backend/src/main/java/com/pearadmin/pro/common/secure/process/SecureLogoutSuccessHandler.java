package com.pearadmin.pro.common.secure.process;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pearadmin.pro.common.aop.lang.enums.Action;
import com.pearadmin.pro.common.web.base.context.BaseContext;
import com.pearadmin.pro.common.tools.core.ServletUtil;
import com.pearadmin.pro.common.web.domain.Result;
import com.pearadmin.pro.common.web.domain.ResultCode;
import com.pearadmin.pro.common.constant.TokenConstant;
import org.springframework.security.core.Authentication;
import com.pearadmin.pro.common.secure.uutoken.SecureUserTokenService;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.io.IOException;

/**
 * Describe: Security 注销成功处理类
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 * */
@Component
public class SecureLogoutSuccessHandler implements LogoutSuccessHandler {

    @Resource
    private BaseContext context;

    @Resource
    private SecureUserTokenService customUserDetailsTokenService;

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
        String token = httpServletRequest.getHeader(TokenConstant.TOKEN_HEADER).replaceFirst(TokenConstant.TOKEN_PREFIX, "");
        customUserDetailsTokenService.destroyToken(token);

        // 注 销 日 志
        context.record("注销","注销失败", Action.AUTH, false, "","");

        ServletUtil.writeJson(Result.success(ResultCode.LOGOUT_SUCCESS));
    }
}
