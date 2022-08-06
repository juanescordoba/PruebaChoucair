package co.com.choucair.certification.pruebautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CompleteUtest {
    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");
    public static final Target CONFIRMPASSWORD = Target.the("confirm password").
            locatedBy("//input[@id=\"confirmPassword\"]");
    public static final Target CHECKSTAY = Target.the("check stay informed").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox signup-consent__checkbox--highlight\"]");
    public static final Target CHECKTERMS = Target.the("check stay terms").
            locatedBy("//span[@ng-class=\"{error: userForm.termOfUse.$error.required}\"]");
    public static final Target CHECKPRIVACY = Target.the("check stay privacy").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");
    public static final Target BUTTON = Target.the("button complete").
            locatedBy("//a[@class=\"btn btn-blue\"]");


}
