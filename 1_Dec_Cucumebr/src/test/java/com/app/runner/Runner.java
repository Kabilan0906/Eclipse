package com.app.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\new\\Oct_Cucumebr\\src\\test\\java\\com\\app\\feature",
glue="com.app.stepdefition",
dryRun=false,
tags=" @Smoke",
monochrome=true,
plugin= {"rerun:target/failedrerun.txt"})

public class Runner {

}
