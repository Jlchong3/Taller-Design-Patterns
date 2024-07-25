/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject1;

/**
 *
 * @author angelozurita
 */
public class NotificationDecorator implements NotificationService {
    protected NotificationService wrapper;

    public NotificationDecorator(NotificationService wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void Notify() {
        wrapper.Notify();
    }
}