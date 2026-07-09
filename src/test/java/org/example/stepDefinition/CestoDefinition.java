package org.example.stepDefinition;
//Carlos Efrain Chafloque Llontop
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.example.Tasks.AnadirArticuloAlCesto;
import org.example.Tasks.DirigirseAlCesto;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.assertj.core.api.Assertions.assertThat;
//Carlos Efrain Chafloque Llontop
public class CestoDefinition {
    @When("elige el artículo {string}")
    public void eligeElArticulo(String articulo) {
        theActorInTheSpotlight().attemptsTo(AnadirArticuloAlCesto.elegido(articulo));
    }

    @Then("el artículo queda incorporado al cesto")
    public void elArticuloQuedaIncorporadoAlCesto() {
        Actor actor = theActorInTheSpotlight();
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alerta = wait.until(ExpectedConditions.alertIsPresent());

        String mensaje = alerta.getText();
        alerta.accept();

        assertThat(mensaje).startsWith("Product added");
    }

    @And("el usuario se dirige al cesto de compras")
    public void elUsuarioSeDirigeAlCestoDeCompras() {
        theActorInTheSpotlight().attemptsTo(DirigirseAlCesto.comoAccion());
    }
}
