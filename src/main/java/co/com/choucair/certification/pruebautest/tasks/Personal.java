package co.com.choucair.certification.pruebautest.tasks;

import co.com.choucair.certification.pruebautest.userinterfaces.PersonalUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Personal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Juan").into(PersonalUtest.FIRSTNAME),
                SendKeys.of("Cordoba").into(PersonalUtest.LASTNAME),
                SendKeys.of("esteban@gmail.com").into(PersonalUtest.EMAIL),
                SendKeys.of("February").into(PersonalUtest.BIRTHMONTH),
                SendKeys.of("5").into(PersonalUtest.BIRTHDAY),
                SendKeys.of("2002").into(PersonalUtest.BIRTHYEAR)
        );
    }
    public static Personal the(){
        return instrumented(Personal.class);
    }
}
