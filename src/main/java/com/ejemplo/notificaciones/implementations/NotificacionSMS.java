package com.ejemplo.notificaciones.implementations;
import com.ejemplo.notificaciones.interfaces.Notificacion;

public class NotificacionSMS implements Notificacion {
    @Override
    public String enviar() {
        return " SMS enviado al número +57 300 123 4567: Código de verificación: 123456";
    }
}