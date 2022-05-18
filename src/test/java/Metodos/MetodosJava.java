package Metodos;

import Elementos.ElementosJava;
import Page.PageJava;

public class MetodosJava {
	
	
	ElementosJava e = new ElementosJava();
    PageJava p = new PageJava();
    
	
	public void selecionarBotaoAbrirConta() {
	
	p.clicar(e.getBtnAbrirConta());	
		
		
	
	}
	
	public void selecionarTipoPessoa() {
		
	p.clicar(e.getBtnPf());	
	
		
	}
   public void preencherCampo() {
	p.preencher(e.getCamponome(), "Mateus de Souza Vieira");   
	p.preencher(e.getCampocelular(), "111111111");   
	p.preencher(e.getCampoEmail(), "matviera18@gmail.com");
	p.preencher(e.getCampocpf(), "23165478950");
	
	
   }
   
	public void BotaoAbrirConta() {
		
		p.clicar(e.getBtnEnviar());

	}
	public void abrirUrl(String site) {
		p.abrirNavegador(site);
	}
}

