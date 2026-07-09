package org.example.Tasks;
//Carlos Efrain Chafloque Llontop
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.pages.TiendaPage;
//Carlos Efrain Chafloque Llontop
public class CrearCuenta implements Task {
    private final String usuario;
    private final String clave;

    public CrearCuenta(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TiendaPage.ENLACE_ALTA),
                Enter.theValue(usuario).into(TiendaPage.CAMPO_USUARIO),
                Enter.theValue(clave).into(TiendaPage.CAMPO_CLAVE),
                Click.on(TiendaPage.BOTON_CONFIRMAR_ALTA)
        );
    }

    public static Performable conDatos(String usuario, String clave) {
        return new CrearCuenta(usuario, clave);
    }
}