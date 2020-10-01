package com.build.qa.build.selenium.tests;

import org.junit.Test;

import com.build.qa.build.selenium.framework.BaseFramework;
import com.build.qa.build.selenium.pageobjects.homepage.HomePage;

public class BuildTest extends BaseFramework {

	
	@Test
	public void navigateToHomePage() {
		driver.get(getConfiguration("HOMEPAGE"));
		HomePage homePage = new HomePage(driver, wait);

		softly.assertThat(homePage.onBuildTheme())
			.as("The website should load up with the Build.com desktop theme.")
			.isTrue();
	}

	
	@Test
	public void searchForProductLandsOnCorrectProduct() {
		// TODO: Implement this test
	}

	
	@Test
	public void addProductToCartFromCategoryDrop() {
		// TODO: Implement this test
	}

	
	@Test
	public void addProductToCartAndEmailIt() {
		// TODO: Implement this test
	}

	
	@Test
	public void facetNarrowBysResultInCorrectProductCounts() {
		// TODO: Implement this test
	}
}
