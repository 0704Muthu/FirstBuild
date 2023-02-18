package org.youtube.Google;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Project\\TestNg_Rev\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		TakesScreenshot ts = (TakesScreenshot) driver;//narrowing
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Project\\Google\\Scr\\home.png");
		FileUtils.copyFile(source, destination);
	}
}
