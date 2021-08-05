package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // une instance du navigateur chrome
		// ChromeDriver driver2 = new ChromeDriver (); driver2 de type chrome uniquement
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // maximiser l'affichage de la fenetre
		String codeSource = driver.getPageSource();
		System.out.println("le code source est le suivant: "+codeSource);//afficher le code source dans la console
		 if(codeSource.contains("OrangeHRM")) {  // valider que le code source contient "OrangeHRM"
			 System.out.println("passed");
		 }else {
			 System.out.println("failed");
		 }
		
	

	}

}
