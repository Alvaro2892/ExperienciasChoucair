package co.com.choucair.certificacion.airbnb.tasks;

import co.com.choucair.certificacion.airbnb.model.InitializeObjects;
import co.com.choucair.certificacion.airbnb.userinterface.Browse;
import co.com.choucair.certificacion.airbnb.userinterface.EnterWebSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certificacion.airbnb.util.Constants.ZEROT;

public class ComeIn implements Task
{
    private List<InitializeObjects> data;

    public ComeIn (List<InitializeObjects> data)
    {
        this.data = data;
    }

    public static Performable WebSiite(List<InitializeObjects> initializeObjects) {
        return Tasks.instrumented(ComeIn.class, initializeObjects);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Click.on(Browse.CLICKCOOKIES),
                Click.on(Browse.ORIGINFORMTEXT),
                Enter.theValue(data.get(ZEROT).getOrigin()).into(Browse.ORIGINFORMTEXT),
                Click.on(Browse.CLICKORIGINTEXTFORM));
    }
}
