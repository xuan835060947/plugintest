package com.test;

import com.intellij.openapi.actionSystem.AnAction;

import com.intellij.openapi.actionSystem.AnActionEvent;

import com.intellij.openapi.application.Application;

import com.intellij.openapi.application.ApplicationManager;

public class SayHellowAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {

        Application application = ApplicationManager.getApplication();

        Hello myComponent = application.getComponent(Hello.class);

        myComponent.sayHello();

    }

}
