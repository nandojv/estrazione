package profesercizi;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class estrazionelotto {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=1;
		int max=90;
		 String genera;
		int cont=0;
		
		
		System.out.println("------premere   generare--------");
		
		
		do {
		Scanner num = new Scanner(System.in); 
		   genera = num.nextLine();
		
		Random tombola =new Random();

		int a= tombola.nextInt(min+max);
		System.out.println(a);
		cont++;
		
		
		
	}
while(cont<5);
	
		System.out.println("estrazione prima ruota");
		
	}
	
}
