package org.example.pages;
//Carlos Efrain Chafloque Llontop
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
//Carlos Efrain Chafloque Llontop
@DefaultUrl("https://www.demoblaze.com/")
public class AccesoPage extends PageObject {
    public static final Target ENLACE_ACCESO = Target.the("Enlace para abrir el acceso")
            .located(By.id("login2"));
    public static final Target CAMPO_USUARIO_ACCESO = Target.the("Campo usuario para ingresar")
            .located(By.id("loginusername"));
    public static final Target CAMPO_CLAVE_ACCESO = Target.the("Campo clave para ingresar")
            .located(By.id("loginpassword"));
    public static final Target BOTON_CONFIRMAR_ACCESO = Target.the("Botón para confirmar ingreso")
            .located(By.xpath("//button[text()='Log in']"));
}