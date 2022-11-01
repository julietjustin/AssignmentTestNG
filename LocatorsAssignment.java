package com.obsqura.TestNGAssignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsAssignment extends Base {
	@Test(description="LocatingById")
	public void locatingById() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
