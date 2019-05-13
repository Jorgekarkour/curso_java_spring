package com.sinensia.dao;

import java.util.List;

/**
 *Entidad para interfaz DAO (Data Access Object) para toda la app
 * @author Admin
 * @param <T> Entidad para interfaz DAO
 */
public interface InterfazDAO<T> {
    
    void poner(T valor);
    T leerUno (long id);
    List<T> leerTodos();
    void eliminar(T valor);
    void eliminar(long id);
    void modificar(T nuevoValor);
    
}
