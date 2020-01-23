package co.com.choucair.certificacion.airbnb.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.choucair.certificacion.airbnb.util.Constants.*;

public class Browse
{
    public static final Target CLICKCOOKIES = Target.the("Cllick Cokkies").located(By.xpath(CLICKCOOKIESLOCATOR));
    public static final Target ORIGINFORMTEXT = Target.the("Enterokay Origin").located(By.id(ORIGINFORMTEXTLOCATOR));
    public static final Target CLICKORIGINTEXTFORM = Target.the("Click Origin").located(By.xpath(CLICKORIGINFORTEXTLOCATOR));
}
