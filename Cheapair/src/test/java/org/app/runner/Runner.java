package org.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\Kabil\\maven project\\Cheapair\\src\\test\\java\\org\\app\\feature",
glue = "org.app.stepdefition",dryRun = true,tags = "@Round_trip",monochrome = true,
plugin ={"pretty","html:target/cucumber_reports"})
          
public class Runner {

}
