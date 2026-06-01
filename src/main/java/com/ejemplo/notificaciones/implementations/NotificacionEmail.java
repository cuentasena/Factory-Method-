package com.ejemplo.notificaciones.implementations;
import com.ejemplo.notificaciones.interfaces.Notificacion;

public class NotificacionEmail implements Notificacion {
    @Override
    public String enviar() {
        return "📧 Correo electrónico enviado al usuario: Bienvenido a nuestra plataforma";
    }
}