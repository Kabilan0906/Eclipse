package com.app.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed_Retry implements IRetryAnalyzer {

	int min = 1;
	int max = 5;

	public boolean retry(ITestResult result) {
		if (min < max) {
			min++;
			return true; // testcase fail
		}
		return false; // test false
	}

}
