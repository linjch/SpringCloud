package com.spring.application.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class TokenFilter extends ZuulFilter {

	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;	// 是否执行该过滤器，此处为true，说明需要过滤
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;	//filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre"; // 可以在请求被路由之前调用
	}
	
	@Override
	public Object run() {
		// TODO Auto-generated method stub
		/*
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		String token = request.getParameter("token");
		
		//校验Token是否为空
		if(StringUtils.isNotBlank(token)){
			ctx.setSendZuulResponse(true);
			ctx.setResponseStatusCode(200);
			ctx.set("isSuccess", true);
		}else{
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(400);
			ctx.setResponseBody("token is empty");
			ctx.set("isSuccess", false);
		}
		*/
		return null;
	}

}
