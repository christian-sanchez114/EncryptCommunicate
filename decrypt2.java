import java.math.BigInteger;
import java.util.ArrayList;
	
public class decrypt2 {

		 BigInteger e=BigInteger.valueOf(65537);
		 BigInteger n;
		 String []m;
		 ArrayList<BigInteger>mess;
		 int ascii;
		 
		 decrypt2(BigInteger n,String[] m){
			 
			 this.n=n;
			 this.m=m;			 
			 
		 }
		 void en(){
		  ArrayList<BigInteger>decrypt=new ArrayList<>();

		  //*****calculate each bit to decrpyt*****
		  for(int i=0;i<m.length;i++){
			  BigInteger alpha=new BigInteger(m[i]);
			  
			  //use e to decrypt the message with n
			  decrypt.add(alpha.modPow(this.e,this.n));		 
		 }
		  
		//*****print each calculation to get assci code and give the char that corespond to ascci code***** 
		  for(int i=0;i<decrypt.size();i++){
			  int b=  decrypt.get(i).intValue();
			  char retour=(char)b;
			  System.out.print(retour);		  
		  }
		

		  
		 }
	}
