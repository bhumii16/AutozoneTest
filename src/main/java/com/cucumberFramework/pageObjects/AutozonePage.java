package com.cucumberFramework.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class AutozonePage {
	
	private WebDriver driver;

	@FindBy(xpath="//div[@data-testid='add-vehicle-header-btn']")
	WebElement addVehicleButton;

	@FindBy(xpath="//div[@data-testid='at_store_locator_homepage'][1]")
	WebElement selectLocationButton;

	@FindBy(xpath="//input[@data-testid='yearheader-input']")
	WebElement vehicleYearInput;

	@FindBy(xpath="//div[@data-testid='yearheader-dropdown-list']")
	public WebElement vehicleYearDropdownList;

	@FindBy(xpath="//input[@data-testid='makeheader-input']")
	WebElement vehicleMakeInput;

	@FindBy(xpath="//div[@data-testid='makeheader-dropdown-list']")
	public WebElement vehicleMakeDropdownList;

	@FindBy(xpath="//input[@data-testid='modelheader-input']")
	WebElement vehicleModelInput;

	@FindBy(xpath="//div[@data-testid='modelheader-dropdown-list']")
	public WebElement vehicleModelDropdownList;

	@FindBy(xpath="//img[@src='/images/icon-vehicle-selected-d.svg']")
	public WebElement selectedVehicleImage;

//	@FindBy(xpath="//img[@src='/images/icon-store-selected-d.svg']")
//	public List<WebElement> selectedLocationImage;

	@FindBy(xpath="//div[contains(text(),'Select Store')]")
	public WebElement selectStoreBtn;
	@FindBy(xpath="//input[@data-testid='desktop-search-input']")
	WebElement searchInput;

	@FindBy(xpath="//button[@id='searchBtnDesktopAndTablet']")
	WebElement searchBtn;

	@FindBy(xpath="//div[@id='search-result-list']")
	WebElement searchResultList;

	@FindBy(xpath="//button[@id='setStore']")
	WebElement setStoreBtn;

	@FindBy(xpath="//button[@data-testid='cart-action-shelf-0']")
	public WebElement addToCartBtn;

	@FindBy(xpath="//span[@data-testid='at_title_second_text_second_text']")
	public WebElement itemAddedToCart;

	@FindBy(xpath="//button[@data-testid='modal-close-btn']")
	public WebElement popUpCloseBtn;

	@FindBy(xpath="//input[@name='locationInput']")
	public WebElement storeSearchPin;

	@FindBy(xpath="//button[@data-testid='address-search-keyword']")
	WebElement searchStoreBtn;

	@FindBy(xpath="//button[@aria-label='close jebbit questionnaire']")
	public WebElement offerPopUpCloseBtn;


	@FindBy(xpath="//div[contains(@class,'content-block-primary')]")
	public WebElement OfferPopupMain;


	WaitHelper waitHelper;
	
	public AutozonePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void clickAddVehicleButton(){
		addVehicleButton.click();
	}
	public void clickVehicleYearInput(){
		vehicleYearInput.click();
	}

	public void selectVehicleYear(String vehicleYear){
		vehicleYearDropdownList.findElement(By.xpath("//li/button[contains(text(),'" + vehicleYear + "')]")).click();
	}

	public void clickVehicleMakeInput(){
		vehicleMakeInput.click();
	}

	public void selectVehicleMake(String vehicleMake){
		vehicleMakeDropdownList.findElement(By.xpath("//li/button[contains(text(),'" + vehicleMake + "')]")).click();
	}

	public void clickVehicleModelInput(){
		vehicleModelInput.click();
	}

	public void selectVehicleModel(String vehicleModel){
		vehicleModelDropdownList.findElement(By.xpath("//li/button[contains(text(),'"+vehicleModel+"')]")).click();
	}

	public void searchItem(){
		searchInput.sendKeys("Duralast 24DC-DL Group Size 24 Deep Cycle");
		searchBtn.click();
		try {
			waitHelper.WaitForElement(offerPopUpCloseBtn, 30);
			if (offerPopUpCloseBtn.isDisplayed()) offerPopUpCloseBtn.click();
		}
		catch(Exception e){
			System.out.println("Offer popup didn't appear. ");
		}
	}

	public void findAndClickItem(String itemName){
		waitHelper.WaitForElement(searchResultList, 30);
		searchResultList.findElement(By.xpath("//span[contains(text(),'" + itemName + "')]")).click();
	}

	public boolean isPopUp() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException Ex) {
			return false;
		}   // catch
	}
	public void selectLocation(String pincode){
		waitHelper.WaitForElement(selectLocationButton,30);
		selectLocationButton.click();
		waitHelper.WaitForElement(storeSearchPin, 30);
		storeSearchPin.sendKeys(pincode);
		searchStoreBtn.click();
		waitHelper.WaitForElement(setStoreBtn, 30);
		setStoreBtn.click();
	}

	public void addToCartAndContinue(){
		if(selectStoreBtn.isDisplayed()) {

			selectLocation("38122");
		}
//		waitHelper.WaitForElement(addToCartBtn, 30);
//		addToCartBtn.click();
//		waitHelper.WaitForElement(itemAddedToCart, 30);
//		popUpCloseBtn.click();
	}
	
	public void enterSearchItemandAddToCart(String item){
		String mainWindow=driver.getWindowHandle();
//		this.itemSearchField.sendKeys(item);
//		this.itemSearchField.submit();
//		secondMacbookItem.click();
//		Set<String> set =driver.getWindowHandles();
//		Iterator<String> itr= set.iterator();
//		while(itr.hasNext()){
//		 String childWindow=itr.next();
//		 if(!mainWindow.equals(childWindow)){
//			 driver.switchTo().window(childWindow);
//			 System.out.println(driver.switchTo().window(childWindow).getTitle());
//			 if(qtyField.size()>=1){
//
//				 Select sel = new Select(qtyField.get(0));
//				 sel.selectByValue("2");
//			 }
//
//			 JavascriptExecutor js = (JavascriptExecutor)driver;
//			 js.executeScript("arguments[0].scrollIntoView(true);",addToCartBtn);
//			 js.executeScript("arguments[0].click();", addToCartBtn);
//			 if(driver.findElements(By.xpath("//div[@class='a-popover-inner']//button[contains(text(),'Skip')]")).size()>=1){
//
//				 driver.findElements(By.xpath("//div[@class='a-popover-inner']//button[contains(text(),'Skip')]")).get(0).click();
//			 }
			 //addToCartBtn.click();
			 //driver.close();
//		 }
//		}
//		driver.switchTo().window(mainWindow);
	}
	
//	public void clickSignInButton(){
//		Actions builder = new Actions(driver);
//		builder.moveToElement(SignInfromNav).build().perform();
//		SignInfromNav.click();
//	}
	
	
//	public void clickLogoutButton(){
//		Actions builder = new Actions(driver);
//		builder.moveToElement(SignInfromNav).build().perform();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", logoutBtn);;
//	}
}
