package InitalPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Feature",glue= {"InitalPackage"},

plugin= {"pretty","html:target/Htmlreport/report.html","json:target/Jsonreport/report.json","junit:target/JunitReport/report.xml"})
public class Runner {
	

}
