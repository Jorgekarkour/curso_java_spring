package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin - Jorge
 */
public class ProductoDAO implements InterfazDAO<Producto> {
    
    HashMap<Long, Producto> mapa;
    
    public ProductoDAO() {
        
        mapa = new HashMap<>();
    }

    @Override
    public void poner(Producto pro) {
        if(pro == null) {
            System.err.println("No se puede añadir nulos");
        } else {
        mapa.put((pro.getId()), pro);
        }
    }

    @Override
    public Producto leerUno(long id) {
        if (mapa.containsKey(id)) {
            return mapa.get(id);
        }
        System.err.println("Clave/Producto no encontrado" + id);
        return null;
    }

    @Override
    public List<Producto> leerTodos() {
        ArrayList<Producto> listaProDAO = new ArrayList<>();
        for (Map.Entry<Long, Producto> entrada  : mapa.entrySet()) {
            listaProDAO.add(entrada.getValue());
        }
        return listaProDAO;
    }

    @Override
    public void eliminar(Producto valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Producto nuevoValor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
