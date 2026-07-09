package org.example.pages;
//Carlos Efrain Chafloque Llontop
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
//Carlos Efrain Chafloque Llontop
@DefaultUrl("https://www.demoblaze.com/")
public class ArticuloPage extends PageObject {
    public static final Target BOTON_INCORPORAR_CESTO = Target.the("Botón Add to cart")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));
}