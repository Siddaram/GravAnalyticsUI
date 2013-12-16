package com.gravitant.analytics.rest.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.gravitant.analytics.util.RestUtil;
import com.gravitant.s3.model.S3Credential;

@Component("restAdapter")
public class RestAdapter {

	@Autowired
	private RestUtil restUtil;

	public S3Credential registerS3User(S3Credential credential) {
		String url = restUtil.getUrl() + RestUtil.REGISTER_S3_USERS;

		System.out.println(" URL :::" + url);

		System.out.println("before call to restUtil template");
		ResponseEntity<S3Credential> response = restUtil.getRestTemplate()
				.exchange(url, HttpMethod.POST,
						new HttpEntity<S3Credential>(credential),
						S3Credential.class);

		System.out.println("After getting response from API");
		return response.getBody();
	}

}
