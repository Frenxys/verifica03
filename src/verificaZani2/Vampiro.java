package verificaZani2;

public class Vampiro extends Personaggio implements Mostro{
	public Vampiro() {
		super(15);
	}
	public void azzanna() {
		forzafisica-=2;
	}

}
