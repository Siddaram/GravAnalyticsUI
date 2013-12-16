package com.gravitant.analytics.model;

public class User {
	
	public String userNname;
	public String accesskey;
	public String secretkey;
	public String bucketname;
	
	public User(){
		
	}

	public User(String userNname, String accesskey, String secretkey,
			String bucketname) {
		super();
		this.userNname = userNname;
		this.accesskey = accesskey;
		this.secretkey = secretkey;
		this.bucketname = bucketname;
	}

	public String getUserNname() {
		return userNname;
	}

	public void setUserNname(String userNname) {
		this.userNname = userNname;
	}

	public String getAccesskey() {
		return accesskey;
	}

	public void setAccesskey(String accesskey) {
		this.accesskey = accesskey;
	}

	public String getSecretkey() {
		return secretkey;
	}

	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}

	public String getBucketname() {
		return bucketname;
	}

	public void setBucketname(String bucketname) {
		this.bucketname = bucketname;
	}

	
	
	
	
}
