package org.example.Tasks;
//Carlos Efrain Chafloque Llontop
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.example.pages.ArticuloPage;
//Carlos Efrain Chafloque Llontop
public class AnadirArticuloAlCesto implements Task {
    private final String articulo;

    public AnadirArticuloAlCesto(String articulo) {
        this.articulo = articulo;
    }

    public static Performable elegido(String articulo) {
        return new AnadirArticuloAlCesto(articulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target articuloBuscado = Target.the("Artículo " + articulo)
                .located(By.xpath("//a[@class='hrefch' and text()='" + articulo + "']"));
        actor.attemptsTo(
                Click.on(articuloBuscado),
                Click.on(ArticuloPage.BOTON_INCORPORAR_CESTO)
        );
    }
}