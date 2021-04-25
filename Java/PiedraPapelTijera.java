import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera{

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String opcionJugador = entrada.next();
		String opcionMaquina = jugada();
		String resultado = "";

		//Incio del programa
		System.out.println("\n\t--- Piedra, Papel o Tijera --- \n Escribe una opcion para jugar:\tPiedra, Papel o Tijera");
		

		//Condicionales
		if(valido(opcionJugador)){
			if( opcionJugador.toUpperCase().equals(opcionMaquina)){

				resultado = "\t Empate :/ \n";
			} else {

				 resultado = (jugar(opcionJugador,opcionMaquina))? "\t Ganaste :D\n":"\t Perdiste :C\n";
			}

			System.out.println(" La maquina eligio: " + opcionMaquina.toLowerCase());
			System.out. println(resultado);
		}else {

			System.out.println("\t Ingresa un valor valido :S \n");
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
	private static String jugada(){
		Random aleatorio = new Random();
		int a = aleatorio.nextInt(3);
		String valor = "";

		if(a == 0){
			valor = "PIEDRA";
		}else if(a == 1){
			valor = "PAPEL";
		} else if(a == 2){
			valor = "TIJERA";
		}
		return valor;

	}

	//jugar
	public static boolean jugar(String var1, String var2){
		String a = var1.toUpperCase();
		if( (a.equals("PIEDRA") && var2.equals("TIJERA")) ||  (a.equals("PAPEL") && var2.equals("PIEDRA")) || (a.equals("TIJERA") && var2.equals("PAPEL")) ){
			return true;
		} else {
			return false;
		}
	}


}
