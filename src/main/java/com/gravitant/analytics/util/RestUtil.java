package com.gravitant.analytics.util;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Component("restUtil")
public class RestUtil {

	@Value("${rest.client.connectionTimeoutMillis}")
	private int restClientConnectionTimeoutMillis;

	@Value("${rest.client.readTimeoutMillis}")
	private int restClientReadTimeoutMillis;

	@Value("${rest.client.maxConnectionsPerHost}")
	private int restClientMaxConnectionsPerHost;

	@Value("${rest.client.maxTotalConnections}")
	private int restClientMaxTotalConnections;

	@Value("${rest.gravitant.url}")
	private String url;

	@Autowired
	private MarshallingHttpMessageConverter jaxbMarshallingHttpMessageConverter;

	@Autowired
	private ResponseErrorHandler errorHandler;

	private RestTemplate restTemplate;
	
	public static final String REGISTER_S3_USERS = "/registerS3User";

	public static final String GET_S3_USERS = "/getS3Users";

	public static final String USER_NAME = "{userName}";

	public static final String GET_S3_USER = "/getS3User/" + USER_NAME;

	public static final String GET_OBJECTS_IN_BUCKETS = "/getObjectsInBucket/"
			+ USER_NAME;

	private HttpClient getHttpClient() {
		final PoolingClientConnectionManager connectionManager = new PoolingClientConnectionManager();
		connectionManager
				.setDefaultMaxPerRoute(restClientMaxConnectionsPerHost);
		connectionManager.setMaxTotal(restClientMaxTotalConnections);
		final DefaultHttpClient httpClient = new DefaultHttpClient(
				connectionManager);
		return httpClient;
	}

	private ClientHttpRequestFactory getClientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(
				getHttpClient());
		factory.setConnectTimeout(restClientConnectionTimeoutMillis);
		factory.setReadTimeout(restClientReadTimeoutMillis);

		return factory;

	}

	private void decorateRestTemplate() {
		restTemplate.getMessageConverters().add(
				jaxbMarshallingHttpMessageConverter);
		restTemplate.setErrorHandler(errorHandler);

	}

	public RestTemplate getRestTemplate() {
		if (this.restTemplate == null) {
			restTemplate = new RestTemplate(getClientHttpRequestFactory());
			decorateRestTemplate();
		}
		return restTemplate;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
}
