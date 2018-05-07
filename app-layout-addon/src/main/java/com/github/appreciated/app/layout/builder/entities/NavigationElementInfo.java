package com.github.appreciated.app.layout.builder.entities;

import com.github.appreciated.app.layout.builder.factories.DefaultNavigationElementInfoProducer;
import com.vaadin.flow.component.icon.Icon;

/**
 * Data structure that contains all the needed information of a {@link com.github.appreciated.app.layout.builder.elements.NavigatorNavigationElement}. This class is being used by
 * by the {@link DefaultNavigationElementInfoProducer}.
 */

public class NavigationElementInfo {
    String caption;
    Icon icon;
    String viewName;

    public NavigationElementInfo(String caption, Icon icon, String viewName) {
        this.caption = caption;
        this.icon = icon;
        this.viewName = viewName;
    }

    public NavigationElementInfo(String caption, String viewName) {
        this.caption = caption;
        this.viewName = viewName;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}
