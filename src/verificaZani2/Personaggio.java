package verificaZani2;

public class Personaggio {
	protected int forzafisica;
	public Personaggio(int fs) {
		setForzaFisica(fs);
	}
	public void setForzaFisica(int fs) {
		this.forzafisica=fs;
	}
	public int getForzaFisica() {
		return forzafisica;
	}

}
