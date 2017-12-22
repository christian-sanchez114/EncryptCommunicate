import java.math.BigInteger;
import java.util.Scanner;

public class menu2 {
	
	void Menu2(){
	
	System.out.println("enter your encrypted message");
	System.out.println();
	System.out.println("i.e. :");
	System.out.println("2285 50838 45775 45775 67893 33483 48715 30145 33483 27066 16600 49867");
	System.out.println("public key : 79013");
	System.out.println("private key : 66593");
	System.out.println("NOTE:");
	System.out.println("you can copy/paste this one or put your own encrypted message using your private key and your public key.");
	System.out.println("don't remove spaces between numbers in your encrypted message");
	System.out.println();
	System.out.println("------------------write here----------");

	
    Scanner scan = new Scanner(System.in);  //receives input from the console
    String encrypted = scan.nextLine();
    String[] parts = encrypted.split(" ");

   

	System.out.println("enter your private key");
	BigInteger privateK=scan.nextBigInteger();
	System.out.println("enter your public key");

	BigInteger publicK=scan.nextBigInteger();
	
	
	decryption decrypt= new decryption(privateK,publicK,parts);
	
	
	decrypt.en();
	}

}
