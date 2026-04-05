package com.stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Desktop\\SeleniumCucumberProject\\src\\test\\resources\\FeatureWithTags",glue= {"com.stepdefination"},
tags= "@Smoke and @Regression",
monochrome=true,
plugin={"html:Reports/HTMLReports/index.html","json:Reports/JsonReports/Cucumber.json"}
)
public class TestRunner_withTag {

}
