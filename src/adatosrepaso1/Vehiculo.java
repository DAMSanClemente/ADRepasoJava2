package adatosrepaso1;



public abstract class Vehiculo {

	String color;
	int numRueda;
	double cilindrada;
	double cv;
	double impuesto;
	
	public Vehiculo(){
		this.color="blanco";
		this.numRueda=4;
		this.cilindrada=1400.0;
		this.cv=74.5;
		this.impuesto=0.0;
	}
	public Vehiculo(String colour, int nrueda, double cil, double potencia){
		this.color=colour;
		this.numRueda=nrueda;
		this.cilindrada=cil;
		this.cv=potencia;
	}
	
	public Vehiculo getVehiculo(){
		return this;
	}
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumRueda() {
		return numRueda;
	}
	public void setNumRueda(int numRueda) {
		this.numRueda = numRueda;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getCv() {
		return cv;
	}
	public void setCv(double cv) {
		this.cv = cv;
	}
	@Override
	public String toString(){
		return "Datos del Vehículo: \n" + "Color:" + this.color + "\nNúmero de Rueda: " + this.numRueda + "\nCilindrada:" + this.cilindrada + "\nPotencia:" + this.cv+"\nImpuesto:"+this.impuesto;
			
	}
	
}

