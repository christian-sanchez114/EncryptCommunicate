import java.math.BigInteger;

public class menu3 {
	
	
	void Menu3(){
	
	
	
    System.out.println("-------------generator of private and public key-------------");
    System.out.println("");
	
    BigInteger p;
    BigInteger q;

    generator generator3= new generator();
    generator generator4= new generator();   
    
    
    //****find the next prime number of rand1 and rand2*****
    p=generator3.generate();
    q=generator4.generate();
    
    
    //***** generate random number between 100 and 1000****
    System.out.println("generate random 1 "+generator3.p);
    System.out.println("generate random 2 "+generator4.p);
    System.out.println("");

    
    //**** print prime number ****
    System.out.println("next prime number prime1 if random 1 is not prime " + p);
    System.out.println("next prime number prime2 if random 2 is not prime "+q);
    System.out.println("");

    
      
    
    //*****print all formula to get public and private key*****
    key  key = new key(p,q);
    System.out.println("p= "+p);
    System.out.println("q= "+q);
    System.out.println("n = p*q ="+p+"*"+q+"="+key.n);
    System.out.println("phi =(p-1)*(q-1) = ("+p+"-1)*("+q+"-1)="+key.phi);
    System.out.println("e ="+ key.e);
    System.out.println("d = inverse of "+key.e+"mod phi("+key.phi+")= "+ key.d);
    System.out.println();


    
    //*****call function key to get private and public key*****
    key.keys();
    System.out.println();

	}

}
