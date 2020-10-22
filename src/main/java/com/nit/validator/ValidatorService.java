package com.nit.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nit.security.service.SymmetricAesService;

@Service
public class ValidatorService {

	@Autowired
	private SymmetricAesService symmetricAesService;
	
	@Value("${secretKey}")
	private String secretKey;
	
	String originalString = "pavantest";
	
	public void testEncryptionDecryption() {
		
		System.out.println("Original String Value: "+ originalString);
		String encyptedValue = symmetricAesService.encrypt(originalString, secretKey);
		System.out.println("Encrypted Value: "+ encyptedValue);
		
		String decryptedValue = symmetricAesService.decrypt(encyptedValue, secretKey);
		System.out.println("Decrypted Value: "+ decryptedValue);
	    
		
	}
	
	
}
