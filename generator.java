import java.math.BigInteger;
import java.util.ArrayList;

public class generator {
	
	  public BigInteger p;
	  public int a;
	  public int b;
      ArrayList<BigInteger> al=new ArrayList<BigInteger>();  
      gen g = new gen();
	  BigInteger rand1 = g.generate();


	 
		 
	
	public BigInteger  generate(){
		
		al.clear();

		this.p=rand1;
		
		int count=0;
		BigInteger one=BigInteger.valueOf(1);
		//**** start from the random number to random+1000 ****
		outerloop:
			for (BigInteger i=p;i.compareTo((p.add(BigInteger.valueOf(1000))))<0;i=i.add(one)){
				
				innerloop:
					//**** divisor from 1 to random ( increment 1 to  random for each outer loop*****
					for(BigInteger j=BigInteger.valueOf(1);j.compareTo(i)<0;j=j.add(one)){
						
						if( i.mod(j).equals(BigInteger.valueOf(0))){
							count++;
							}
						//****more than 2 factor, so its not a prime, break loop and check next one***
						if(count>2 )
							break innerloop;
						}
		//**** if maximum of factor is 2, then its a prime. add it in a list al***
		if(count<=2){
			al.add(i);
			}
		//**** I need only one prime , so if list =1 no point to continue the loop. break the loop and return the prime
		if(al.size()==1){
			break outerloop;
			}
		
		count=0;
		}
				
		return al.get(0);
				
	}	  
	  
}