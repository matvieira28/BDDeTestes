package flashcode2;

import java.util.Scanner;

  public class Autoescola {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Bem vindo a Pizzaria Italia");
		System.out.println("");
		System.out.println("A melhor Pizzaria Italiana de S�o Paulo");
		System.out.println("");
		System.out.println("Aten��o entregas somente por retirada e pagamentos somente em avista em dinheiro");
		System.out.println("");
		System.out.println("Fa�a seu pedido pelo chat ou entre em contato conosco : 9999-9999");
		System.out.println("");
		System.out.println("No cardapio de hoje temos os seguintes sabores: Calabresa, Mussarela, Atum, Portuquesa, 4 queijos. ");
		System.out.println("");
		System.out.println("Selecione aqui o Sabor");
		
		
        String Sabores =  sc.next();
	    
	    switch (Sabores) {
	    
	    case "Calabresa":
	    	System.out.println("Com o Sabor Escolhido, Agora selecione o Tamanho."
	    			+ "Temos tr�s op��es - Pequena: R$10,00 - Media:R$15,00 - Grande:R$20,00");
	    	
	    	break;
	    	
	    case "Mussarela":
	    	System.out.println("Muito bem escolhido, Agora selecione o Tamanho."
	    			+ "Temos tr�s op��es - Pequena: R$10,00 - Media:R$15,00 - Grande:R$20,00");
	    	
	    break;
	    
	    
	   
	   
	    case "Atum":
	    	System.out.println("Excelente escolha, Agora selecione o Tamanho."
	    			+ "Temos tr�s op��es  - Pequena: R$10,00 - Media:R$15,00 - Grande:R$20,00");
	    	
	    break;
	   
	    
	    
	    case "Portuguesa":
	    	System.out.println("Com o Sabor Escolhido, Agora selecione o Tamanho."
	    			+ "Temos tr�s op��es - Pequena: R$10,00 - Media:R$15,00 - Grande:R$20,00");
	    	
	    	break;
	    	
	    case "4 Queijos":
	    	System.out.println("Muito bem escolhido, Agora selecione o Tamanho."
	    			+ "Temos tr�s op��es - Pequena: R$10,00 - Media:R$15,00 - Grande:R$20,00");
	    	
	    break;
	    
	    
	    
	    
	    
	   
	    
	    }
	
	    String Tamanhos =  sc.next();
		  
	    switch (Tamanhos) {
	    

    
    case "Pequena":
    	
    	System.out.println("Perfeito! O valor de seu pedido ficou R$10,00 ");
    	System.out.println("Sua pizza ficar� pronta em 20 minutos");
    	System.out.println("O endere�o para retirada:Av. Marta Maria Bernades n�1527 - S�o Paulo.");
	    System.out.println("Para fazer receber seu pedido apresente esse codigo 78093");
	    
	    break; 

	       
    case "Medio":
    	
    	System.out.println("Parab�ns! O valor de seu pedido ficou R$20,00 ");
    	System.out.println("Sua pizza ficar� pronta em 30 minutos");
    	System.out.println("O endere�o para retirada:Av. Marta Maria Bernades n�1527 - S�o Paulo.");
	    System.out.println("Para fazer receber seu pedido apresente esse codigo 67893");

	    break; 
	    
	    
  case "Grande":
    	
    	System.out.println("�timo! O valor de seu pedido ficou R$50,00 ");
    	System.out.println("Sua pizza ficar� pronta em 40 minutos");
    	System.out.println("O endere�o para retirada:Av. Marta Maria Bernades n�1527 - S�o Paulo.");
	    System.out.println("Para fazer receber seu pedido apresente esse codigo 73056");

	    
	    break; 
	    
	    
 
	    
	    
	    
}
}



	
		

		

	

		
		
		}
		
          
		
     
	
	
	
	

