/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject1;

/**
 *
 * @author angelozurita
 */
public class WireDecorator extends NotificationDecorator {
    
    public WireDecorator(NotificationService wrapper) {
        super(wrapper);
    }
    
    @Override
    public void Notify() {
        super.Notify();
        sendWire();
    }

    private void sendWire() {
        System.out.println("Enviando notificación por Wire...");
    }

}
