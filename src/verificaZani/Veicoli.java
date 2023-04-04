package verificaZani;

public class Veicoli {
	private Veicolo[] veicoli;
	private int nve=0;
	public Veicoli() {
		veicoli=new Veicolo[100];
	}
	public void addV(Veicolo v) {
		veicoli[nve]=v;
		nve++;
	}
	public void quantiHanno(int n) {
		int connta=0;
		for(int i=0; i<nve; i++) {
			
			if(veicoli[i] instanceof Auto) {
				Auto a=(Auto) veicoli[i];
				if(a.getNum_porte()==n) {
					connta++;
				}
			}
		}
		System.out.println("ci sono "+connta+" auto con "+n+ "porte");
	}
	public void aggiungiKm(double km,String modello) {
		if(km>=0) {
			for(int i=0; i<nve; i++) {
				if(veicoli[i].getModello().equals(modello)) {
					veicoli[i].addKM(km);
				}
			}
		}
		
	}
	public void stampaVeicoli() {
		for(int i=0; i<nve; i++) {
			System.out.println(veicoli[i].getMarca()+" "+veicoli[i].getModello()+" "+veicoli[i].getPrezzo());
		}
	}
	
	
}
