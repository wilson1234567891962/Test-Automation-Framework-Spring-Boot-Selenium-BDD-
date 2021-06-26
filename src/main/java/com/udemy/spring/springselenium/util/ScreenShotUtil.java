package com.udemy.spring.springselenium.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

@Lazy
@Component
public class ScreenShotUtil {
	
	@Autowired
	private TakesScreenshot driver;
	
	@Autowired
	private JavascriptExecutor js;
	
	@Value("${screenshot.path}")
	private String pathItem;
	
	public void takeScreenShot() throws IOException {
		js.executeScript("");
		File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
		Path paths = Paths.get(pathItem+"/img.png");
	    FileCopyUtils.copy(sourceFile, paths.toFile());
	}

}
