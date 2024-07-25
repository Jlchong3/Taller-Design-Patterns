/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.mavenproject1;

/**
 *
 * @author angelozurita
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        NotificationService notification = new Notification();

        notification = new WhatsAppDecorator(notification);
        notification = new SignalDecorator(notification);

        notification.Notify();
    }
}


