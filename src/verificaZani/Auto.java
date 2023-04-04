package verificaZani;

public class Auto extends Veicolo{
	private int num_porte;
	public Auto(String marca, String modello, double prezzo, double kmperc, String nome, String cognome,int num_porte) {
		super(marca, modello, prezzo, kmperc, nome, cognome);
		setNum_porte(num_porte);
		// TODO Auto-generated constructor stub
	}
	public double getPrezzo() {
		double prezzo2=prezzo-(0.5*kmperc);
		if(prezzo2>=0) {
			return prezzo2;
		}else {
			return 0;
		}
	}
	public int getNum_porte() {
		return num_porte;
	}
	public void setNum_porte(int num_porte) {
		if(num_porte>=1) {
			this.num_porte = num_porte;
		}
		else {
			this.num_porte=0;
		}
		
	}

}
