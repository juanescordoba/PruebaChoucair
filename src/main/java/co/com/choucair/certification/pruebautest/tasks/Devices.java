package co.com.choucair.certification.pruebautest.tasks;

import co.com.choucair.certification.pruebautest.userinterfaces.AddressUtest;
import co.com.choucair.certification.pruebautest.userinterfaces.DevicesUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Devices implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DevicesUtest.WINDOWS),
                Click.on(DevicesUtest.VERSION),
                Click.on(DevicesUtest.SYSTEM),
                Click.on(DevicesUtest.SPANISH),
                Click.on(DevicesUtest.MOVIL),
                Click.on(DevicesUtest.MODEL),
                Click.on(DevicesUtest.LANGUAJE),
                Click.on(DevicesUtest.CRYSTAL),
                Click.on(DevicesUtest.COMPUTER),
                Click.on(DevicesUtest.DIEZ),
                Click.on(DevicesUtest.BUTTON),
                Click.on(DevicesUtest.ANDROID),
                Click.on(DevicesUtest.ALCATEL)
        );
    }
    public static Devices the(){
        return instrumented(Devices.class);
    }
}
