/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject1;

/**
 *
 * @author angelozurita
 */
public class AvailableProductIterator implements Iterator{
    private AvailableIterableCollections collection ;
    private int iterationState;

    public AvailableProductIterator(AvailableIterableCollections collection) {
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
