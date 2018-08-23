package com.accenture.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.accenture.tasks.OpenTheApplication;
import com.accenture.tasks.Search;
import com.accenture.tasks.Excel;
import com.accenture.tasks.IngrearGmail;
import com.accenture.tasks.IngresarUsuario;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.io.FileNotFoundException;
import java.io.IOException;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;
    //IngrearGmail IngrearGmail;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() throws FileNotFoundException, InterruptedException, IOException {
    	
    	
    	
    	String[] correos = new String[5];
    	correos= Excel.leerExcel(correos);

        givenThat(anna).wasAbleTo(openTheApplication);//se prepara para hacer tareas. Todo lo que se necesita para hacer las tareas

        //givenThat(anna).wasAbleTo(IngrearGmail);
        when(anna).attemptsTo(IngrearGmail.forTheTerm("luferoas537@gmail.com","feas1206"));
        
        for(int j=0;j<5;j++) {
        when(anna).attemptsTo(IngresarUsuario.forTheTerm(correos[j], "Saludo","Te saludo desde Serenity"));
        }
        then(anna).should(eventually(seeThat(TheWebPage.title(), containsString("Inbox"))));

    }
}