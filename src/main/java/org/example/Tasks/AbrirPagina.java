package org.example.Tasks;
//Carlos Efrain Chafloque Llontop
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.example.pages.TiendaPage;
//Carlos Efrain Chafloque Llontop
public class AbrirPagina {
    public static Performable paginaPrincipal() {
        return Task.where("{0} abre la página principal", Open.browserOn().the(TiendaPage.class));
    }
}