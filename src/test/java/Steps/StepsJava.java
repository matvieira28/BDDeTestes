package Steps;

import Metodos.MetodosJava;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class StepsJava {

	MetodosJava m = new MetodosJava();
	
	@Dado("^que o usuario acesse a URL \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_URL(String arg1) throws Throwable {
	    m.abrirUrl(arg1);
	}

	@Dado("^selecione o campo abrir conta$")
	public void selecione_o_campo_abrir_conta() throws Throwable {
	    m.selecionarBotaoAbrirConta();
		
	}

	@Dado("^selecione o tipo de pessoa fisica$")
	public void selecione_o_tipo_de_pessoa_fisica() throws Throwable {
	 m.selecionarTipoPessoa();   
		
	
	}

	@Dado("^prencha os dados$")
	public void prencha_os_dados() throws Throwable {
	 m.preencherCampo();   
		
	}

	@Quando("^selecionar o botão quero abrir conta$")
	public void selecionar_o_bot_o_quero_abrir_conta() throws Throwable {
	 m.BotaoAbrirConta();   
		
		
	}

	@Entao("^realizo a valição do texto falta pouco$")
	public void realizo_a_valida_o_do_texto_falta_pouco() throws Throwable {
	   
		
		
	}	
	
	
	
}