package co.com.choucair.certification.pruebautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUtest {
    public static final Target REGISTER = Target.the("register utest").
            locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");
}
