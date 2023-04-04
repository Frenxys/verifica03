package verificaZani;

public class Proprietario {
	private String nome;
	private String cognome;
	public Proprietario(String nome,String cognome) {
		setNome(nome);
		setCognome(cognome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
}
