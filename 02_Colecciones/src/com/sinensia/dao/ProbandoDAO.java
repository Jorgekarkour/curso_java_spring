package com.sinensia.dao;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;

/**
 *
 * @author Admin - Jorge
 */
public class ProbandoDAO {
    public static void probarCliente() {
        
        
        GenericoDAO<Cliente> cliDAO = new GenericoDAO();
        Cliente nuevoCli = new Cliente(80, "Pepito", "pepito@gmail.com");
        
        ClienteDAO repoCli = new ClienteDAO();
        repoCli.poner(new Cliente(1, "Ana", "aa@aa"));
        repoCli.poner(new ClienteInvitado(2, "Jose", "jj@jj"));
        repoCli.poner(new ClienteInvitado(3, "Maria", "mm@mm"));
        
        System.out.println("\nTodos los Clientes: \n" + repoCli.leerTodos().toString());
        System.out.println("Maria: " + repoCli.leerUno(3).toString());
        
        repoCli.poner(nuevoCli);
        repoCli.eliminar(1);
        repoCli.modificar(new ClienteInvitado(2, "Mario", "mariobros@hotmail.com"));
        Cliente cli = repoCli.leerUno(2);
        
        System.out.println("Cliente modificado: " + cli.toString());
        System.out.println("\nTodos los Clientes: \n" + repoCli.leerTodos().toString());
    }

}
