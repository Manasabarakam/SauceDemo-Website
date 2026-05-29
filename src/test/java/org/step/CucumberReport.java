package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReport {

	public static void generateReport(String name) {
		
		File f = new File("target/");
		
		Configuration c = new Configuration(f,"SauceDemo Project");
		
		c.addClassifications("os","windows");
		c.addClassifications("browser", "Chrome");
		c.addClassifications("version","144.0.7559.252");
		c.addClassifications("Sprint number", "4");
		c.addClassifications("Test Number", "5");
		
		List<String> li = new ArrayList<>();
		li.add(name);
		
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
		
		
		
	}
}
