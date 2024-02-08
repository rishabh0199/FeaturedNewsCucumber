package testCases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//main source file all execution start from here
//all step definition feature file all run from here

//if you want all feature file just pass folder name 
//if you have some more feature file put , and give name
//glue keyword used to step definition file
//rerun use to run the failure test cases

@RunWith(Cucumber.class)
@CucumberOptions( 
		features= {".//FeatureFiles/News.feature"},
		glue="stepDefinitions",
		plugin= {"pretty",
				"html:reports/myreport.html",
				"rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		//actual execution not done if dry run is true
		//dryRun=false,//to check every methods in feature file is implemented in  step definition
		//monochrome = true,//remove junk characters from console output
		//publish=true//share report to team gives url of report on console
		
		//tags="@sanity"//this will execute scenarios tagged with sanity in feature files

		)

public class TestRun {
	

}
