package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	
	private String registroEducacao;
	private Integer tempoDirecao;
	private String titulacao;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor() {}
	
	
	
	
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}





	private String login;
	private String senha;
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public Integer getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(Integer tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	} 
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3900.78;
	}
	
	
	@Override
	public boolean autenticar(String login, String senha) {
		
		this.login = login;
		this.senha = senha;

		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("rubens") && senha.equals("123");
		
	}
	
	
	   

}
