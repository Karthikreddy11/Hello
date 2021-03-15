package com.ui.core.step_definitions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.MalformedURLException;


public class Hooks {
    public static  WebDriver driver;
    public static Scenario scenario;


 @Before
 //Delete all cookies at the start of each scenario to avoid shared state between tests
    public void openChromeBrowser() throws MalformedURLException {

            System.out.println("\n Launched ChromeBrowser\n");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();


    }

@After
    //Embed a screenshot in test report if test is scenario is failed and then close the browser
public void embedScreenshot(Scenario scenario) {

    if(scenario.isFailed()) {
        try {
            scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }

    }
    driver.quit();

}
}

S.No	Card	Balance to pay	Settlement Offer	Percentage offered	Collections	Duration to pay	Due Dates		Direct Number	Credit Bureau update		
												
1	Chase freedom - Kalpana	$12,807.23 	$2,561.46 		ARS Collections		11/27/2020	$1,280.73 	866-888-9096(extn 1204)	Credit bureau reports showing it is cleared		
							12/27/2020	$1,280.73 	Name:Peer Molina 			
									800-424-5004 (Chase)			
			3) Pete Soulias at 800-232-1258 (extn: 1100) is the contact person now						866-252-5777 (Chase)			
			4) Pierre Molina is at 866-888-9096 (Extn: 1204)						800-497-3572 (ARS)			
			1) Called on 11/25 and settled for 20% of the balance now									
			ARS confirmed that I have satisfied the account and no more with them									
			Chase will be informed after 45 days of final payment and then Chase will inform Credit Bureaus									
												
2	BOA - Kalpana (0101)	$17,973.93 	$7,500 		Credit Control							
3	BOA - Kalpana (7758)	$10,215.23 							866-433-0249			
									BoA recovery dept			
									877-445-9289	Credit bureau reports also showing it is cleared		
			2) Spoke to Brain (Supervisor) and he initially told to pay $16000 and then came down to $12600						Credit-Control			
			1) Lawrence from Credit control called me on 11/27 and asked me to pay by $Nov 30th for $7500						866-784-1193			
			1) Called BOA on 11/30 and they confirmed that accounts are with Credit Control LLC and provided phone number(800-915-1016)									
			2) Called on 12/2 for confirming the Thanking letter content and Lawrence mentioned that nothing from my end and wait for completion letter on 30th Dec									
			1) BOA has sent 2 letters on 12/26 confirming that they received the payment and settlement is complete									
												
4	Citi - Kalpana	$2,471.11 	$800 		Cavalry	2 months	11/30/2020	$400 	866-434-2995			
							12/30/2020	$400 	800-501-0909	Credit bureaus also reported and points got increased		
												
			2) Called Citi bank for confirmation on 11/16 and they told the account is with Cavalry									
			01/11  - letter has been issued									
												
5	Macys - Karthik	$461 	$200 		11/2/2020	3 months	11/16/2020	$66.67 	800-295-4057			
							12/16/2020	$66.67 	800-782-7756			
							1/16/2021	$66.67 				
												
6	Dell	1170	790				1/29/2021		1-877-269-9052			
												
				1) It is now with Portfolio recovery associates (888-772-7326, extn: 14538)								
				2/16 - Portfolio associates has sent the confirmation letter that there are no dues								
												
7	Discover - Karthik	7676.44	3838.22	50%	3 months	11/30/2020	$700 	800-347-2683				
						12/30/2020	$1,570 					
						1/30/2021	$1,570 					
								888-231-0371	888-231-0371			
		3) The direct number to reach is 888-231-0371 (manager extn: 0184) - Troy										
		4) Need to pay $3800 in 3 installments										
												
8	Discover - Kalpana	$22,034 	$11,017 	50%	11/2/2020	3 months	"11/25/2020
12/28/2020
30/01/2021"	$3,672.41		888 231 0371 (extn: 146)		
												
9	Citi costco - Karthik	$2,333 	$1,085 	47%		3 months	12/6/2020	$360 	855-805-5486			
							1/6/2021	$360 				
							2/4/2021	$360 	866-670-6730			
												
1	Onemain	11065	4650	40%								
			5500	50%								
		1) On 1/29/2021 email has been sent by attorney for the payment of $5533 as a one time payment										
		1) Sent Cashiers check for $5532.83 on 2/12/2021, going to reach on 2/15										
		2) Called Onemain Collections number on 3/12/2021 and they said, the settlement amount is reflected at their end and they will send the confirmation letter in couple of weeks										
												
S.No	Card	Balance to pay	Settlement Offer	Percentage offered	Called on	Duration to pay	Due Dates		Direct Number	Call incase to optout	In Writing	
1	Citi Master(4838) - Karthik	$10,369 	$7,000 	68%	11/3/2020	Settlement offer $2500 I requested			Citi bank number	866-972-1371		
				extn: 1203	Collections					8 to 5pm only		
			1) Called on 11/5/2020 and they cant reduce $7000 (and offered in 24 months to pay)									
									Citi bank Internal recovery number		866-523-0118	
		File #: 20064621										
												
			1) 1/7 spoke to Citi internal recovery unit ( 866-523-0118) 									
			2) They confirmed that it is with Blitt and Gaines LLC  (888-920-0620)									
			Called on 1/26 and finalized it to $7024		68%							
			Confirmation #	150689	Jennifer							
			Confirmation #	581318								
												
S.No	Card	Balance to pay	Settlement Offer	Percentage offered	Called on	Duration to pay	Due Dates		Direct Number	Call incase to optout		
1	BOA - Karthik (2065) - Master card	$19,566.00 	$6,723.00 	34%	11/24/2020		$5,870.00 	30%				
2	BOA - Karthik (3892) - Visa	$5,782.50 	$2,025.00 	35%	11/24/2020		$1,780.64 	31%		$7,650.64 		
			1) Discussed for $3000 in total for both, but offering at 60%							$25,348.50 		
			12/24 - Using online BOA account settled both the cards for 30% ($7500)									
												
		Done	12/31/2020	$1,957 	$1,956.70 	Cleared						
			2/28/2021	$1,957 	$1,956.70 	Cleared						
			3/24/2021	$1,957 								
												
		Done	12/31/2020	$594 	$593.51 	Cleared						
			1/29/2021	$594 	$593.51 	Cleared						
			2/26/2021	$594 	$593.51 	Cleared						
												
												
												
S.No	Card	Balance to pay	Settlement Offer	Percentage offered	Called on	Duration to pay	Due Dates		Direct Number	Call incase to optout	Confirmation	
1	Barclays - Kalpana	4800	2160	45%		1/29/2021	$720.14 				7208-20210107	
	(0)630					2/26/2021	$720.14 					
		Northstar	888-820-0964			3/31/2021	$720.14 					
												
		1) Called Barclays and they confirmed that the account is with Northstar and once payments are completed they will report back to Barclays										










