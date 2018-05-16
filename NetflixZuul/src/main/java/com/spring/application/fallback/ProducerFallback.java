package com.spring.application.fallback;

import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

@Component
public class ProducerFallback implements FallbackProvider {
	
	private final Logger logger = LoggerFactory.getLogger(FallbackProvider.class);

	//指定要处理的 service
	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ClientHttpResponse fallbackResponse() {
		return new ClientHttpResponse(){

			@Override
			public InputStream getBody() throws IOException {
				return new ByteArrayInputStream("The service is unavailable.".getBytes());
			}

			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				return headers;
			}

			@Override
			public void close() {
				
			}

			@Override
			public int getRawStatusCode() throws IOException {
				return 200;
			}

			@Override
			public HttpStatus getStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.OK;
			}

			@Override
			public String getStatusText() throws IOException {
				return "OK";
			}
			
		};
	}

	@Override
	public ClientHttpResponse fallbackResponse(Throwable cause) {
		if(cause != null && cause.getCause() != null){
			String reason = cause.getCause().getMessage();
			logger.info("Exception {}", reason);
		}
		return fallbackResponse();
	}

	
}
