import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllTestCases {
	
		public static WebDriver driver;
		public static  WebDriverWait wait;
		
		@Before
		public void start() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bgh07818\\Documents\\Automation\\chromedriver.exe");

			driver=new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("https://tuclothing.sainsburys.co.uk/");	
			//Assert.assertEquals("https://tuclothing.sainsburys.co.uk/", driver.getCurrentUrl());
			//Assert.assertEquals("Womens, Mens, Kids & Baby Fashion  | Tu clothing", driver.getTitle());
			
		}
		//Search Functionality
//		@Test
//		public void searchWithValidData() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("Jeans");
//			driver.findElement(By.cssSelector(".searchButton")).click();	
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=Jeans", driver.getCurrentUrl());
//		}
		
//		@Test
//		public void searchWithColour() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("Yellow");
//			driver.findElement(By.cssSelector(".searchButton")).click();
//	    	//Assert.assertEquals("Search for 'Yellow'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//		}
//		
//		@Test
//		public void searchWithDifferentBrands() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("hollister");
//			driver.findElement(By.cssSelector(".searchButton")).click();
//  		Assert.assertEquals("Search for 'hollister'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//		}
//		

//		@Test
//		public void searchWithEmptyBox() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("");
//			driver.findElement(By.cssSelector(".searchButton")).click();
//			Assert.assertEquals("Please complete a product search", driver.findElement(By.cssSelector(".form_field_error-message")).getText());
//		}
//		
//		@Test
//		public void searchWithInvalidProductName() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("alcohol");
//			driver.findElement(By.cssSelector(".searchButton")).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/search?text=alcohol", driver.getCurrentUrl());
//			
//		}
//		@Test
//		public void searchIcon()  {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector(".searchButton")).click();
//			Assert.assertEquals("Please complete a product search", driver.findElement(By.cssSelector(".form_field_error-message")).getText());
//		}
//		@Test
//		public void searchWithInvalidProductNumber() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("12345");
//			driver.findElement(By.cssSelector(".searchButton")).click();
//			Assert.assertEquals("Search for '12345'", driver.findElement(By.cssSelector("a[class='ln-c-breadcrumbs__link--last']")).getText());
//			
//		}
//		@Test
//		public void searchWithSpecialCharacter() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("$&^*$&");
//			driver.findElement(By.cssSelector(".searchButton")).click();
//			Assert.assertEquals("Search results for: $&^*$&", driver.findElement(By.cssSelector("h1")).getText());
//			
//		}
//		@Test
//		public void searchWithValidProductCategoryName() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("School Uniform");
//			driver.findElement(By.cssSelector(".searchButton")).click();
//			Assert.assertEquals("School Uniform", driver.findElement(By.cssSelector("a.last")).getText());
//		}
//		@Test
//		public void searchWithValidProductNumber() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#search")).clear();
//			driver.findElement(By.cssSelector("#search")).sendKeys("137144822");
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".searchButton"))).click();
//			Assert.assertEquals("Search for '137144822'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//		}
		
		//Store Locator Functionality
//		@Test
//		public void storeLocator() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//			}
//		
		
//		@Test
//		public void storeLocatorWithValidPostcode() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("RG142FB");
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//			}
//		@Test
//		public void storeLocatorWithInvalidPostcode() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("rrrrr");
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//		}
//		@Test
//		public void storeLocatorWithEmptyTextBox() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("");
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//			
//		}
//		@Test
//		public void storeLocatorWithValidTown_AllCheckBox() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("Newbury");
//			driver.findElement(By.cssSelector("label[for='women'")).click();
//			driver.findElement(By.cssSelector("label[for='men'")).click();
//			driver.findElement(By.cssSelector("label[for='children'")).click();
//			driver.findElement(By.cssSelector("label[for='click'")).click();
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//		}
//		@Test
//		public void storeLocatorWithValidTown_ChildrenCheckbox() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("Newbury");
//			driver.findElement(By.cssSelector("label[for='children'")).click();
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//		}
//		@Test
//		public void storeLocatorWithValidTown_ClickCollectCheckBox() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("Newbury");
//			driver.findElement(By.cssSelector("label[for='click'")).click();
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//		}
//		@Test
//		public void storeLocatorWithValidTown_EmptyText_SelectClickCollect() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("");
//			driver.findElement(By.cssSelector("label[for='click'")).click();
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//		}
//		@Test
//		public void storeLocatorWithValidTown_MenCheckbox() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("RG142FB");
//			driver.findElement(By.cssSelector("label[for='men'")).click();
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//		}
//		@Test
//		public void storeLocatorWithValidTown_WomenCheckbox() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("RG142FB");
//			driver.findElement(By.cssSelector("label[for='women'")).click();
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//		}
//		@Test
//		public void storeLocatorWithValidTown() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("Newbury");
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//			}
//		@Test
//		public void storeLocatorWithInvalidTown() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("xysabc");
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//			}
//		@Test
//		public void storeLocatorWithInvalidTown_AllCheckBox() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Store Locator")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
//			driver.findElement(By.name("q")).clear();
//			driver.findElement(By.name("q")).sendKeys("abcxyz");
//			driver.findElement(By.cssSelector("label[for='women'")).click();
//			driver.findElement(By.cssSelector("label[for='men'")).click();
//			driver.findElement(By.cssSelector("label[for='children'")).click();
//			driver.findElement(By.cssSelector("label[for='click'")).click();
//			driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--primary'")).click();
//			Assert.assertEquals("Store Locator", driver.findElement(By.cssSelector("h1")).getText());
//		}
		
		//Register Functionality
//		@Test
//		public void registerButton() {
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());
//		}	
//		@Test
//		public void registerWithValidDetails() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			driver.findElement(By.id("register_email")).clear();
//			driver.findElement(By.id("register_email")).sendKeys("krutika@gmail.com");
//			Select titleDropdown = new Select(driver.findElement(By.id("register_title")));
//			titleDropdown.selectByValue("mrs");
//			driver.findElement(By.id("register_firstName")).clear();
//			driver.findElement(By.id("register_firstName")).sendKeys("krutika");
//			driver.findElement(By.id("register_lastName")).sendKeys("sankpal");
//			driver.findElement(By.id("password")).sendKeys("nainu_1");
//			driver.findElement(By.id("register_checkPwd")).sendKeys("nainu");
//			driver.findElement(By.cssSelector("button[data-testid='completeRegistration'")).click();
//			Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());
//			
//		}
//		@Test
//		public void registerWithCompleteRegisterationButton() {
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			driver.findElement(By.cssSelector("button[data-testid='completeRegistration'")).click();
//			Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());
//		}	
//		@Test
//		public void registerWithIAcceptCheckbox() {
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			driver.findElement(By.id("register_email")).clear();
//			driver.findElement(By.id("register_email")).sendKeys("krutika@gmail.com");
//			Select titleDropdown = new Select(driver.findElement(By.id("register_title")));
//			titleDropdown.selectByValue("mrs");
//			driver.findElement(By.id("register_firstName")).clear();
//			driver.findElement(By.id("register_firstName")).sendKeys("");
//			driver.findElement(By.id("register_lastName")).sendKeys("");
//			driver.findElement(By.id("password")).sendKeys("");
//			driver.findElement(By.id("register_checkPwd")).sendKeys("");
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label[for='Terms & Conditions & Privacy Policy']")));
//			driver.findElement(By.cssSelector("label[for='Terms & Conditions & Privacy Policy']")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#cboxClose")));
//			driver.findElement(By.cssSelector("#cboxClose")).click();
//			//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submit-register")));
//			//driver.findElement(By.cssSelector("#submit-register")).click();
//			Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());
//		}	
//		@Test
//		public void registerWithInvalidDetails() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			driver.findElement(By.id("register_email")).clear();
//			driver.findElement(By.id("register_email")).sendKeys("kkkkk");
//			Select titleDropdown = new Select(driver.findElement(By.id("register_title")));
//			titleDropdown.selectByValue("mrs");
//			driver.findElement(By.id("register_firstName")).clear();
//			driver.findElement(By.id("register_firstName")).sendKeys("kkkk");
//			driver.findElement(By.id("register_lastName")).sendKeys("ssss");
//			driver.findElement(By.id("password")).sendKeys("ssss");
//			driver.findElement(By.id("register_checkPwd")).sendKeys("sss");
//			driver.findElement(By.cssSelector("button[data-testid='completeRegistration'")).click();
//			Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());
//			
//		}
//		@Test
//		public void registerWithInvalidEmailId() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			driver.findElement(By.id("register_email")).clear();
//			driver.findElement(By.id("register_email")).sendKeys("abcs");
//			Select titleDropdown = new Select(driver.findElement(By.id("register_title")));
//			titleDropdown.selectByValue("mrs");
//			driver.findElement(By.id("register_firstName")).clear();
//			driver.findElement(By.id("register_firstName")).sendKeys("krutika");
//			driver.findElement(By.id("register_lastName")).sendKeys("sankpal");
//			driver.findElement(By.id("password")).sendKeys("nainu_1");
//			driver.findElement(By.id("register_checkPwd")).sendKeys("nainu");
//			driver.findElement(By.cssSelector("button[data-testid='completeRegistration'")).click();
//			Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());
//			
//		}
//		@Test
//		public void registerWithInvalidNectarCard() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			driver.findElement(By.id("register_email")).clear();
//			driver.findElement(By.id("register_email")).sendKeys("abcs");
//			Select titleDropdown = new Select(driver.findElement(By.id("register_title")));
//			titleDropdown.selectByValue("mrs");
//			driver.findElement(By.id("register_firstName")).clear();
//			driver.findElement(By.id("register_firstName")).sendKeys("krutika");
//			driver.findElement(By.id("register_lastName")).sendKeys("sankpal");
//			driver.findElement(By.id("password")).sendKeys("nainu_1");
//			driver.findElement(By.id("register_checkPwd")).sendKeys("nainu");
//			driver.findElement(By.cssSelector("#regNectarPointsOne")).sendKeys("12345");
//			driver.findElement(By.cssSelector("#regNectarPointsTwo")).sendKeys("12345");
//			driver.findElement(By.cssSelector("button[data-testid='completeRegistration'")).click();
//			Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());
//		}
//		@Test
//		public void registerWithPasswordLessThan6Char() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			driver.findElement(By.id("register_email")).clear();
//			driver.findElement(By.id("register_email")).sendKeys("abcs");
//			Select titleDropdown = new Select(driver.findElement(By.id("register_title")));
//			titleDropdown.selectByValue("mrs");
//			driver.findElement(By.id("register_firstName")).clear();
//			driver.findElement(By.id("register_firstName")).sendKeys("krutika");
//			driver.findElement(By.id("register_lastName")).sendKeys("sankpal");
//			driver.findElement(By.id("password")).sendKeys("na");
//			driver.findElement(By.id("register_checkPwd")).sendKeys("na");
//			driver.findElement(By.cssSelector("button[data-testid='completeRegistration'")).click();
//		Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());
//		}
//		@Test
//		public void registerWithSpecialCharInNameField() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='registerButton']")));
//			driver.findElement(By.cssSelector("button[data-testid='registerButton']")).click();
//			driver.findElement(By.id("register_email")).clear();
//			driver.findElement(By.id("register_email")).sendKeys("abcs");
//			Select titleDropdown = new Select(driver.findElement(By.id("register_title")));
//			titleDropdown.selectByValue("mrs");
//			driver.findElement(By.id("register_firstName")).clear();
//			driver.findElement(By.id("register_firstName")).sendKeys("$$$$$");
//			driver.findElement(By.id("register_lastName")).sendKeys("sankpal");
//			driver.findElement(By.id("password")).sendKeys("na");
//			driver.findElement(By.id("register_checkPwd")).sendKeys("na");
//			driver.findElement(By.cssSelector("button[data-testid='completeRegistration'")).click();
//			Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".last h2")).getText());		
//		}
		
		//Basket Functionality
		
//		@Test
//		public void basketIconWithEmptyCart() {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//			Actions actions = new Actions(driver);
//			actions.moveToElement(driver.findElement(By.cssSelector("#basket-title")));
//			actions.perform();
//		    Assert.assertEquals("https://tuclothing.sainsburys.co.uk/", driver.getCurrentUrl());
//		}
		
		
		

//		@Test
//			public void basketWithClickCollectLink() {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.id("search")).clear();
//			driver.findElement(By.id("search")).sendKeys("Jeans");
//			driver.findElement(By.className("searchButton")).click();
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Mid Denim Slim Jean']")));
//			driver.findElement(By.cssSelector("img[alt='Mid Denim Slim Jean']")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select-size")));
//			Select sizeDropdown = new Select(driver.findElement(By.cssSelector("#select-size")));
//			sizeDropdown.selectByValue("137503311");
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//			Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//			qtyDropdown.selectByValue("2");
//			driver.findElement(By.cssSelector("button[title='Add a basket']")).click();
//			driver.findElement(By.cssSelector("#basket-title")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//			driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//			

//			driver.findElement(By.linkText("Click & Collect")).click();
//			Assert.assertEquals("Delivery Information", driver.findElement(By.cssSelector("a.last")).getText());
//	}
//		@Test
//		public void basketWithContinueShopping() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Jeans");
//		driver.findElement(By.className("searchButton")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Mid Denim Slim Jean']")));
//		driver.findElement(By.cssSelector("img[alt='Mid Denim Slim Jean']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select-size")));
//		Select sizeDropdown = new Select(driver.findElement(By.cssSelector("#select-size")));
//		sizeDropdown.selectByValue("137503311");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		driver.findElement(By.cssSelector("button[title='Add a basket']")).click();
//		Assert.assertEquals("Mid Denim Slim Jean", driver.findElement(By.cssSelector("a.ln-c-breadcrumbs__link--last")).getText());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//		driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//		Assert.assertEquals("Basket", driver.findElement(By.cssSelector("a.last")).getText());
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ln-c-button.ln-c-button--secondary.left"))).click();
//		Assert.assertEquals("Search for 'Jeans'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//	}
//		@Test
//		public void basketWithMiniCart() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Jeans");
//		driver.findElement(By.className("searchButton")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Mid Denim Slim Jean']")));
//		driver.findElement(By.cssSelector("img[alt='Mid Denim Slim Jean']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select-size")));
//		Select sizeDropdown = new Select(driver.findElement(By.cssSelector("#select-size")));
//		sizeDropdown.selectByValue("137503311");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		driver.findElement(By.cssSelector("button[title='Add a basket']")).click();
//		Assert.assertEquals("Mid Denim Slim Jean", driver.findElement(By.cssSelector("a.ln-c-breadcrumbs__link--last")).getText());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cartItemsText")));
//		driver.findElement(By.cssSelector(".cartItemsText")).click();
//		}
//		@Test
//		public void basketWithMiniCart_ViewBasketCheckout() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Jeans");
//		driver.findElement(By.className("searchButton")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Mid Denim Slim Jean']")));
//		driver.findElement(By.cssSelector("img[alt='Mid Denim Slim Jean']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select-size")));
//		Select sizeDropdown = new Select(driver.findElement(By.cssSelector("#select-size")));
//		sizeDropdown.selectByValue("137503311");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		driver.findElement(By.cssSelector("button[title='Add a basket']")).click();
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cartItemsText")));
//		driver.findElement(By.cssSelector(".cartItemsText")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.ln-c-button.ln-c-button--primary")));
//		driver.findElement(By.cssSelector("a.ln-c-button.ln-c-button--primary")).click();
//		Assert.assertEquals("Basket", driver.findElement(By.cssSelector("a.last")).getText());
//		
//		
//	}
//		
//		@Test
//		public void basketWithPromoCodeButton() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Jeans");
//		driver.findElement(By.className("searchButton")).click();
//		Assert.assertEquals("Search for 'Jeans'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Mid Denim Slim Jean']")));
//		driver.findElement(By.cssSelector("img[alt='Mid Denim Slim Jean']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select-size")));
//		Select sizeDropdown = new Select(driver.findElement(By.cssSelector("#select-size")));
//		sizeDropdown.selectByValue("137503311");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		driver.findElement(By.cssSelector("button[title='Add a basket']")).click();
//		Assert.assertEquals("Womens Mid Denim Slim Jean | Tu clothing", driver.getTitle());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//		driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".basketTotalsAddPromo.clearfix #showPromo")));
//		driver.findElement(By.cssSelector("#voucher_voucherCode")).click();
//		driver.findElement(By.cssSelector("#voucher_voucherCode")).sendKeys("2345");
//		driver.findElement(By.cssSelector("button[class='ln-c-button ln-c-button--secondary']")).click();
//		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/cart/apply-voucher", driver.getCurrentUrl());
//	}
		
//		@Test
//		public void basketWithRemoveItemButton() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Jeans");
//		driver.findElement(By.className("searchButton")).click();
//		Assert.assertEquals("Search results for: Jeans | Tu clothing", driver.getTitle());
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Mid Denim Slim Jean']")));
//		driver.findElement(By.cssSelector("img[alt='Mid Denim Slim Jean']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select-size")));
//		Select sizeDropdown = new Select(driver.findElement(By.cssSelector("#select-size")));
//		sizeDropdown.selectByValue("137503311");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		driver.findElement(By.cssSelector("button[title='Add a basket']")).click();
//		Assert.assertEquals("Womens Mid Denim Slim Jean | Tu clothing", driver.getTitle());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//		driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//		driver.findElement(By.cssSelector("#RemoveProduct_0")).click();
//		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/cart", driver.getCurrentUrl());
//		}
//		@Test
//		public void basketWithUpdateBasket() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Jeans");
//		driver.findElement(By.className("searchButton")).click();
//		Assert.assertEquals("Search results for: Jeans | Tu clothing", driver.getTitle());
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[alt='Mid Denim Slim Jean']")));
//		driver.findElement(By.cssSelector("img[alt='Mid Denim Slim Jean']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#select-size")));
//		Select sizeDropdown = new Select(driver.findElement(By.cssSelector("#select-size")));
//		sizeDropdown.selectByValue("137503311");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		driver.findElement(By.cssSelector("button[title='Add a basket']")).click();
//		Assert.assertEquals("Womens Mid Denim Slim Jean | Tu clothing", driver.getTitle());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//		driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//		Select qtyDropdown1 = new Select(driver.findElement(By.cssSelector("#quantity0")));
//		qtyDropdown1.selectByValue("3");
//		driver.findElement(By.cssSelector(".basketUpdateProd.updateQuantityProduct")).click();
//		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/cart", driver.getCurrentUrl());
//		
//		}
		//Checkout Functionality
//		@Test
//		public void CheckoutButton() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("tops");
//		driver.findElement(By.className("searchButton")).click();
//		Assert.assertEquals("Search for 'tops'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Christmas Bauble Print Top']")));
//		driver.findElement(By.cssSelector("img[alt='Christmas Bauble Print Top']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-value='138001330']")));
//		driver.findElement(By.cssSelector("div[data-value='138001330']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#AddToCart")));
//		driver.findElement(By.cssSelector("#AddToCart")).click();
//		Assert.assertEquals("Womens Christmas Bauble Print Top | Tu clothing", driver.getTitle());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//		driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/cart", driver.getCurrentUrl());
//		}
//		@Test
//		public void Checkout_ClickCollect_ProceedToCheckOutButton() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("tops");
//		driver.findElement(By.className("searchButton")).click();
//		Assert.assertEquals("Search for 'tops'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Christmas Bauble Print Top']")));
//		driver.findElement(By.cssSelector("img[alt='Christmas Bauble Print Top']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-value='138001330']")));
//		driver.findElement(By.cssSelector("div[data-value='138001330']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#AddToCart")));
//		driver.findElement(By.cssSelector("#AddToCart")).click();
//		Assert.assertEquals("Womens Christmas Bauble Print Top | Tu clothing", driver.getTitle());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//		driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//		driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary.tuButton")).click();
//		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/login/checkout", driver.getCurrentUrl());
//		}
//		@Test
//		public void Checkout_ClickCollect_BasketLessThan£20() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("tops");
//		driver.findElement(By.className("searchButton")).click();
//		Assert.assertEquals("Search for 'tops'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Christmas Bauble Print Top']")));
//		driver.findElement(By.cssSelector("img[alt='Christmas Bauble Print Top']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-value='138001330']")));
//		driver.findElement(By.cssSelector("div[data-value='138001330']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("1");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#AddToCart")));
//		driver.findElement(By.cssSelector("#AddToCart")).click();
//		Assert.assertEquals("Womens Christmas Bauble Print Top | Tu clothing", driver.getTitle());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//		driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//		driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary.tuButton")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#guest_email")));
//		driver.findElement(By.cssSelector("#guest_email")).clear();
//		driver.findElement(By.cssSelector("#guest_email")).sendKeys("anvika@gmail.com");
//		driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
//		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/checkout/multi/delivery-options/choose", driver.getCurrentUrl());
//		}
//
//		@Test
//		public void Checkout_ClickCollect_BasketMoreThan£20() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("tops");
//		driver.findElement(By.className("searchButton")).click();
//		Assert.assertEquals("Search for 'tops'", driver.findElement(By.cssSelector(".ln-c-breadcrumbs__link--last")).getText());
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Christmas Bauble Print Top']")));
//		driver.findElement(By.cssSelector("img[alt='Christmas Bauble Print Top']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-value='138001330']")));
//		driver.findElement(By.cssSelector("div[data-value='138001330']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//		Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//		qtyDropdown.selectByValue("2");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#AddToCart")));
//		driver.findElement(By.cssSelector("#AddToCart")).click();
//		Assert.assertEquals("Womens Christmas Bauble Print Top | Tu clothing", driver.getTitle());
//		driver.findElement(By.cssSelector("#basket-title")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//		driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//		driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary.tuButton")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#guest_email")));
//		driver.findElement(By.cssSelector("#guest_email")).clear();
//		driver.findElement(By.cssSelector("#guest_email")).sendKeys("anvika@gmail.com");
//		driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
//		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/checkout/multi/delivery-options/choose", driver.getCurrentUrl());
//		}

//		//Facets
//		@Test
//		public void Checkout_ClickCollect_BasketMoreThan£20() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Pink");
//		driver.findElement(By.className("searchButton")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='Girls-d']")));
//		driver.findElement(By.cssSelector("label[for='Girls-d']")).click(); //Department
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='Cardigans-d']")));
//		driver.findElement(By.cssSelector("label[for='Cardigans-d']")).click(); //Type
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,800)");
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='4 years_228-d']")));
//		driver.findElement(By.cssSelector("label[for='4 years_228-d']")).click(); //Size
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='Red-d']")));
//		driver.findElement(By.cssSelector("label[for='Red-d']")).click(); //colour
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='£0-£4.99-d']")));
//		driver.findElement(By.cssSelector("label[for='£0-£4.99-d']")).click(); //Price
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='£5-£9.99-d']")));
//		driver.findElement(By.cssSelector("label[for='£5-£9.99-d']")).click(); //Price
//		Assert.assertEquals("Tu clothing", driver.getTitle());
//		}
		
		//Follow-Us
//		@Test
//		public void FollowUs_Facebook() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElements(By.cssSelector(".ln-u-soft-ends")).get(2).click();
//		Assert.assertEquals("https://www.facebook.com/tuclothing", driver.getCurrentUrl());
//		}
//		@Test
//		public void FollowUs_Twitter() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElements(By.cssSelector(".ln-u-soft-ends")).get(3).click();
//		Assert.assertEquals("https://twitter.com/tu_clothing", driver.getCurrentUrl());
//		}
//		@Test
//		public void FollowUs_Insta(){
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElements(By.cssSelector(".ln-u-soft-ends")).get(4).click();
//		Assert.assertEquals("https://www.instagram.com/accounts/login/?next=/tuclothing/", driver.getCurrentUrl());
//		}
//		@Test
//		public void FollowUs_GooglePlus() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElements(By.cssSelector(".ln-u-soft-ends")).get(5).click();
//		Assert.assertEquals("Sign in – Google accounts", driver.getTitle());
//		}
		
//		@Test
//		public void FollowUs_Pintrest() {
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//		driver.findElements(By.cssSelector(".ln-u-soft-ends")).get(6).click();
//		Assert.assertEquals("https://www.pinterest.com/tuclothing/", driver.getCurrentUrl());
//		}
		
		//Login
//		@Test
//		public void loginRegister_Link() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			Assert.assertEquals("Log in with your Tu details", driver.findElement(By.cssSelector(".loginFormHolder h3")).getText());
//		}
		
//		@Test
//		public void loginWithValidEmailPwd() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			driver.findElement(By.cssSelector("#j_username")).clear();
//			driver.findElement(By.cssSelector("#j_username")).sendKeys("krutika.sankpal@gmail.com");
//			driver.findElement(By.cssSelector("#j_password")).clear();
//			driver.findElement(By.cssSelector("#j_password")).sendKeys("Krutika_098");
//			driver.findElement(By.cssSelector("#submit-login")).click();
//			Assert.assertEquals("Log in with your Tu details", driver.findElement(By.cssSelector(".loginFormHolder h3")).getText());
//			
//		}
//		@Test
//		public void loginWithInvalidEmailPwd() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector("#j_username")).clear();
//		driver.findElement(By.cssSelector("#j_username")).sendKeys("krutika.sankpal@gmail.com");
//		driver.findElement(By.cssSelector("#j_password")).clear();
//		driver.findElement(By.cssSelector("#j_password")).sendKeys("aaa");
//		driver.findElement(By.cssSelector("#submit-login")).click();
//		Assert.assertEquals("Log in with your Tu details", driver.findElement(By.cssSelector(".loginFormHolder h3")).getText());
//		}	
		
//		@Test
//		public void login_ForgotPassword() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.linkText("Tu Log In / Register")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#forgot-password-link")));
//			driver.findElement(By.cssSelector("#forgot-password-link")).click();
//			Assert.assertEquals("Log in with your Tu details", driver.findElement(By.cssSelector(".loginFormHolder h3")).getText());
//			
//		}
		
		//Product Categories 
//		@Test
//		public void productCategory_Halloween() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElements(By.cssSelector("a[title='Halloween']")).get(0).click();
//			Assert.assertEquals("Halloween Costumes Ideas | Halloween dress up | Tu clothing", driver.getTitle());
//		}
//		@Test
//		public void productCategory_Women() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElements(By.cssSelector("a[title='Women']")).get(0).click();
//			Assert.assertEquals("Womens Clothing | Dresses, Shoes & Coats | Tu Clothing", driver.getTitle());
//		}
//		@Test
//		public void productCategory_Men() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElements(By.cssSelector("a[title='Men']")).get(0).click();
//			Assert.assertEquals("Mens Clothing | Jeans, T-Shirts, Shirts | Tu Clothing", driver.getTitle());
//		}
//		@Test
//		public void productCategory_Kids() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElements(By.cssSelector("a[title='Kids']")).get(0).click();
//			Assert.assertEquals("Kids Clothes | Children's Fashion | Tu Clothing", driver.getTitle());
//		}
//		@Test
//		public void productCategory_Baby() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Baby']")));
//			driver.findElements(By.cssSelector("a[title='Baby']")).get(0).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/c/baby/baby?INITD=GNav-Baby-Header", driver.getCurrentUrl());
//		}
//		@Test
//		public void productCategory_SchoolUniform() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElements(By.cssSelector("a[title='School Uniform']")).get(0).click();
//			Assert.assertEquals("School Uniform", driver.findElement(By.cssSelector("a.last")).getText());
//		}
//		@Test
//		public void productCategory_Brands() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElements(By.cssSelector("a[title='Brands']")).get(0).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/brands?INITD=GNav-Brands-", driver.getCurrentUrl());
//		}
//		@Test
//		public void productCategory_Sale() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElements(By.cssSelector("a[title='Sale']")).get(0).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/c/Sale/Sale?INITD=GNav-Sale-Header", driver.getCurrentUrl());
//		}
		
		
		//Sign up Functionality
//		@Test
//		public void signUp_ValidEmail() {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#email-sign-up-input")).sendKeys("krutika.sankpal@gmail.com");			
//			driver.findElement(By.cssSelector(".ln-c-icon")).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/", driver.getCurrentUrl());
//		}
//		
//		@Test
//		public void signUp_InvalidEmail() {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#email-sign-up-input")).sendKeys("abcdef");			
//			driver.findElement(By.cssSelector(".ln-c-icon")).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/", driver.getCurrentUrl());
//		}
		
//		@Test
//		public void signUp_BlankEmail() {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.cssSelector("#email-sign-up-input")).sendKeys("");			
//			driver.findElement(By.cssSelector(".ln-c-icon")).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/", driver.getCurrentUrl());
//		}
		
//		@Test
//		public void SortBy_HighToLow() {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.id("search")).clear();
//			driver.findElement(By.id("search")).sendKeys("Yellow");
//			driver.findElement(By.className("searchButton")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sortOptions1")));
//			Select titleDropdown = new Select(driver.findElement(By.cssSelector("#sortOptions1")));
//			titleDropdown.selectByValue("price-desc");
//			Assert.assertEquals("Search for 'Yellow'", driver.findElement(By.cssSelector("a.ln-c-breadcrumbs__link--last")).getText());
//		}
//		
//		@Test
//		public void SortBy_LowToHigh() {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.id("search")).clear();
//			driver.findElement(By.id("search")).sendKeys("Yellow");
//			driver.findElement(By.className("searchButton")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sortOptions1")));
//			Select titleDropdown = new Select(driver.findElement(By.cssSelector("#sortOptions1")));
//			titleDropdown.selectByValue("price-asc");
//		Assert.assertEquals("Search for 'Yellow'", driver.findElement(By.cssSelector("a.ln-c-breadcrumbs__link--last")).getText());
//		}
		
//		@Test
//		public void SortBy_Relevance() {
//			WebDriverWait wait = new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.id("search")).clear();
//			driver.findElement(By.id("search")).sendKeys("Yellow");
//			driver.findElement(By.className("searchButton")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sortOptions1")));
//			Select titleDropdown = new Select(driver.findElement(By.cssSelector("#sortOptions1")));
//			titleDropdown.selectByValue("relevance");
//			Assert.assertEquals("Search for 'Yellow'", driver.findElement(By.cssSelector("a.ln-c-breadcrumbs__link--last")).getText());
//		}
		//End To End Scenario
//		@Test
//		public void endToEnd_PlaceOrder_Guest_ClickCollect() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.id("search")).clear();
//			driver.findElement(By.id("search")).sendKeys("tops");
//			driver.findElement(By.className("searchButton")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Christmas Bauble Print Top']")));
//			driver.findElement(By.cssSelector("img[alt='Christmas Bauble Print Top']")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-value='138001330']")));
//			driver.findElement(By.cssSelector("div[data-value='138001330']")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//			Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//			qtyDropdown.selectByValue("3");
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#AddToCart")));
//			driver.findElement(By.cssSelector("#AddToCart")).click();
//			driver.findElement(By.cssSelector("#basket-title")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//			driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//			driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary.tuButton")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#guest_email")));
//			driver.findElement(By.cssSelector("#guest_email")).clear();
//			driver.findElement(By.cssSelector("#guest_email")).sendKeys("anvika@gmail.com");
//			driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
//			driver.findElements(By.cssSelector(".ln-c-form-option__label")).get(0).click();
//			driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='LocationLookup-module__input--2cVMS null']")));
//			driver.findElement(By.cssSelector("input[class='LocationLookup-module__input--2cVMS null']")).sendKeys("RG142BH");
//			driver.findElement(By.cssSelector(".Button-module__button--3WHb5")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".StoreCard-module__selectStoreButton--3CFno")));
//			driver.findElements(By.cssSelector(".StoreCard-module__selectStoreButton--3CFno")).get(0).click();
//			driver.findElement(By.cssSelector(".proceed-to-summary.ln-c-button.ln-c-button--primary")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".tu-c-checkout-order-summary-proceed-to-payment__form .tu-c-checkout-order-summary-proceed-to-payment__button")));
//			driver.findElement(By.cssSelector(".tu-c-checkout-order-summary-proceed-to-payment__form .tu-c-checkout-order-summary-proceed-to-payment__button")).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/checkout/multi/payment-method/add", driver.getCurrentUrl());
//		
//		}
		
//		@Test
//		public void endToEnd_PlaceOrder_Guest_HomeDelivery() {
//			
//			wait = new WebDriverWait(driver,10);
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#consent_prompt_submit"))).click();
//			driver.findElement(By.id("search")).clear();
//			driver.findElement(By.id("search")).sendKeys("tops");
//			driver.findElement(By.className("searchButton")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='Christmas Bauble Print Top']"))).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-value='138001330']"))).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#productVariantQty.ln-c-select")));
//			Select qtyDropdown = new Select(driver.findElement(By.cssSelector("#productVariantQty.ln-c-select")));
//			qtyDropdown.selectByValue("2");
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#AddToCart"))).click();
//			driver.findElement(By.cssSelector("#basket-title")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[title='Proceed to Checkout']")));
//			driver.findElement(By.cssSelector("div[title='Proceed to Checkout']")).click();
//			driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary.tuButton")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#guest_email"))).click();
//			driver.findElement(By.cssSelector("#guest_email")).sendKeys("anvika@gmail.com");
//			driver.findElement(By.cssSelector("button[data-testid='guest_checkout']")).click();
//			driver.findElements(By.cssSelector(".ln-c-form-option__label")).get(1).click();
//			driver.findElement(By.cssSelector(".ln-c-button.ln-c-button--primary")).click();
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("address.title")));
//			Select titleDropdown = new Select(driver.findElement(By.id("address.title")));
//			titleDropdown.selectByValue("mrs");
//			driver.findElement(By.cssSelector("input[id='address.firstName']")).clear();
//			driver.findElement(By.cssSelector("input[id='address.firstName']")).sendKeys("kkk");
//			driver.findElement(By.cssSelector("input[id='address.surname']")).clear();
//			driver.findElement(By.cssSelector("input[id='address.surname']")).sendKeys("sss");
//			driver.findElement(By.cssSelector("input[id='addressPostcode']")).clear();
//			driver.findElement(By.cssSelector("input[id='addressPostcode']")).sendKeys("rg14 2fb");
//			driver.findElement(By.cssSelector(".ln-c-button--primary.address-lookup.ln-u-push-bottom")).click();
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#addressListView")));
//			Select addressDropdown = new Select(driver.findElement(By.cssSelector("#addressListView")));
//			addressDropdown.selectByIndex(17);
//			driver.findElement(By.cssSelector("input[id='continue']")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[data-testid='deliveryMethod']"))).click();
//			driver.findElement(By.cssSelector("input[data-testid='continue']")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='submit-button']")));
//			driver.findElement(By.cssSelector("button[data-testid='submit-button']")).click();
//			Assert.assertEquals("https://tuclothing.sainsburys.co.uk/checkout/multi/payment-method/add", driver.getCurrentUrl());
//		}
			
			
		
		
		
		
		
		
		
		
		
//		@After
//		public void close() {
//			
//			driver.close();	
//			
//		}

	}


