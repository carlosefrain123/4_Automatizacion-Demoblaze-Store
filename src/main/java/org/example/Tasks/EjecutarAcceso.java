package org.example.Tasks;
//Carlos Efrain Chafloque LLontop
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.pages.AccesoPage;
//Carlos Efrain Chafloque Llontop
public class EjecutarAcceso implements Task {
    private final String usuario;
    private final String clave;

    public EjecutarAcceso(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Performable conCredenciales(String usuario, String clave) {
        return new EjecutarAcceso(usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AccesoPage.ENLACE_ACCESO),
                Enter.theValue(usuario).into(AccesoPage.CAMPO_USUARIO_ACCESO),
                Enter.theValue(clave).into(AccesoPage.CAMPO_CLAVE_ACCESO),
                Click.on(AccesoPage.BOTON_CONFIRMAR_ACCESO)
        );
    }
}