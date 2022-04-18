package br.edu.infnet.solicitacaoDeExames.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TPaciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codPaciente;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String email;
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(" ");
		sb.append(sobrenome);
		sb.append(";");
		sb.append(telefone);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	
	public int getCodPaciente() {
		return codPaciente;
	}
	public void setCodPaciente(int codPaciente) {
		codPaciente = codPaciente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		sobrenome = sobrenome;
	}
	private String getTelefone() {
		return telefone;
	}
	private void setTelefone(String telefone) {
		telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
}
