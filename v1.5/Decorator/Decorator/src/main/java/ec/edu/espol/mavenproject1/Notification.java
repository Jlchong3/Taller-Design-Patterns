/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject1;

/**
 *
 * @author angelozurita
 */
public class Notification implements NotificationService  {

    @Override
    public void Notify() {
        SendSms();
        SendEmail();
    }

    private void SendSms() {
        System.out.println("Enviando notificación por SMS...");
    }

    private void SendEmail() {
            System.out.println("Enviando notificación por Email...");
    }
        
}
