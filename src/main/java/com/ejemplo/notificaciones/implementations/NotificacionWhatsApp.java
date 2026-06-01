package com.ejemplo.notificaciones.implementations;
import com.ejemplo.notificaciones.interfaces.Notificacion;

public class NotificacionWhatsApp implements Notificacion {
    @Override
    public String enviar() {
        return "💬 Mensaje de WhatsApp enviado: Tu pedido ha sido confirmado ✅";
    }
}