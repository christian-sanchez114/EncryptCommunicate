import java.math.BigInteger;
import java.util.Scanner;

public class menu1 {
	
	//***** encrypt message with a generated public and private key****
	
	void Menu1(){
		
	Scanner sc = new Scanner(System.in);

	
	System.out.println("key generated");
	  
    //*****generate public and private key*****

    generator generator= new generator(); generator generator2= new generator();
    BigInteger pbis=generator.generate(),qbis=generator2.generate();
    
    key key = new key(pbis,qbis);
    key.keys();
	
	// *****print public that we will use to encrypt from the key generated before*****
    System.out.println();System.out.println();
    System.out.println(" write your  message to encrypt with a generated key "+key.n+ " and click enter : ");
    System.out.println("--------------------------------------------------------------");

    //***** user write message that he want to encrypt******
	String message=sc.nextLine();
    
	// *****create a new object encryption en call methode en() to encrypt message *****
    encryption encrypt = new encryption(key.n,message);
   	encrypt.en();
   	encrypt.printdetails();
   	
   	//sc.close();
	}

}
