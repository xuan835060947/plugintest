package com.test;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class Hello  implements ApplicationComponent {


    public Hello() {

    }


    public void initComponent() {

        // TODO: insert component initialization logic here

    }


    public void disposeComponent() {

        // TODO: insert component disposal logic here

    }


    @NotNull

    public String getComponentName() {

        return "MyComponent";

    }


    public void sayHello() {

        // Show dialog with message

        Messages.showMessageDialog(

                "Hello World!",

                "Sample",

                Messages.getInformationIcon()

        );

    }

}