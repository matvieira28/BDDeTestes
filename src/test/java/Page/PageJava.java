package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageJava {

	WebDriver driver;
	
	public void pausa(int tempo) throws InterruptedException {
		
	Thread.sleep(tempo);	
		
	}
	
	public void preencher(By elemento, String texto) {
	
	driver.findElement(elemento).sendKeys(texto);	
		
	}
	public void clicar (By elemento ) {
	 driver.findElement(elemento).click();	
			
	}
	
	public void abrirNavegador(String site) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
	    driver.manage().window().maximize();	
	   
	
	}
	public void validacao (String valido , By elemento) {
		
		
	}
	
	
	
	
}
