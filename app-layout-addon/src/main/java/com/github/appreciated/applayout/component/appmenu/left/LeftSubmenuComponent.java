package com.github.appreciated.applayout.component.appmenu.left;

import com.github.appreciated.applayout.builder.interfaces.Factory;
import com.github.appreciated.applayout.builder.interfaces.NavigationElementContainer;
import com.github.appreciated.applayout.webcomponents.appmenu.AppSubmenu;
import com.github.appreciated.applayout.webcomponents.paperripple.PaperRipple;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.icon.Icon;

import java.util.List;

/**
 * The component which is used for submenu webcomponents. On click it toggles a css class which causes it to grow / shrink
 */
public class LeftSubmenuComponent extends AppSubmenu implements NavigationElementContainer {

    private final String title;
    private final Icon icon;
    private Factory<String, String> captionInterceptor;

    public LeftSubmenuComponent(String title, Icon icon, List<Component> submenuElements) {
        super(title, icon);
        getItem().getElement().getStyle().set("white-space", "nowrap");
        getToggleWrapper().getElement().appendChild(new PaperRipple().getElement());
        getToggleWrapper().getElement().getStyle().set("position", "relative");
        submenuElements.forEach(element1 -> getMenu().add(element1));
        this.title = title;
        this.icon = icon;
    }

    public Icon getIcon() {
        return icon;
    }

    public String getTitle() {
        if (captionInterceptor == null) {
            return title;
        } else {
            return captionInterceptor.get(title);
        }
    }

    @Override
    public Component getComponent() {
        return this;
    }
}
