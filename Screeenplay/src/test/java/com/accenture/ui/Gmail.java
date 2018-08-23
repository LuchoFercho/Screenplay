package com.accenture.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Gmail {
    public static Target clickG = Target.the("Gmail").located(By.xpath("//a[contains(text(),'Gmail')]"));
}

