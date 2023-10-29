/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import POJOs.Producto;
import POJOs.Usuario;
import POJOs.Venta;
import POJOs.VentaDetalle;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Samayoa
 */
public class CRUDVentaDetalle {

    public static boolean insert(Integer idVenta, Integer idProducto, Integer cantidad, BigDecimal monto) {
        boolean flag = false;

        Session session = HibernateUtil.HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(VentaDetalle.class);        //Forma 1
        criteria.createAlias("venta", "v");
        criteria.createAlias("producto", "p");

        criteria.add(Restrictions.eq("p.idProducto", idProducto));
        criteria.add(Restrictions.eq("v.idVenta", idVenta));
        VentaDetalle insert = (VentaDetalle) criteria.uniqueResult(); //Hace una comparativa y permite hacer la exclusiion
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            if (insert == null) {
                insert = new VentaDetalle(); //solo se usa cuando se inserta algo completamente nuevo

                Venta venta = new Venta();
                venta.setIdVenta(idVenta);
                insert.setVenta(venta);

                Producto producto = new Producto();
                producto.setIdProducto(idProducto);
                insert.setProducto(producto);

                insert.setProducto(producto);
                insert.setCantidad(cantidad);
                insert.setMonto(monto);

                session.save(insert);
                flag = true;

            }
            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Error=" + e);

        } finally {
            session.close();

            //permite ejecutar codigo de forma obligatoria
        }

        return flag;
    }

    public static List<VentaDetalle> universo(Integer idVenta) {
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().getCurrentSession();
        List<VentaDetalle> lista = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(VentaDetalle.class);
           
            //Cargar los datos de otra clase
            criteria.createAlias("venta", "v");      
            criteria.createAlias("producto", "p");
            
            criteria.setProjection(Projections.projectionList()
                    .add(Projections.property("idVentaDetalle"))
                    .add(Projections.property("p.nombreProducto"))
                    .add(Projections.property("cantidad"))
                    .add(Projections.property("monto"))                 
            );
            
            criteria.add(Restrictions.eq("v.idVenta", idVenta));
            criteria.addOrder(Order.desc("idVentaDetalle"));
            criteria.setMaxResults(500); // se limita la cantidad de datos a mostrar
            lista = criteria.list();

        } catch (HibernateException e) {
            System.out.println("Error" + e);
        } finally {
            session.getTransaction().commit(); //La sesion se cierra de forma distinta al update e insert
        }
        return lista;
    }
    
        public static List<VentaDetalle> reporteVenta(Integer idVenta) {
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().getCurrentSession();
        List<VentaDetalle> lista = null;
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(VentaDetalle.class);
           
            //Cargar los datos de otra clase
            criteria.createAlias("venta", "v");      
            criteria.createAlias("producto", "p");
            criteria.createAlias("v.cliente", "c");
            criteria.createAlias("v.formaPago", "f");
               criteria.createAlias("v.usuarioByUsuarioIngreso", "u");
            
            
            
            criteria.setProjection(Projections.projectionList()
                    
                    .add(Projections.property("v.idVenta"))
                    .add(Projections.property("c.nombre1"))
                    .add(Projections.property("v.fechaVenta"))
                    .add(Projections.property("f.descripcion"))
                    .add(Projections.property("p.nombreProducto"))
                    .add(Projections.property("cantidad"))
                    .add(Projections.property("monto"))     
                    .add(Projections.property("u.usuario"))
                    
            );
            
            criteria.add(Restrictions.eq("v.idVenta", idVenta));
            criteria.addOrder(Order.desc("idVentaDetalle"));
            criteria.setMaxResults(500); // se limita la cantidad de datos a mostrar
            lista = criteria.list();

        } catch (HibernateException e) {
            System.out.println("Error" + e);
        } finally {
            session.getTransaction().commit(); //La sesion se cierra de forma distinta al update e insert
        }
        return lista;
    }

    public static boolean eliminar(Integer idVentaDetalle) {
        boolean flag = false;
        Date fecha = new Date();
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(VentaDetalle.class);
        //Las comillas son el nombre de lavariable de SQL
        criteria.add(Restrictions.eq("idVentaDetalle", idVentaDetalle));
        VentaDetalle update = (VentaDetalle) criteria.uniqueResult();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            if (update != null) {
                session.delete(update);
                flag = true;

            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Error" + e);
        } finally {
            session.close();
        }
        return flag;

    }

        
        public static List<VentaDetalle> selectMontoTotal(Integer idVenta) throws ParseException {
        Session session = HibernateUtil.HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

  
        Query query = session.createSQLQuery("call procedimientoTotal("+idVenta+");");
        List<VentaDetalle> listDatos = query.list();
        session.getTransaction().commit();
        return listDatos;
    }
        

}
