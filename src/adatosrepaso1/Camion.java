package adatosrepaso1;

public class Camion extends Vehiculo{
	
	int numEjes;
	
	public Camion(String cor, int nRued, double cilin,double pot,int ejes){
		this.color=cor;
		this.numRueda=nRued;
		this.cilindrada=cilin;
		this.cv=pot;
		this.numEjes=ejes;
		this.impuesto=this.cilindrada/30 + this.cv*20 +this.numRueda*20 +this.numEjes*50; 
		
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}
	
	public String toString(){
		
		return super.toString()+"\nNúmero de ejes:"+this.numEjes;
	}
}
