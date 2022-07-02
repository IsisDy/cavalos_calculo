package cavalos_cal;
import java.util.Scanner;

//Faça um programa em java para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras. 
//A informação de cavalos comprados deve ser informada pelo usuário.

// ------ o Calculo ------ //
// cada cavalo vai usar 4 ferraduras
// o programa vai multiplicar a quantidade de cavalos pelo numero de ferradoras que são 4 

public class cavalos { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cavalos; 
		int ferraduras = 4;
		
		System.out.println("Quantos Cavalos Deseja Comprar?: ");
		cavalos = input.nextInt();
		
		int total = (cavalos * ferraduras);
		
		System.out.println("Precisasse de " + total + " Ferraduras " + "Para Equipar " + cavalos + " Cavalos");

	}

}
