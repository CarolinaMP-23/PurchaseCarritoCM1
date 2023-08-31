package userinterface;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.sym.Name;
import jxl.read.biff.CountryRecord;
import net.serenitybdd.screenplay.targets.Target;

public class PurchaseFormaPage {
    public static final Target NAME_FIELD = Name;
    public static final Target COUNTRY_DROPSOWN = CountryRecord;
    private static Target City;
    public static final Target CITY_FIELD = City;
    public static final Target CREDIT_CARD_FIELD = CREDIT_CARD_FIELD;
    public static final Target EXPIRATION_MONTH_DROPDOWN = EXPIRATION_MONTH_DROPDOWN;
    public static final Target EXPIRATION_YEAR_DROPDOWN = EXPIRATION_YEAR_DROPDOWN;
    public static final Target BUY_BUTTON = BUY_BUTTON;
}

