package CRUDs;

import POJOs.Cliente;
import POJOs.Usuario;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CRUDCliente {

    public static boolean insert(String nombre1, String nombre2, String apellido1,
            String apellido2, String nit, String direccion, String telefono, int usuario) {
        boolean flag = false;
        Date fecha = new Date();
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.eq("nombre1", nombre1));
        criteria.add(Restrictions.eq("nombre2", nombre2));
        criteria.add(Restrictions.eq("apellido1", apellido1));
        criteria.add(Restrictions.eq("apellido2", apellido1));

        criteria.add(Restrictions.eq("estado", true));
        Cliente insert = (Cliente) criteria.uniqueResult();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            if (insert == null) {
                insert = new Cliente();
                insert.setEstado(true);
                insert.setNombre1(nombre1);
                insert.setNombre2(nombre2);
                insert.setApellido1(apellido1);
                insert.setApellido2(apellido2);
                insert.setNit(nit);
                insert.setDireccion(direccion);
                insert.setTelefono(telefono);

                Usuario usuario2 = new Usuario();
                usuario2.setIdUsuario(usuario);
                insert.setUsuarioByUsuarioIngreso(usuario2);

                insert.setFechaIngreso(fecha);
                session.save(insert);
                flag = true;

            }
            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Error = " + e);

        } finally {
            session.close();

        }
        return flag;

    }

    public static boolean update(Integer idCliente, String nombre1, String nombre2, String apellido1,
            String apellido2, String nit, String direccion, String telefono, int idUsuario) {
        boolean flag = false;
        Date fecha = new Date();
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Cliente.class);
        criteria.add(Restrictions.eq("idCliente", idCliente));
        Cliente update = (Cliente) criteria.uniqueResult();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            if (update != null) {
                update.setNombre1(nombre1);
                update.setNombre2(nombre2);
                update.setApellido1(apellido1);
                update.setApellido2(apellido2);
                update.setNit(nit);
                update.setDireccion(direccion);
                update.setTelefono(telefono);

                update.setFechaModifica(fecha);

                Usuario usuario = new Usuario();
                usuario.setIdUsuario(idUsuario);
                update.setUsuarioByUsuarioModifica(usuario);

                session.update(update);
                flag = true;

            }
            transaction.commit();

        } catch (Exception e) {
            System.out.println("Error = " + e);
        } finally {
            session.close();

        }
        return flag;

    }

    //SELECT
    public static List<Cliente> universo() {
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().getCurrentSession();
        List<Cliente> lista = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Cliente.class);
            criteria.add(Restrictions.eq("estado", true));
            criteria.addOrder(Order.desc("idCliente"));
            criteria.setMaxResults(500); // se limita la cantidad de datos a mostrar
            lista = criteria.list();

        } catch (HibernateException e) {
            System.out.println("Error" + e);
        } finally {
            session.getTransaction().commit(); //La sesion se cierra de forma distinta al update e insert
        }
        return lista;

    }
    
    //SELECT ESPECIFICO
    public static Cliente select(Integer idCliente){
    Session session =HibernateUtil.HibernateUtil.getSessionFactory().openSession();
    Criteria criteria = session.createCriteria(Cliente.class);
    criteria.add(Restrictions.eq("idCliente", idCliente));
    Cliente select = (Cliente)criteria.uniqueResult();
    if(select == null){
    select = new Cliente();
    select.setIdCliente(0);}
    session.close();
    return select;
    }
    
    

}
