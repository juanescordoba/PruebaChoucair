package co.com.choucair.certification.pruebautest.tasks;

import co.com.choucair.certification.pruebautest.userinterfaces.AddressUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Address implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddressUtest.SELECTCOUNTRY),
                Click.on(AddressUtest.COUNTRY),
                Click.on(AddressUtest.NEXTDEVICE)
        );
    }
    public static Address the(){
        return instrumented(Address.class);
    }
}
