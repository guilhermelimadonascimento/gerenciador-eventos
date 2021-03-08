package ifrn.com.gerenciadoreventos.model;

public class Participante {
	private String cpf;
	private String nome;
	private String email;
	private int telefone;
	private Login login;
	private String tipoParticipante;	
	
	public Participante() {
		super();
	}

	public Participante(String cpf, String nome, String email, int telefone, Login login, String tipoParticipante) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.login = login;
		this.tipoParticipante = tipoParticipante;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getTipoParticipante() {
		return tipoParticipante;
	}

	public void setTipoParticipante(String tipoParticipante) {
		this.tipoParticipante = tipoParticipante;
	}
	
}
