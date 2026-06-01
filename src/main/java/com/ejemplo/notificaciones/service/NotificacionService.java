package com.ejemplo.notificaciones.service;
import com.ejemplo.notificaciones.factory.NotificacionFactory;
import com.ejemplo.notificaciones.interfaces.Notificacion;
public class NotificacionService {
    
    public String enviarNotificacion(String tipo) {
        Notificacion notificacion = NotificacionFactory.crearNotificacion(tipo);
        return notificacion.enviar();
    }
}