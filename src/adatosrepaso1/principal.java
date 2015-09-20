package adatosrepaso1;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creamos una motocicleta roja, de 125cc y 25cv.");
		Motocicleta moto1 = new Motocicleta("rojo", 2 , 125.0 , 25.0 , 1);
		Motocicleta moto2 = new Motocicleta("verde", 2 , 125.0 , 25.0 , 2);
		Camion camion1 = new Camion("azul", 4,400.0,300.0,2);
		Camion camion2 = new Camion("blanco", 24,1500.0,0.0,6);
		moto1.setNumOcupantes(1);
		System.out.println(moto2.getCilindrada());
		camion2.setCv(800.0);
		System.out.println(moto1.toString());
		System.out.println(moto2.toString());
		System.out.println(camion1.toString());
		System.out.println(camion2.toString());
	}

}
