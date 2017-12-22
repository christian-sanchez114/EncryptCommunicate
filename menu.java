import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Mohit Sharma 33356562 mshar051@gold.ac.uk
// Mohamed Bhailat 33433114 mbhai002@gold.ac.uk
// Christian Sanchez-Campo 33427119 csanc010@gold.ac.uk

public class menu {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int menu=0;
			// print menu 
			Scanner sc = new Scanner(System.in);
			System.out.println("1 --> encrypt message");
			System.out.println("2 --> decrypt message");
			System.out.println("3 --> generator  public and private key");
			System.out.println("4 --> simulate a comunication between alice and bob");
			System.out.println("5 --> protocol");
			System.out.println("");
			
			
	
			while(menu<1 || menu >7){

			System.out.println("choose a number from the menu and press enter");
			menu=Integer.parseInt(sc.next());

			switch (menu){
			
			  case 1:
				
				  menu1 menu1= new menu1();
				  menu1.Menu1();
				  menu=0;
				  break;
			  
			  case 2:
				  
				  menu2 menu2= new menu2();
				  menu2.Menu2();
				  menu=0;
				  break;
			  
				  
				  
			  case 3:
				  
				  menu3 menu3=new menu3();
				  menu3.Menu3();
				  menu=0;
				  break;
			    
			  case 4:
				  
				  	menu4 menu4=new menu4();
				  	menu4.Menu4();
				  	menu=0;
				    break;
			
			  case 5:
				  
				  menu5 menu5=new menu5();
				  menu5.Menu5();
				  menu=0;
					  					  
				  break;
				  
			  default:
			    System.out.println("wrong number, back to main menu");
			    menu=0;
			    }
			}
			}		
}