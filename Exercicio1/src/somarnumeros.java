import java.util.*;

public class somarnumeros {
	public static Scanner scr= new Scanner(System.in);

	
	public static void main(String args[]){
		//variaveis
		int x, y, z; 
		
		//ler primeiro numero
		System.out.println("Primeiro numero:");
		x = scr.nextInt();
		//ler segundo numero
		System.out.println("Segundo numero:");
		y = scr.nextInt();
		
		//soma
		
		z= x + y;
		
		//mostra soma
		System.out.println("Soma:" + z);
	}
}
