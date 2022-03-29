package br.com.marcacaoexames.domain;

public class Paciente {
	private int CodPaciente;
	private String Nome;
	private String Sobrenome;
	private String Telefone;
	private String Email;
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(Nome);
		sb.append(" ");
		sb.append(Sobrenome);
		sb.append(";");
		sb.append(Telefone);
		sb.append(";");
		sb.append(Email);
		
		return sb.toString();
	}
	
	public int getCodPaciente() {
		return CodPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		CodPaciente = codPaciente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	private String getTelefone() {
		return Telefone;
	}
	private void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}
