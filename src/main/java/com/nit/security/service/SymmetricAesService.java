package com.nit.security.service;

public interface SymmetricAesService {
	
	String encrypt(String strToEncrypt, String secretKey);
	String decrypt(String strToDecrypt, String secretKey);

}
