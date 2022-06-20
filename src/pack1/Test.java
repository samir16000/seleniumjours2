package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");// localiser le driver
		WebDriver driver = new ChromeDriver(); // une instance du navigateur chrome
		// ChromeDriver driver2 = new ChromeDriver (); driver2 de type chrome uniquement
		driver.get("https://opensource-demo.orangehrmlive.com/");// la methode get sert a ouvrir le site web.........
		driver.manage().window().maximize(); // maximiser l'affichage de la fenetre
		String titlePage = driver.getTitle();// recuperer la title de la page
		System.out.println("le  titre  est: " + titlePage); // affiché dans la console
		
		//Condition
		if (titlePage.equals("OrangeHRM")) {
			System.out.println("le test title est reussi");
		} else {
			System.out.println("le test title a echoue");
			
			
		}
	
		String urlPage = driver.getCurrentUrl(); // recuperer l'URL de la page
		System.out.println("l'URL  de la page est: " + urlPage);
		if (urlPage.equals("https://opensource-demo.orangehrmlive.com/")) {
			System.out.println("le test URL est reussi");
		} else {
			System.out.println("le test URL a echoue");
		}

	}

}
