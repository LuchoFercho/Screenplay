package com.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.ui.Gmail;
import com.accenture.ui.Usuario;

	


	public class IngrearGmail implements Task {

	    private final String usuario;
	    private final String password;
	    

	    protected IngrearGmail(String usuario,String password) {
	        this.usuario = usuario;
	        this.password = password;
	    }


	    @Step("Clik en Gmail")
	    public <T extends Actor> void performAs(T actor) {
	        actor.attemptsTo(
	                Click.on(Gmail.clickG)
	        );
	        
	        actor.attemptsTo(
	                Enter.theValue(usuario)
	                     .into(Usuario.USUARIO)
	                     .thenHit(ENTER)
	        );
	        
	        actor.attemptsTo(
	                Enter.theValue(password)
	                     .into(Usuario.PASSWORD)
	                     .thenHit(ENTER)
	        );
	        
	        
	        
	    }
	    
	    public static IngrearGmail forTheTerm(String usuario,String password) {
	        return instrumented(IngrearGmail.class,usuario, password);
	        
	    }
	    
    
	    
	    
	}
	