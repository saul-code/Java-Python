import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera{

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		//Incio del programa
		System.out.println("\t--- Piedra, Papel o Tijera --- \n Escribe una opcion para jugar:\tPiedra, Papel o Tijera");
		String opcionJugador = entrada.next();
		String opcionMaquina = jugada();

		//Condicionales
		if(valido(opcionJugador)){

			

		}else {
			System.out.println("\tIngresa un valor valido :S");
		}
		


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

	//jugada maquina
	public static String jugada(){
		Random r = new Random();
		int a = r.nextInt(3);
		String valor = "";

		if(a == 1){
			valor = "PIEDRA";
		}else if(a == 2){
			valor = "PAPEL";
		} else if(a == 3){
			valor = "TIJERA";
		}
		return valor;

	}

	//jugar
	//public static boolean jugar(){}


}
