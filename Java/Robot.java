import java.util.Scanner;
import java.util.Random;

public class Robot {
	

	Scanner entrada = new Scanner(System.in);
	Random aleatorios = new Random();

	//Atributos
	String numeroSerie;
	String nombre;
	int nivelBateria;
	boolean encendido;


	public Robot(String ns, String n, int nb, boolean e) {
		numeroSerie = ns;
		nombre = n;
		nivelBateria = nb;
		encendido = e;
	}


	//SETTERS
	public void setNumeroSerie(String ns) {
		numeroSerie = ns;
	}


	public void setNombre(String n) {
		nombre = n;
	}

	public void setNivelBateria(int nb) {
		nivelBateria = nb;
	}

	public void setEstatus(boolean e) {
		encendido = e;
	}


	//GETTERS
	public String getNumeroSerie() {
		return numeroSerie;
	}

	public String getNombre() {
		return nombre;
	}


	public int getNivelBateria() {
		return nivelBateria;
	}


	public boolean getEstatus() {
		return encendido;
	}

	//Metodos

	public String toString() {
		return "ROBOT: " + numeroSerie + ", se llama: " + nombre + "NV: " + nivelBateria;
	}


	public void saluda() {
		if(this.getEstatus()==true) {
			System.out.println("Hola soy el robot: " + this.numeroSerie + " y me llamo: " + this.nombre);
			restaEnergia(10);
		} else {
			System.out.println(" ZZZZZZ ");
		}

	}


	public void menuOperaciones() {
		System.out.println("***** MENÚ DE OPERACIONES ******");
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICACIÓN");
		System.out.println("4. DIVISIÓN");
	}


	public void operaciones() {
		if(this.getEstatus()==true) {
			menuOperaciones();
			System.out.println("Escribe la opción del menú: ");
			int opcion;
			int a;
			int b;
			opcion = entrada.nextInt();
			System.out.println("Escribe el primer operador: ");
			a = entrada.nextInt();
			System.out.println("Escribe el segundo operador: ");
			b = entrada.nextInt();
			int calculo=0;
			switch(opcion) {

				case 1:
					calculo=a+b;
					System.out.println("SUMA: " + calculo);
					break;
				case 2:
					calculo=a-b;
					System.out.println("RESTA: " + calculo);
					break;
				case 3:
					calculo=a*b;
					System.out.println("MULTIPLICACIÓN: " + calculo);
					break;
				case 4:
					calculo=a/b;
					System.out.println("DIVISIÓN: " + calculo);
					break;
				default:
					System.out.println("Operación inválida");
					break;
			}

			restaEnergia(15);
			

		} else {
			System.out.println(" ZZZZZZ ");
		}
	}


	public void restaEnergia(int valor) {
		int bateriaActual = this.getNivelBateria();
		int bateriaRestante = bateriaActual-valor;
		if(bateriaRestante<=0) {
			this.encendido=false;
		} 
		this.setNivelBateria(bateriaRestante);
	}



	public void jugar() {
		if(this.getEstatus()==true) {

			//El robot genera un número aleatorio del 1 a al 100
			int numeroSecreto = aleatorios.nextInt(100)+1;
			//System.out.println(numeroSecreto);
			int opcionUsuario=0;
			System.out.println("PENSÉ UN NÚMERO ENTRE 1 Y 100, trata de adivinarlo en 3 intentos");
			opcionUsuario= entrada.nextInt();



				int contador=1;
				while(contador<=2) {

					if(numeroSecreto==opcionUsuario) {
						System.out.println("ADIVINASTE!!!");
						break;
					} else {

						System.out.println("FALLASTE: ");
						if(numeroSecreto< opcionUsuario) {
							System.out.println("Intenta con un valor más bajo: ");
						} else {
							System.out.println("Intenta con un valor más alto: ");							
						}
						opcionUsuario= entrada.nextInt();

					}
					contador++;
				}

				if(contador==3) {
					System.out.println("LASTIMA PERDISTE, yo pensé en el número: " + numeroSecreto);

				}


				restaEnergia(35);

		} else {
			System.out.println(" ZZZZZZ ");
		}

	}


	public void cargarTodaBateria() {
		this.setNivelBateria(100);
		this.encendido=true;
	}




}

>>>>>>> Stashed changes
