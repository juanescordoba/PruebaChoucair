package co.com.choucair.certification.pruebautest.tasks;

import co.com.choucair.certification.pruebautest.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Home implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUtest.REGISTER)
        );
    }
    public static Home thePage(){
        return instrumented(Home.class);
    }
}
