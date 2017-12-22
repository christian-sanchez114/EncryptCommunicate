import java.math.BigInteger;
import java.util.Scanner;

public class menu4 {

	void Menu4(){
		
		
		
	    System.out.println(" simulate communication");
	    
	    	    
	    Scanner scan = new Scanner(System.in);  //receives input from the console
	    
	    
	    BigInteger palicem4;
	    BigInteger qalicem4;
	    generator algenerator1= new generator();
	    generator algenerator2= new generator();
	    palicem4=algenerator1.generate();
	    qalicem4=algenerator2.generate();
	    //generate public and private key
	    key alkey = new key(palicem4,qalicem4);
	    System.out.println("here is alice's key");
	    alkey.keys();
	    
	    BigInteger pbobm4;
	    BigInteger qbobm4;
	    generator bgenerator1= new generator();
	    generator bgenerator2= new generator();

	    pbobm4=bgenerator1.generate();
	    qbobm4=bgenerator2.generate();
	    //generate public and private key
	    key bkey = new key(pbobm4,qbobm4);
	    System.out.println("here is bob's key");
	    bkey.keys();
	    System.out.println();
	    
	    
	    
	    //***** alice send to bob *****
	    
	    System.out.println("**************** Alice ***************");
	    System.out.println("I'm alice .write here alice message :");
	    String encryptalicemess1 = scan.nextLine();
	    
	    encryption encryptmess1 = new encryption(bkey.n,encryptalicemess1);
	    encryptmess1.en();
	    System.out.println();

	    
	    //*** charlie intercept ***
	    System.out.println("charlie intercept lentgh of message "+ encryptmess1.messa.size()+" character");
	    
	    
	    //*****bob decrypt alice message *****
	    System.out.println();
	    System.out.println("**************** Bob ***************");
	    System.out.println("I'm bob, I received an encrypted message :");
	    encryptmess1.messagencrypted();
	    System.out.println( "copy/paste here bob's encrypted message :");
	    String encryptedm1 = scan.nextLine();
	    String[] decryptionm1 = encryptedm1.split(" ");
		decryption decryptmess1= new decryption(bkey.d,bkey.n,decryptionm1);

	    decryptmess1.en();
	    System.out.println();

	    

	    
	    
	    //******bob send  message to alice******
	    
	   
	    System.out.println("write a response to alice :");

	    String encryptbobmess2 = scan.nextLine();
	    encryption encryptmess2 = new encryption(alkey.n,encryptbobmess2);
	    encryptmess2.en();
	    System.out.println();

	    
	    
	    //*** charlie intercept ***
	    System.out.println("charlie intercept lentgh of message "+ encryptmess2.messa.size()+" charctere");
	    
	    
	    //**** alice decrypt bob message
	    
	    System.out.println();
	    System.out.println("**************** Alice ***************");
	    System.out.println("I'm Alice, I received an encrypted message :");
	    encryptmess2.messagencrypted();
	    System.out.println( "copy/paste here bob's encrypted message :");
	    String encryptedm2 = scan.nextLine();
	    String[] decryptionm2 = encryptedm2.split(" ");
		decryption decryptmess2= new decryption(alkey.d,alkey.n,decryptionm2);

	    decryptmess2.en();
	    System.out.println();

	    
	    //******ALICE send  message to bob******
	    
		   
	    System.out.println("write a response to bob :");

	    String encryptbobmess3 = scan.nextLine();
	    encryption encryptmess3 = new encryption(bkey.n,encryptbobmess3);
	    encryptmess3.en();
	    System.out.println();

	    
	    
	    //*** charlie intercept ***
	    System.out.println("charlie intercept lentgh of message "+ encryptmess3.messa.size()+" character");
	    
	    //**** bob decrypt alice message
	    
	    System.out.println();
	    System.out.println("**************** Bob ***************");
	    System.out.println("I'm Bob, I received an encrypted message :");
	    encryptmess3.messagencrypted();
	    System.out.println( "copy/paste here alice's encrypted message :");
	    String encryptedm4 = scan.nextLine();
	    String [] decryptionm4 = encryptedm4.split(" ");
		decryption decryptmess4= new decryption(bkey.d,bkey.n,decryptionm4);

	    decryptmess4.en();
	    System.out.println();
	    
	    
	    
	     System.out.println("-------------what charlie knows ? ---------- :");
	     System.out.println("alice public key");
	     System.out.println("bob public key");
	     System.out.println("length of each messages");
	     System.out.println("number of identical charactere");
	     System.out.println("he can guess what are themost identical char and verify if its true using ASCCI code andpublic key");



	    

	    
	    
	    

	}
	
	
	
}
