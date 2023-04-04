package verificaZani;

public class Moto extends Veicolo{

	public Moto(String marca, String modello, double prezzo, double kmperc, String nome, String cognome) {
		super(marca, modello, prezzo, kmperc, nome, cognome);
		// TODO Auto-generated constructor stub
	}
	public double getPrezzo() {
		double prezzo2=prezzo-(0.2*kmperc);
		if(prezzo2>=0) {
			return prezzo2;
		}else {
			return 0;
		}
	}

}
