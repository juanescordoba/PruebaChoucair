package co.com.choucair.certification.pruebautest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DevicesUtest {
    public static final Target COMPUTER = Target.the("computer").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toogle\"])[1]");
    public static final Target WINDOWS = Target.the("windows").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");
    public static final Target VERSION = Target.the("version").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toogle\"])[2]");
    public static final Target DIEZ = Target.the("version diez").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[17]");
    public static final Target LANGUAJE = Target.the("languaje").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toogle\"])[3]");
    public static final Target SPANISH = Target.the("spanish").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[38]");
    public static final Target MOVIL = Target.the("movil").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toogle\"])[4]");
    public static final Target ALCATEL = Target.the("alcatel").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");
    public static final Target MODEL = Target.the("model").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toogle\"])[5]");
    public static final Target CRYSTAL = Target.the("crystal").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");
    public static final Target SYSTEM = Target.the("system").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toogle\"])[6]");
    public static final Target ANDROID = Target.the("alcatel").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[1]");
    public static final Target BUTTON = Target.the("button next").
            locatedBy("//a[@aria-label=\"Next - final step\"]");

}
