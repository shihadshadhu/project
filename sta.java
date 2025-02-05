package Practice;


	
	
	

	
		import org.openqa.selenium.*;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import java.time.Duration;

		public class sta 
		{
		    public static void main(String[] args) {
		    	ChromeDriver driver;


		        
		         driver = new ChromeDriver();
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        try {
		           
		            driver.manage().window().maximize();
		            driver.get("https://www.saucedemo.com/");

		            driver.findElement(By.id("user-name")).sendKeys("standard_user");
		            driver.findElement(By.id("password")).sendKeys("secret_sauce");
		            driver.findElement(By.id("login-button")).click();

		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_list")));
		            System.out.println("Login successful!");

		            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		            driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

		            driver.findElement(By.className("shopping_cart_link")).click();

		            		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cart_item")));
		            System.out.println("Items added to cart successfully!");

		            		            driver.findElement(By.id("checkout")).click();

		            		            driver.findElement(By.id("first-name")).sendKeys("John");
		            driver.findElement(By.id("last-name")).sendKeys("Doe");
		            driver.findElement(By.id("postal-code")).sendKeys("12345");
		            driver.findElement(By.id("continue")).click();

		            		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("summary_info")));
		            System.out.println("Checkout summary displayed!");

		            		            driver.findElement(By.id("finish")).click();

		            		            WebElement orderMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("complete-header")));
		            System.out.println("Order Confirmation: " + orderMessage.getText());

		            		            driver.findElement(By.id("react-burger-menu-btn")).click();
		            wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
		            System.out.println("Logout successful!");

		        } catch (Exception e) {
		            System.out.println("Test failed: " + e.getMessage());
		        } finally {
		            		            driver.quit();
		            System.out.println("Browser closed!");
		        }
		    }
		}
		
	


