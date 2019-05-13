package com.sinensia;

/**
 *
 * @author Admin - Jorge
 */
public class Entidad {
    protected long id;
        
    public Entidad(long id) {
        this.id = id;
        }
        
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
}
