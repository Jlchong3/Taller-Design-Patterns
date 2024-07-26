/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject1;

/**
 *
 * @author angelozurita
 */
public class DamagedAvailableProductIterator implements Iterator{
    
    private DamagedIterableCollections collection;
    private int iterationState;

    public DamagedAvailableProductIterator(DamagedIterableCollections collection) {
        this.collection = collection;
    }
    
    @Override
    public boolean hasMore() {
        return false;
    }

    @Override
    public Product getNext() {
        return null;
    }
    
}
