package com.spring;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources",plugin="json:target/customer-report.json")
public class CustomerControllerTest {


}
