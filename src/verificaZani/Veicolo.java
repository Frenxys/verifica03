package verificaZani;

public class Veicolo {
	private String marca;
	private String modello;
	protected double prezzo;
	protected double kmperc;//km percorsi
	private Proprietario proprietario;
	public Veicolo(String marca,String modello,double prezzo,double kmperc,String nome,String cognome) {
		setMarca(marca);
		setModello(modello);
		setPrezzo(prezzo);
		setKmperc(kmperc);
		proprietario=new Proprietario(nome,cognome);
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		if(prezzo>=0) {
			this.prezzo = prezzo;
		}
		else {
			this.prezzo = 0;
		}
	}
	public double getKmperc() {
		return kmperc;
	}
	public void setKmperc(double kmperc) {
		if(kmperc>=0) {
			this.kmperc = kmperc;
		}else {
			this.kmperc=0;
		}
		
	}
	public void addKM(double km) {
		this.kmperc+=km;
	}
}
