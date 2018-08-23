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
import com.accenture.ui.SearchBox;
import com.accenture.ui.Usuario;

public class IngresarUsuario implements Task {

   // private final String usuario;
    //private final String password;
    private final String destinatario;
    private final String subject;
    private final String cuerpomensaje;
    

    protected IngresarUsuario(/*String usuario,String password,*/String destinatario,String subject, String cuerpomensaje) {
        /*this.usuario = usuario;
        this.password = password;*/
        this.destinatario = destinatario;
        this.subject = subject;
        this.cuerpomensaje = cuerpomensaje;
        
        
        
    }

    @Step("Escribir usuario,contraseña y redactar")
    public <T extends Actor> void performAs(T actor) {
        /*actor.attemptsTo(
                Enter.theValue(usuario)
                     .into(Usuario.USUARIO)
                     .thenHit(ENTER)
        );
        
        actor.attemptsTo(
                Enter.theValue(password)
                     .into(Usuario.PASSWORD)
                     .thenHit(ENTER)
        );*/
        
        actor.attemptsTo(
                Click.on(Usuario.REDACTAR)
        );
        
        actor.attemptsTo(
                Enter.theValue(destinatario)
                     .into(Usuario.DESTINATARIO)
                     .thenHit(ENTER)
        );
             
        actor.attemptsTo(
                Enter.theValue(subject)
                     .into(Usuario.SUBJECT)
                     .thenHit(ENTER)
        );
        
        actor.attemptsTo(
                Enter.theValue(cuerpomensaje)
                     .into(Usuario.CUERPOMENSAJE)
                     .thenHit(ENTER)
        );
        
        actor.attemptsTo(
                Click.on(Usuario.ENVIAR)
        );
        
 
    }

    public static IngresarUsuario forTheTerm(/*String usuario,String password,*/ String destinatario, String subject, String cuerpomensaje) {
        return instrumented(IngresarUsuario.class,/* usuario, password,*/ destinatario, subject, cuerpomensaje);
    }

	
	
	
	
	
	
	
		   /* protected IngrearGmail() {/// recordar que no es ingresar sino ingrear
		    }

		    @Step("Clik en Gmail")
		    public <T extends Actor> void performAs(T actor) {
		        actor.attemptsTo(
		                Click.on(Gmail.clickG)
		        );
		    }
		    
		    public static IngrearGmail forTheTerm() {
		        return instrumented(IngrearGmail.class);
		        
		    }*/
		    
	    
		    
		    
		}
		
