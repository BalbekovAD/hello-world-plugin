package com.github.balbekovad.helloworldplugin

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.popup.JBPopupFactory
import com.intellij.psi.PsiFile
import com.intellij.ui.GotItTooltip

class ShowHelloWorldAction: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val notification = Notification(
            HELLO_WORLD_NOTIFICATION_GROUP_ID,
            MyBundle.message("hello.world.notification.title"),
            MyBundle.message("hello.world.notification.text"),
            NotificationType.INFORMATION
        )
        Notifications.Bus.notify(notification, e.project)
    }

    override fun isDumbAware() = true



}