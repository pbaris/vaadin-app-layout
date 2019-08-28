package com.github.appreciated.app.layout.addons.notification;

import com.github.appreciated.app.layout.addons.notification.entity.Notification;

public interface NotificationsChangeListener<T extends Notification> {
    default void onNotificationChanges(NotificationHolder<T> holder) {
    }

    default void onNotificationAdded(T notification) {
    }

    default void onNotificationRemoved(T notification) {
    }
}