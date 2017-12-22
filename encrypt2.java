import java.math.BigInteger;
import java.util.ArrayList;

public class encrypt2 {
		
		 BigInteger e=BigInteger.valueOf(65537);
		 BigInteger n;
		 BigInteger d;
		 String m;
		 ArrayList<BigInteger>mess;
		 int ascii;
		 
		 //*****inputs: decrypt, encrypt, message******
		 encrypt2(BigInteger d, BigInteger n, String m){
			 this.n=n;
			 this.m=m;
			 this.d=d;
		 }
		 
		 void en(){
		  ArrayList<BigInteger>messa=new ArrayList<>();
		  ArrayList<BigInteger>encrypt=new ArrayList<>();

		  //**** get ASCCI value for each char and add in array messa****
		  for(int i=0;i<m.length();i++){
			  ascii=m.charAt(i);
			  BigInteger a=BigInteger.valueOf(ascii);
			  messa.add(a);
			 
		 }
		  
		//**** go through array messa and encrypt ASCII code using this formula : c=m^d mod n
		  for(int j =0; j<messa.size();j++){
			  encrypt.add(messa.get(j).modPow(this.d,this.n));
	 
		  }
		  
		  for(int i=0;i<encrypt.size();i++){
		  System.out.print(encrypt.get(i)+" ");
		  }
		  
		  System.out.println();
		  	  
	}
}