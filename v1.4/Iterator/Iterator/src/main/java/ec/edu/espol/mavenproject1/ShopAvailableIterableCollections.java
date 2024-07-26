/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject1;

/**
 *
 * @author angelozurita
 */
public class ShopAvailableIterableCollections  implements IterableCollections{

    @Override
    public Iterator createIterator() {
        return new ShopAvailableProductIterator(this);
    }
    
}
