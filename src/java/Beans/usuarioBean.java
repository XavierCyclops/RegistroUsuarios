/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.UsuarioDao;
import DAO.UsuarioDaoImplement;
import Modelo.Usuario;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Xavier
 */
@Named(value = "usuarioBean")
@ViewScoped

public class usuarioBean implements Serializable{
Usuario user;

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public void insertar(){
        UsuarioDao link = new UsuarioDaoImplement();
        link.insertaUsuario(user);
        user = new Usuario();
    }
    /**
     * Creates a new instance of usuarioBean
     */
    public usuarioBean() {
        user = new Usuario();
    }
    
}
