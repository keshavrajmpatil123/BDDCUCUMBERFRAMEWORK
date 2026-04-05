package com.stepdefination;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackgroundDemo/BackgroundDemo.feature",glue= {"StepsForBackground"},

monochrome=true,
plugin={"html:Reports/HTMLReports/index.html","json:Reports/JsonReports/Cucumber.json"}
)

public class TestRunnerforbackgrounddemo {

}
