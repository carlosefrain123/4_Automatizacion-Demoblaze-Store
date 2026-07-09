package org.example;
//Carlos Efrain Chafloque Llontop
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//Carlos Efrain Chafloque Llontop
@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features="src/test/resources/features",
        glue="org.example",
        tags= "@CasoExitoso"
)

public class RunnerTest {

}
