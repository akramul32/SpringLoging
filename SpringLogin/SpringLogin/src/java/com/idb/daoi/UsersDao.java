/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.daoi;

import com.idb.pojo.Users;
import com.idb.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DOLPHIN
 */

@Repository
public class UsersDao {

    public boolean createUser(Users u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;

        try {
            t = session.beginTransaction();
            session.save(u);
            t.commit();
            return true;
        } catch (Exception e) {

            if (t != null) {
                t.rollback();
            }

        } finally {
            session.close();
        }

        return false;

    }

    public boolean userLogin(Users u) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;

        try {
            t = session.beginTransaction();
            Query q = session.createQuery("from Users where name=:name and password=:pass");
            q.setString("name", u.getName());
            q.setString("pass", u.getPassword());
            List<Users> list = q.list();
            t.commit();

            if (list.size() > 0) {
                return true;
            }

        } catch (Exception e) {

            if (t != null) {
                t.rollback();
            }

        } finally {
            session.close();
        }

        return false;

    }
}
