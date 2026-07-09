package org.example.stepDefinition;
//Carlos Efrain Chafloque Llontop
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
//Carlos Efrain Chafloque Llontop
public class ActorTypeDefinition {
    @ParameterType("cliente")
    public Actor actor(String nombreActor) {
        return OnStage.theActorCalled(nombreActor);
    }
    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }
}
