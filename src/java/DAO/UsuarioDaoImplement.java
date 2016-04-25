/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Xavier
 */
public class UsuarioDaoImplement implements UsuarioDao {

    @Override
    public List<Usuario> mostrarUsuarios() {
        Session session = null;
        List<Usuario> lista = null;
        try{
            session= NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Usuarios");
            lista = (List<Usuario>) query.list();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
        }
        finally{
            if(session != null){
                session.close();
            }
        }
        return lista;
    }

    @Override
    @SuppressWarnings("null")
    public void insertaUsuario(Usuario User) {
        Session session = null;
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(User);
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session != null){
                session.close();
            }
        }
    }

    @Override
    public void modificaUsuario(Usuario User) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarUsuario(Usuario User) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
