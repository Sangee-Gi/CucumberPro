package runner;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
// extends AbstractTestNGCucumberTests

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\compre\\BDD_Cucmber\\BDD\\src\\test\\java\\Features\\TC.feature",
		glue="StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}
