/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.mavenproject1;

/**
 *
 * @author angelozurita
 */
public class DamagedIterableCollections implements IterableCollections {
    @Override
    public Iterator createIterator() {
        return new DamagedAvailableProductIterator(this);
     }
    
}
