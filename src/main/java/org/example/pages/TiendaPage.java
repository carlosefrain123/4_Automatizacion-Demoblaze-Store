package org.example.pages;
//Carlos Efrain Chafloque Llontop
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
//Carlos Efrain Chafloque Llontop
@DefaultUrl("https://www.demoblaze.com/")
public class TiendaPage extends PageObject {
    public static final Target ENLACE_ALTA = Target.the("Enlace para crear cuenta")
            .located(By.id("signin2"));
    public static final Target CAMPO_USUARIO = Target.the("Campo de usuario nuevo")
            .located(By.id("sign-username"));
    public static final Target CAMPO_CLAVE = Target.the("Campo de clave nueva")
            .located(By.id("sign-password"));
    public static final Target BOTON_CONFIRMAR_ALTA = Target.the("Botón para confirmar alta")
            .located(By.xpath("//button[text()='Sign up']"));
    public static final Target ARTICULO = Target.the("Artículo {0}")
            .located(By.xpath("//a[@class='hrefch' and text()='{0}']"));
    public static final Target ENLACE_CESTO = Target.the("Enlace del cesto de compras")
            .located(By.xpath("//a[text()='Cart']"));
}