package edi.curso.poo.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/copo.feature",
        glue = {"edi.curso.poo.test"},
        tags= {"@integradosCucumber"},
        plugin = {"pretty"},
        monochrome= true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = true
        )
public class CopoRunner
{

}
