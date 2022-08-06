package co.com.choucair.certification.pruebautest.tasks;

import co.com.choucair.certification.pruebautest.userinterfaces.CompleteUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Complete implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(" Choucair1763818").into(CompleteUtest.PASSWORD),
                SendKeys.of(" Choucair1763818").into(CompleteUtest.CONFIRMPASSWORD),
                Click.on(CompleteUtest.CHECKSTAY),
                Click.on(CompleteUtest.CHECKPRIVACY),
                Click.on(CompleteUtest.CHECKTERMS),
                Click.on(CompleteUtest.BUTTON)
        );
    }
    public static Complete the(){
        return instrumented(Complete.class);
    }
}

