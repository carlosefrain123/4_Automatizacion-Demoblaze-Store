package org.example.Tasks;
//Carlos Efrain Chafloque Llontop
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.pages.TiendaPage;
//Carlos Efrain Chafloque Llontop
public class DirigirseAlCesto implements Task {
    public static Performable comoAccion() {
        return new DirigirseAlCesto();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TiendaPage.ENLACE_CESTO)
        );
    }
}