package verificaZani2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Eroe e=new Eroe();
		Vampiro v=new Vampiro();
		Licantropo l=new Licantropo(false); 
		System.out.println("oggi c'e luna piena?\npremi 1 per dire di si");
		if(sc.nextInt()==1) {
			l.setLuna(true);
		}
		
		e.combatti();
		e.combatti();
		e.combatti();
		
		v.azzanna();
		
		l.combatti();
		l.combatti();
		
		System.out.println("Forza fisica eroe "+e.getForzaFisica());
		System.out.println("Forza fisica vampiro "+v.getForzaFisica());
		System.out.println("Forza fisica licantropo "+l.getForzaFisica());
		
	}

}
