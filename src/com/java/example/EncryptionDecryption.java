package com.java.example; 
import javax.crypto.Cipher;//package of encrypted given data
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
	

public class EncryptionDecryption {

	public static void main(String[] args) 
	{
		 try {
	           
	            KeyGenerator keygenerator
	                = KeyGenerator.getInstance("DES"); //KeyGenerator class provides getInstance() method which accepts a string varriable and returns a KeyGenerator object that generates keys
	            SecretKey myDesKey = keygenerator.generateKey();//Generate the pair of keys
	 
	      
	            Cipher desCipher;
	            desCipher = Cipher.getInstance("DES");//Creating a cipher object
	 
	            byte[] text
	                = "No body can see me.".getBytes("UTF8");//Adding data to the cipher
	 
	           
	            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);//Encrypting the data
	            byte[] textEncrypted = desCipher.doFinal(text);
	 
	      
	            String s = new String(textEncrypted);
	            System.out.println(s);
	 
	           
	            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
	            byte[] textDecrypted
	                = desCipher.doFinal(textEncrypted);
	 
	           
	            s = new String(textDecrypted);
	            System.out.println(s);
	        }
	        catch (Exception e) {
	            System.out.println("Exception");
	        }

	}

}
