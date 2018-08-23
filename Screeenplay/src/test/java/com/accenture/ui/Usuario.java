package com.accenture.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Usuario {
    public static Target USUARIO = Target.the("Usuario").located(By.xpath("//input[@id='identifierId']"));
    public static Target PASSWORD = Target.the("Password").located(By.xpath("//input[@name='password']"));
    public static Target REDACTAR = Target.the("Redactar").located(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
    public static Target DESTINATARIO = Target.the("Destinatario").located(By.xpath("//textarea[@name='to']"));
    public static Target SUBJECT = Target.the("Asunto").located(By.xpath("//input[@name='subjectbox']"));
    public static Target CUERPOMENSAJE = Target.the("Cuerpo Mensaje").located(By.xpath("//div[@itacorner='6,7:1,1,0,0']"));
    public static Target ENVIAR = Target.the("Enviar").located(By.xpath("//*[@class='gU Up']//*[text()='Send']"));
        
}
