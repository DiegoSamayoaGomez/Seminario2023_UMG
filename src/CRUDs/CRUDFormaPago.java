/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import POJOs.FormaPago;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Samayoa
 */
public class CRUDFormaPago {

    //SELECT
    public static List<FormaPago> universo() {
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().getCurrentSession();
        List<FormaPago> lista = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(FormaPago.class);
            criteria.add(Restrictions.eq("estado", true));
            criteria.addOrder(Order.desc("idFormaPago"));
            criteria.setMaxResults(500); // se limita la cantidad de datos a mostrar
            lista = criteria.list();

        } catch (HibernateException e) {
            System.out.println("Error" + e);
        } finally {
            session.getTransaction().commit(); //La sesion se cierra de forma distinta al update e insert
        }
        return lista;

    }

}
