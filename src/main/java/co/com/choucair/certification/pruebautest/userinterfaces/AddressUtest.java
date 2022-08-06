package co.com.choucair.certification.pruebautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddressUtest {

    public static final Target SELECTCOUNTRY = Target.the("select country").
            locatedBy("//span[@class=\"ui-select-match-text pull-left\"]");
    public static final Target COUNTRY = Target.the("country").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[55]");
    public static final Target NEXTDEVICE = Target.the("button next").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}
