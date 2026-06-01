package com.ejemplo.notificaciones.factory;
import com.ejemplo.notificaciones.interfaces.Notificacion;
import com.ejemplo.notificaciones.implementations.*;

public class NotificacionFactory {
    
    public static Notificacion crearNotificacion(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de notificacion no puede ser nulo");
        }
        
        switch (tipo.toLowerCase()) {
            case "email":
                return new NotificacionEmail();
            case "sms":
                return new NotificacionSMS();
            case "whatsapp":
                return new NotificacionWhatsApp();
            default:
                throw new IllegalArgumentException("Tipo de notificación no valido: " + tipo);
        }
    }
}