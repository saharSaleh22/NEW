package project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="html: outml/cucu.html",features="use-cases", glue="project")
public class RunLibrary {

}
