package co.com.choucair.certification.pruebautest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/pruebaUtest.feature",
glue = "co.com.choucair.certification.pruebautest.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class PruebaUtest {
}
