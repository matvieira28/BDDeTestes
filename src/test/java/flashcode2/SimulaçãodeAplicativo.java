package flashcode2;

import java.util.Scanner;

public class SimulaçãodeAplicativo {

	

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Bem vindo a Pizzaria Italia");
		System.out.println("");
		System.out.println("A melhor Pizzaria Italiana de São Paulo");
		System.out.println("");
		System.out.println("Atenção entregas somente por retirada e pagamentos somente em avista em dinheiro");
		System.out.println("");
		System.out.println("Faça seu pedido pelo chat ou entre em contato conosco : 9999-9999");
		System.out.println("");
		System.out.println("No cardapio de hoje temos os seguintes sabores: Calabresa, Mussarela, Atum, Portuquesa, 4 queijos. ");
		System.out.println("");
		System.out.println("Para mais detalhes da Pizza digite: Igredientes");
		System.out.println("");
		
		
		
		
		String Sabor =  sc.next();
		  
	    switch (Sabor) {
	    	
	    case "Igredientes":
	    	
	    	System.out.println("");
	    	System.out.println("[Mussarela] - Oregano, mussarela, azeitona e tomate");
	    	System.out.println("");
	    	System.out.println("[Portuguesa] - Presunto, cebola, ovos e mussarela");
	    	System.out.println("");
	    	System.out.println("[Atum] - Cebola, mussarela e atum");
	    	System.out.println("");
	    	System.out.println("[Calabresa] - Calabresa e cebola fatiada");
	    	System.out.println("");
	    	System.out.println("[4Queijos] - Mussarela, catupiry, parmesão e provolone");
	    	System.out.println("");
	    	System.out.println("Digite o Sabor:");
	    	
	    	break; 
		
		
	    }
		
		
		
        String Pizzaria =  sc.next();
	    
	    switch (Pizzaria) {
	    
	    case "Calabresa":
	    	System.out.println("");
	    	System.out.println("Com o Sabor Escolhido");
	    	System.out.println("");
	    	System.out.println("Agora vamos de tamanhos");
	    	System.out.println("");
	    	System.out.println("Temos 3 opcões");
	    	System.out.println("");
	    	System.out.println("(A)- Pequeno");
	    	System.out.println("(B)- Médio");
	    	System.out.println("(C)- Grande");
	    	
	    	
	    	
	    	
	    	break;
	    	
	    case "Mussarela":
	    	    System.out.println("");
	    	    System.out.println("Muito bem escolhido");
		    	System.out.println("");
		    	System.out.println("Agora vamos de tamanhos");
		    	System.out.println("");
		    	System.out.println("Temos 3 opcões");
		    	System.out.println("");
		    	System.out.println("(A)- Pequeno");
		    	System.out.println("(B)- Médio");
		    	System.out.println("(C)- Grande");
		    	
	    	
	    	
	    
	    break;
	    
	    
	   
	   
	    case "Atum":
	    	System.out.println("");
	    	System.out.println("Muito bem escolhido");
	    	System.out.println("");
	    	System.out.println("Agora vamos de tamanhos");
	    	System.out.println("");
	    	System.out.println("Temos 3 opcões");
	    	System.out.println("");
	    	System.out.println("(A)- Pequeno");
	    	System.out.println("(B)- Médio");
	    	System.out.println("(C)- Grande");
	    	
	    break;
	    

	    case "Portuguesa":
	    	System.out.println("");
            System.out.println("Muito bem escolhido");
	    	System.out.println("");
	    	System.out.println("Agora vamos de tamanhos");
	    	System.out.println("");
	    	System.out.println("Temos 3 opcões");
	    	System.out.println("");
	    	System.out.println("(A)- Pequeno");
	    	System.out.println("(B)- Médio");
	    	System.out.println("(C)- Grande");
	    	
	    	break;
	    	
	    case "4Queijos":
	    	System.out.println("");
	    	System.out.println("Muito bem escolhido");
	    	System.out.println("");
	    	System.out.println("Agora vamos de tamanhos");
	    	System.out.println("");
	    	System.out.println("Temos 3 opcões");
	    	System.out.println("");
	    	System.out.println("(A)- Pequeno");
	    	System.out.println("(B)- Médio");
	    	System.out.println("(C)- Grande");
	    	break; 
	    	
	    	
	    	
	    }
		  
	    
	   
	  
		String Tamanhos =  sc.next();
	  
	    switch (Tamanhos) {
    
    case "A":
    	
    	System.out.println("");	
        System.out.println("Com o tamanho escolhido, deseja adicionar recheio de Catupiry na Borda? ");
       	
	    
	    break; 

	       
    case "B":
    	
    	System.out.println("");	
        System.out.println("Com o tamanho escolhido, deseja adicionar recheio de Catupiry na Borda? ");
       	
	    break; 
	    
	    
  case "C":
     System.out.println("");	
     System.out.println("Com o tamanho escolhido, deseja adicionar recheio de Catupiry na Borda? ");
    	
	    
	    break; 
	    
	    
	    }
	    
	    
	    String Borda =  sc.next();
		  
	    switch (Borda) {
    
    case "Sim":
    	
    	System.out.println("Beleza, recheio adicionado");
    	System.out.println("");
    	System.out.println("Falta pouco agora");
    	System.out.println("");
    	System.out.println("Escolha a forma de pagamento");
    	System.out.println("");
	    System.out.println("Cartão de credito ");
        System.out.println("");
        System.out.println("Pix");
	    
	    
	    break; 
	    	
    case "Não":
    	System.out.println(" Sem recheio,como desejar!");
    	System.out.println("");
    	System.out.println("Falta pouco agora");
    	System.out.println("");
    	System.out.println("Escolha a forma de pagamento:");
	    System.out.println("");
	    System.out.println("Cartão");
        System.out.println("");
        System.out.println("Pix");
	    
	}
	    String Pagamento =  sc.next();
		  
	    switch (Pagamento) {
    
    case "Cartão":
    	
    	System.out.println("Insira o Cartão e digite a senha:");
    	
	    break;
	    
	    }
         int senha = sc.nextInt();   
	    
	 	

		if (senha ==1803 ) {
			System.out.println("Transação Aceita");
			System.out.println("Sua pizza ficará pronta em 40 minutos");
	    	System.out.println("O endereço para retirada:Av. Marta Maria Bernades numero 1527 - São Paulo.");
		    System.out.println("Para fazer receber seu pedido apresente esse codigo 73056");

		    
		    
		    
		}else {
			System.out.println("Senha incorreta, tente novamente");
	    
	    
	  

		
		}
		
		
		
		

			

		}
		}



 
		
	


	    

