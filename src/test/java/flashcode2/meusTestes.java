package flashcode2;

import java.util.Scanner;

public class meusTestes {
	
	
   static Scanner tg= new Scanner (System.in);
   
   
   public static void main (String[]args) {
   
   
	   System.out.println("Bom dia, efetue hj o pagamento do boleto");
	   System.out.println("");
	   System.out.println("O valor do pagamento é R$599,00" );
	   System.out.println("");
	   System.out.println("Saldo da sua conta é R$800,00");
	   System.out.println("");
	   System.out.println("Pague a sua conta aqui");
   
    
        
        int Pagamento = tg.nextInt();
    
        
    
   
   	if (Pagamento >= 599) {
   
   System.out.println(" Pagamento aprovado ");
      }else {
	System.out.println("  Saldo insuficiente ");
	
	
	
	
	
	                      }


      
   }
   
   
   
}

	
