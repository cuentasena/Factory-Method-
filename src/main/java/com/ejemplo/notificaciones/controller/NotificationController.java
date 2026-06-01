package com.ejemplo.notificaciones.controller;

import com.ejemplo.notificaciones.service.NotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notificaciones")
public class NotificationController {

    @Autowired
    private NotificacionService notificacionService;

    @GetMapping("/email")
    public String enviarEmail() {
        return notificacionService.enviarNotificacion("email");
    }

    @GetMapping("/sms")
    public String enviarSMS() {
        return notificacionService.enviarNotificacion("sms");
    }

    @GetMapping("/whatsapp")
    public String enviarWhatsApp() {
        return notificacionService.enviarNotificacion("whatsapp");
    }
}