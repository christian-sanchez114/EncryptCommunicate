import java.math.BigInteger;
import java.util.ArrayList;

public class encryption {
	
	 BigInteger e=BigInteger.valueOf(65537);
	 BigInteger n;
	 String m;
	 ArrayList<BigInteger>mess;
	 int ascii;
	 ArrayList<BigInteger>messa=new ArrayList<>();
	 ArrayList<BigInteger>encrypt=new ArrayList<>();
	 
	 encryption(BigInteger n,String m){
		 
		 this.n=n;
		 this.m=m;
		 
		 
	 }
	 void en(){
	

	 
	  //**** get ASCCI value for each char and add in array messa****
	  for(int i=0;i<m.length();i++){
		  ascii=m.charAt(i);
		  BigInteger a=BigInteger.valueOf(ascii);
		  messa.add(a);
		  }
	 
	  
	  //**** go through array messa and encrypt ASCII code using this formula : c=m^e mod n
	  for(int j =0; j<messa.size();j++){
		  encrypt.add(messa.get(j).modPow(this.e,this.n));
		  //System.out.println(m.charAt(j)+" : ASCII----> "+messa.get(j)+" encrypt -----> ("+ messa.get(j)+"^"+this.e+") mod "+n+"="+messa.get(j).modPow(this.e,this.n));

 
	  }
	  System.out.println();

	  System.out.println("your message mencrypted :");

	  for(int i=0;i<encrypt.size();i++){
	  System.out.print(encrypt.get(i)+" ");
	  }
	    System.out.println();

	
	  	  
	 }
	 
  void messagencrypted(){
		  
		  for(int i=0;i<encrypt.size();i++){
			  System.out.print(encrypt.get(i)+" ");
			  }
		    System.out.println();

	  }
	 void printdetails(){
		 
		  for(int j =0; j<messa.size();j++){
			  encrypt.add(messa.get(j).modPow(this.e,this.n));
			  System.out.println(m.charAt(j)+" : ASCII----> "+messa.get(j)+" encrypt -----> ("+ messa.get(j)+"^"+this.e+") mod "+n+"="+messa.get(j).modPow(this.e,this.n));

	 
		  }
		  System.out.println();

		  System.out.println("your message encrypted :");

		  for(int i=0;i<encrypt.size();i++){
		  System.out.print(encrypt.get(i)+" ");
		  }
		  System.out.println();
		  System.out.println();
		 
	 }
	 
}