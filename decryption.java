import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class decryption {

	 BigInteger n;
	 BigInteger p;
	 String []m;
	 ArrayList<Character>mess=new ArrayList<>();
	 ArrayList<BigInteger>decrypt=new ArrayList<>();

	 int ascii;
	 
	 decryption(BigInteger p,BigInteger n,String[] m){
		 
		 this.n=n;
		 this.m=m;
		 this.p=p;
		 
		 
	 }
	 void en(){
		 
		 

	  //*****make calculation for each bit to decrypt in ascci formula : m=c^d mod n *****
	  for(int i=0;i<m.length;i++){
		  BigInteger alpha=new BigInteger(m[i]);
		  alpha=alpha.modPow(p, n);
		  
		  decrypt.add(alpha);		 
	 }
	  
	  //*****print each calculation to get assci code and give the char that corespond to ascci code***** 
	  for(int i=0;i<decrypt.size();i++){
		  int b=  decrypt.get(i).intValue();
		  char retour=(char)b;
		  mess.add(retour);
		  //System.out.println(m[i]+"----> "+m[i]+"^"+p+"mod "+n+" = ASCCI "+b+" ----decripted-----> "+retour);		  
	  }
	  
	  
	  
	  System.out.println();
	  System.out.println("your message decoded :");


	  //****print message decoded****
	  for(int i=0; i<mess.size();i++){
		  System.out.print(mess.get(i));

		  
	  }
	  
	  System.out.println();
	  System.out.println();
	

	  
	 }
	 void decryptdetails(){
		 
		 
		  for(int i=0;i<decrypt.size();i++){
			  int b=  decrypt.get(i).intValue();
			  char retour=(char)b;
			  mess.add(retour);
			  System.out.println(m[i]+"----> "+m[i]+"^"+p+"mod "+n+" = ASCCI "+b+" ----decripted-----> "+retour);		  
		  }
		 
		 
	 }
}