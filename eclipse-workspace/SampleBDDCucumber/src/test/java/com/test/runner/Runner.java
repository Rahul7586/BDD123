package com.test.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Features", glue={"com.test.StepDefinations"},
monochrome=true,
plugin= {"html:Reports\\htmlreports","json:Reports\\jsonReport\\jsonreport.json", "junit:Reports\\Junitreports\\cucumber.xml"},
dryRun=true
//strict = true
)
public class Runner{

}
