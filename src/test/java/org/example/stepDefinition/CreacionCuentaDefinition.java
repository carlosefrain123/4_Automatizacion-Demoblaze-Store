package org.example.stepDefinition;
//Carlos Efrain Chafloque Llontop
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.example.Tasks.AbrirPagina;
import org.example.Tasks.CrearCuenta;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.assertj.core.api.Assertions.assertThat;
//Carlos Efrain Chafloque Llontop
public class CreacionCuentaDefinition {
    @Given("el {actor} ingresa al portal de la tienda online")
    public void elClienteIngresaAlPortal(Actor actor) {
        actor.attemptsTo(AbrirPagina.paginaPrincipal());
    }

    @When("completa el formulario de alta con usuario {string} y clave {string}")
    public void completaElFormularioDeAlta(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(CrearCuenta.conDatos(usuario, clave));
    }

    @Then("el sistema confirma la creación de la cuenta")
    public void elSistemaConfirmaLaCreacionDeLaCuenta() {
        Actor actor = theActorInTheSpotlight();
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alerta = wait.until(ExpectedConditions.alertIsPresent());

        String mensaje = alerta.getText();
        alerta.accept();

        List<String> mensajesValidos = List.of(
                "Sign up successful.",
                "This user already exist."
        );

        assertThat(mensajesValidos).contains(mensaje);
    }
}
