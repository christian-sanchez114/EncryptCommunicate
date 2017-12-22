
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class menu5 {
	
	void Menu5(){
	
	System.out.println("Needham Schroeader Protocol");
	   
	  //**** make Alice's keys and prime ****
	  BigInteger alicep; //p
	  BigInteger aliceq; //q
	  
	  //*****generate public and private key*****
	  generator alicegenerator1= new generator();
	  generator alicegenerator2= new generator();
	  alicep=alicegenerator1.generate();
	  aliceq=alicegenerator2.generate();
	  key alicekey = new key(alicep,aliceq);
	  
	  System.out.println("alice key : ");
	  alicekey.keys();
	  System.out.println();

	  //**** make Server's keys and prime ****
	  BigInteger serverp; //p
	  BigInteger serverq; //q
	  
	  //*****generate public and private key*****
	  generator servergenerator1= new generator();
	  generator servergenerator2= new generator();
	  serverp=servergenerator1.generate();
	  serverq=servergenerator2.generate();
	  key serverkey = new key(serverp,serverq);
	  
	  System.out.println("Server Key :");
	  serverkey.keys();
	  System.out.println();

	  //**** make Bob's keys and prime ****
	  BigInteger bobp; //p
	  BigInteger bobq; //q
	  
	  //*****generate public and private key*****
	  generator bobgenerator1= new generator();
	  generator bobgenerator2= new generator();
	  bobp=bobgenerator1.generate();
	  bobq=bobgenerator2.generate();
	  key bobkey = new key(bobp,bobq);
	  
	  System.out.println("bob's Key");
	  bobkey.keys();
	  System.out.println();

	  System.out.println("************* Server Screen**********");
	  System.out.println("Dear Server, This is Alice and I would like to get B’s public key. Yours sincerely, A.");
	  System.out.println();
	  
	  System.out.println("************* Alice Screen**********");
	  System.out.println("ALERT!! ALICE GOT A ENCRYPTED MESSAGE");
	  String serverAmessage = "Dear A, Here is B’s public key: "+bobkey.n.toString()+" signed by me. Yours sincerely, S.";//message to be encrypted
	  

	  //*****Encrypt the servers message serverAmessage using public and private key*****
	  encrypt2 Serverencrypt2 = new encrypt2(serverkey.d, serverkey.n,serverAmessage);
	  Serverencrypt2.en();
	  
	  
	  System.out.println("You are Alice! - Decrypt Server's Message using Server's Public Key to make sure it is the Server");
	  
	  System.out.println("Enter the ENCRYPTED message you recieved");
	    Scanner scan = new Scanner(System.in);  //receives input from the console
	    String Serverencrypted = scan.nextLine();
	    String[] serverparts = Serverencrypted.split(" ");
	    
	    System.out.println("Server's Public Key is:");
	    serverkey.keys();
	    
		System.out.println("Enter the SERVER'S public key");
		System.out.println();
		BigInteger serverpublicK=scan.nextBigInteger(); //take in public key through scanner
		decrypt2 serverdecrypt2= new decrypt2(serverpublicK, serverparts);
		
		serverdecrypt2.en();
		System.out.println(" ");
	  
	    System.out.println("-----------------------------------");
	    System.out.println("Alice now has Bob's key - assume she uses Bob's Public Key to send Bob a message");
	    System.out.println("Please enter the message you want to send to Bob");
	    Scanner scan2 = new Scanner(System.in);  //receives input from the console

	    //*****message to alice in input of the user*****
	  String alicemessage;
	  alicemessage=scan2.nextLine();
	  
	  //*****encrypt this using bob's public key*****
	  encryption bobencrypt = new encryption(bobkey.n,alicemessage);
	  System.out.println();	    
	  
	  System.out.println("************* Bob Screen**********");
	  System.out.println("ALERT!!! - Bob Received An Encrypted Message");
	    
	  bobencrypt.en();
	  System.out.println("");
	  //*****Print Encrypt Alice's Message using Bob's Public Key*****
	  
      System.out.println("-----------------------------------");
	  System.out.println("You Are Bob!");
	  System.out.println("Decrypt The Message you was sent using YOUR Private Key");
	  System.out.println("enter the ENCRYPTED message");
	  
	    String Aliceencrypted; //encrypted message will be put here
	    Aliceencrypted=scan2.nextLine();
	    String[] Aliceparts = Aliceencrypted.split(" ");
	    System.out.println("here"+Aliceparts[0]);

	    System.out.println("Bob's Keys: ");
	    bobkey.keys();

		System.out.println("enter YOUR public key");
		BigInteger bobpublic = scan.nextBigInteger();//input public key
		System.out.println("enter YOUR private key");
		BigInteger bobprivate=scan.nextBigInteger(); //input private key
		
	
		//*****Decrypt message using aliceparts using public key and private key*****
		decryption bob2decrypt= new decryption(bobprivate,bobpublic,Aliceparts);
		
		bob2decrypt.en();
		System.out.println(" ");
		System.out.println("********* Server Screen *************");
		System.out.println("Dear Server, This is Bob and I would like to get Alice’s public key. Yours sincerely, B.");
		System.out.println(" ");

		System.out.println("********* Bob Screen *************");
		System.out.println("ALERT!! BOB GOT AN ENCRYPTED MESSAGE");
		String serverBmessage = "Dear B, Here is A’s public key: "+alicekey.n.toString()+" signed by me. Yours sincerely, S."; //message to be encrypted
  
		//*****Encrypt message using serverBmessage using public key and private key of server*****
		encrypt2 ServerBencrypt2 = new encrypt2(serverkey.d, serverkey.n,serverBmessage);
   		ServerBencrypt2.en();		  
  
   		System.out.println("You are BOB! - Decrypt Server's Message using Server's Public Key to make sure it is the Server");
  
   		System.out.println("Enter the ENCRYPTED message you recieved!");
   		Scanner scan3=new Scanner(System.in); //input message
   		String ServerBencrypted = scan3.nextLine();
   		
   		String[] serverBparts = ServerBencrypted.split(" ");
   		serverkey.publickeys();
   		
   		System.out.println("Enter the SERVER'S public key");
   		BigInteger serverBpublicK=scan.nextBigInteger();
   		
     	//*****Decrypt message using serverBparts using public key and private key*****
   		decrypt2 serverBdecrypt2= new decrypt2(serverBpublicK, serverBparts);
   		serverBdecrypt2.en();
   		System.out.println(" ");				  

   	System.out.println("-----------------------------------");
   		System.out.println("Bob now has Alice's key - assume she uses Alice's Public Key to send Alice a message");
   		System.out.println("Please enter the message you want to send to Alice");
   		
   		Scanner scan4=new Scanner(System.in);
   		String bobmessage; //input message
   		bobmessage = scan4.nextLine();
	    
   	    //*****Encrypt message Alice using public key*****
	    encryption alice3encrypt = new encryption(alicekey.n,bobmessage);
	   			    
	  System.out.println("************ Alice Screen ***********");
	    System.out.println("ALERT!!! - Alice Recieves ENCRYPTED MESSAGE");
	    
	    alice3encrypt.en();
	    System.out.println("");	
	    
		System.out.println("You Are Alice!");
		System.out.println("DECRYPT the ENCRYPTED message you recieved");
		System.out.println("enter the ENCRYPTED message");
		    
   		Scanner scan5=new Scanner(System.in);
		String bob4encrypted = scan5.nextLine();
		String[] bobparts = bob4encrypted.split(" ");

		System.out.println("Your Keys: ");
		alicekey.keys();
		
		System.out.println("enter YOUR public key");
		BigInteger AprivK = scan.nextBigInteger(); //input public key
		System.out.println("enter YOUR private key");
		BigInteger ApubK=scan.nextBigInteger(); //input private key
	
		//*****Decrypt message using bobparts using Alice public key and private key*****
		decryption alice4decrypt= new decryption(ApubK,AprivK,bobparts);
		
		System.out.println("Decrypted message:");
		alice4decrypt.en();
		System.out.println(" ");
	  
	
	System.out.println("You are Alice!");
		System.out.println("Please enter the message you want to send to Bob");
	  
		String bob2message; //input message
   		Scanner scan6=new Scanner(System.in);
		bob2message = scan6.nextLine();
		
		//*****Encrypt message using bob's public key*****
	    encryption bob3encrypt = new encryption(bobkey.n,bob2message);
	   			    
	  System.out.println("************** Bob Screen ***********");
	    System.out.println("ALERT!!! BOB RECIEVES ENCRYPTED MESSAGE");
	    
	    bob3encrypt.en();
	    System.out.println("");	
	    
	  System.out.println("-----------------------------------");
	    System.out.println("You Are Bob, DECRYPT the message recieved");
	    System.out.println("enter the ENCRYPTED message");
	    
		String bob5encrypted = scan6.nextLine();
		String[] bob5parts = bob5encrypted.split(" ");
		
		System.out.println("Bob's Key: ");
		bobkey.keys();
		
		System.out.println("enter YOUR public key");
		BigInteger BpubK = scan.nextBigInteger(); //input public key
		System.out.println("enter YOUR private key");
		BigInteger BprivK=scan.nextBigInteger(); //input private key
							
		//*****Decrypt message using bob5parts using public key and private key*****
		decryption bob5decrypt= new decryption(BprivK,BpubK,bob5parts);
			
		System.out.println("The DECRYPTED message:");
		bob5decrypt.en();
		System.out.println(" ");
	  
	  System.out.println("-----------------------------------");

}
}