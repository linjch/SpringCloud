package com.spring.application.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class TokenFilter extends ZuulFilter {

	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;	// �Ƿ�ִ�иù��������˴�Ϊtrue��˵����Ҫ����
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;	//filterִ��˳��ͨ������ָ�� ,���ȼ�Ϊ0������Խ�����ȼ�Խ��
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre"; // ����������·��֮ǰ����
	}
	
	@Override
	public Object run() {
		// TODO Auto-generated method stub
		/*
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		
		String token = request.getParameter("token");
		
		//У��Token�Ƿ�Ϊ��
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
