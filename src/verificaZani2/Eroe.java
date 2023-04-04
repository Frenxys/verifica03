package verificaZani2;

public class Eroe extends Personaggio implements Umano{
	public Eroe() {
		super(10);
	}

	@Override
	public void combatti() {
		forzafisica-=3;
	}

}
