import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class gen {
	

	BigInteger rand;
	
	//***** generate random number between 100 and 1000 ****
	BigInteger generate(){
		
		
		Random r = new Random();
		int Low = 1000;
		int High = 100000;
		BigInteger rand = BigInteger.valueOf(r.nextInt(High-Low) + Low);
				
		
		return rand;
		
		
	}
}