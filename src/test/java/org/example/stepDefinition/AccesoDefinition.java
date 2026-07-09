package org.example.stepDefinition;
//Carlos Efrain Chafloque Llontop
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.pages.AccesoPage;
import org.example.Tasks.AbrirPagina;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.assertj.core.api.Assertions.assertThat;
//Carlos Efrain Chafloque Llontop
public class AccesoDefinition {
    @Given("el {actor} visita el portal de la tienda online")
    public void elClienteVisitaElPortal(Actor actor) {
        actor.attemptsTo(AbrirPagina.paginaPrincipal());
    }

    @And("el usuario pulsa el enlace para iniciar sesión")
    public void elUsuarioPulsaElEnlaceParaIniciarSesion() {
        theActorInTheSpotlight().attemptsTo(Click.on(AccesoPage.ENLACE_ACCESO));
    }

    @And("digita las credenciales usuario {string} y clave {string}")
    public void digitaLasCredenciales(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(usuario).into(AccesoPage.CAMPO_USUARIO_ACCESO),
                Enter.theValue(clave).into(AccesoPage.CAMPO_CLAVE_ACCESO)
        );
    }

    @Then("el usuario confirma el ingreso al sistema")
    public void elUsuarioConfirmaElIngreso() {
        theActorInTheSpotlight().attemptsTo(Click.on(AccesoPage.BOTON_CONFIRMAR_ACCESO));
    }

    @And("se valida que la sesión quedó activa")
    public void seValidaQueLaSesionQuedoActiva() {
        Actor actor = theActorInTheSpotlight();
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean visible = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))
        ).isDisplayed();

        assertThat(visible).isTrue();
    }
}
