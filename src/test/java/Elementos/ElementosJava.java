package Elementos;

import org.openqa.selenium.By;

public class ElementosJava {

	
	private By BtnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By BtnPf = By.id("bt1");
	private By Camponome = By.id("nome");
	private By Campocelular = By.id("telefone");
	private By CampoEmail = By.id("email");
	private By Campocpf = By.id("cpf");
    private By BtnEnviar = By.id("btnEnviar");
    
	public By getBtnAbrirConta() {
		return BtnAbrirConta;
	}
	public By getBtnPf() {
		return BtnPf;
	}
	public By getCamponome() {
		return Camponome;
	}
	public By getCampocelular() {
		return Campocelular;
	}
	public By getCampoEmail() {
		return CampoEmail;
	}
	public By getCampocpf() {
		return Campocpf;
	}
	public By getBtnEnviar() {
		return BtnEnviar;
	}
    
}

	

