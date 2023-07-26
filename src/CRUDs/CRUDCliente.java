package CRUDs;

import POJOs.Cliente;
import POJOs.Usuario;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
}
