package testCases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//main source file all execution start from here
//all step definition feature file all run from here

//if you want all feature file just pass folder name 
//if you have some more feature file put , and give name
//glue keyword used to step definition file
@RunWith(Cucumber.class)
@CucumberOptions( 
		features= {".//FeatureFiles/News.feature"},
		glue="stepDefinitions"
		)
public class TestRun {
	

}
