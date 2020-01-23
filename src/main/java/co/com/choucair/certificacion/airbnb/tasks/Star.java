package co.com.choucair.certificacion.airbnb.tasks;

import co.com.choucair.certificacion.airbnb.userinterface.EnterWebSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Star implements Task
{
    private EnterWebSite enterWebSite;

    public static Star webSite() {
        return Tasks.instrumented(Star.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(enterWebSite));
    }
}
