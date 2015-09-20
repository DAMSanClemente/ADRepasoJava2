package adatosrepaso1;

public class Motocicleta extends Vehiculo{
	int numOcupantes;
	
	public Motocicleta(String cor, int nRued, double cilin,double pot,int ocup){
		this.color=cor;
		this.numRueda=nRued;
		this.cilindrada=cilin;
		this.cv=pot;
		this.numOcupantes=ocup;
		this.impuesto=this.cilindrada/30 + this.cv + 30;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	@Override
	public String toString(){
		String txt= super.toString()+"\nNúmero de Ocupantes:"+this.numOcupantes;
		return txt;
	}
}
