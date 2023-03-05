package runner;


import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@ExtendedCucumberOptions(jsonReport = "report/cucumber.json", usageReport = true, detailedAggregatedReport = true, overviewReport= true, overviewChartsReport = true)
@CucumberOptions(features= "src/test/resources/features",
        glue = {"classpath:stepdefs"},
        plugin = {"pretty", "html:build/reports/cucumber/cucumber-html-report.html", "json:report/cucumber.json"},
        tags = "@1"
)
public class TestRunner {
}
