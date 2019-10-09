package com.binanceapi.security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.binanceapi.model.User;

public class HashSecurity {
	
	User user = new User();
	
	public void encryp() throws NoSuchAlgorithmException, UnsupportedEncodingException {
	    
		user.setApiKey("123");
	    
	    MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
	    byte messageDigestApiKey[] = algorithm.digest(user.getApiKey().getBytes("UTF-8"));
	      
	    StringBuilder hexStringApiKey = new StringBuilder();
	    for (byte b : messageDigestApiKey) {
	             hexStringApiKey.append(String.format("%02X", 0xFF & b));
	    }
	    user.setApiKey(hexStringApiKey.toString());
	}


}
