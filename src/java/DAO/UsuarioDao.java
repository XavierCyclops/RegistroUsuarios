/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author Xavier
 */
public interface UsuarioDao {
    public List<Usuario> mostrarUsuarios();
    public void insertaUsuario(Usuario User);
    public void modificaUsuario(Usuario User);
    public void eliminarUsuario(Usuario User);
}
