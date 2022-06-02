package Steps;

import Metodos.MetodosJava;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsJava {

	MetodosJava m = new MetodosJava();
	
	
	@Given("^que o usuario acesse a URL  \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_URL(String site) throws Throwable {
     Thread.sleep(3000);		
	 m.abrirUrl(site);   
		
	 
	}

	@Given("^selecione o campo abrir conta$")
	public void selecione_o_campo_abrir_conta() throws Throwable {
		
	 m.BotaoAbrirConta();   
		
	}

	@Given("^selecione o tipo de pessoa fisica$")
	public void selecione_o_tipo_de_pessoa_fisica() throws Throwable {
	m.selecionarTipoPessoa();    
		
	}

	@Given("^preencha os dados$")
	public void preencha_os_dados() throws Throwable {
	m.preencherCampo();   
		
	}

	@When("^selcionar o botao quero abrir conta$")
	public void selcionar_o_botao_quero_abrir_conta() throws Throwable {
	 m.selecionarBotaoAbrirConta(); 
		
	}

	@Then("^realizo a validacao do texto falta pouco$")
	public void realizo_a_validacao_do_texto_falta_pouco() throws Throwable {
	    
	}

	}	
	
	
	
