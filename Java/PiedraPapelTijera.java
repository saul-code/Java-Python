import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera{

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		//Incio del programa
		System.out.println("\t--- Piedra, Papel o Tijera --- \n Escribe una opcion para jugar:\tPiedra, Papel o Tijera");
		String opcionJugador = entrada.next();
		boolean validacion = (valido(opcionJugador)) ? true: false ;
		System.out.println(validacion);


	}

	//metodos
	//validacion de entrada
	public static boolean valido(String a){
		String entrada = a.toUpperCase();
		if(entrada.equals("PIEDRA") || entrada.equals("PAPEL") || entrada.equals("TIJERA")){
			return true;
		} else {
			return false;
		}


	}
}
