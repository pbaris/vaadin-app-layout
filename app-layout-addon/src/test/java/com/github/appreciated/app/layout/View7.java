package com.github.appreciated.app.layout;

import com.vaadin.flow.router.Route;

@Route(value = "view7", layout = MainLayout.class)
public class View7 extends AbstractView {
    @Override
    String getViewName() {
        return getClass().getName();
    }
}