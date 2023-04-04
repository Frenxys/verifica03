package verificaZani2;

public class Licantropo extends Personaggio implements Umano,Mostro{
	private boolean luna;
	public Licantropo(boolean luna) {
		super(10);
		setLuna(luna);
	}
	@Override
	public void azzanna() {
		// TODO Auto-generated method stub
		forzafisica-=2;
	}

	@Override
	public void combatti() {
		if(luna) {azzanna();}else {
			forzafisica-=3;
		}
	}
	public boolean isLuna() {
		return luna;
	}
	public void setLuna(boolean luna) {
		this.luna = luna;
		if(luna) {
			forzafisica+=5;
		}
	}

}
