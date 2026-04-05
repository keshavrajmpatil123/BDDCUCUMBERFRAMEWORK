package com.stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemo.feature",glue= {"stepsforhooks"},

monochrome=true,
plugin={"html:Reports/HTMLReports/index.html","json:Reports/JsonReports/Cucumber.json"}
)


public class TestRunnerHooks {

}
