package com.github.letsrokk.issues;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/features/"})
public class CucumberJvmTest extends AbstractTestNGCucumberTests {

}
