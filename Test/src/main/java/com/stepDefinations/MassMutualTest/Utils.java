package com.stepDefinations.MassMutualTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	private WebDriver driver;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void setDriver(WebDriver wd) {
		this.driver=wd;
	}
}
