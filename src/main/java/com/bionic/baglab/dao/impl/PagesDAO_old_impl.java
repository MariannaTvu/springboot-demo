package com.bionic.baglab.dao.impl;

/**
 * Created by username on 3/19/17.
 */

import com.bionic.baglab.dao.PagesDAO_old;
import com.bionic.baglab.entity.Pages;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PagesDAO_old_impl implements PagesDAO_old{
    @PersistenceContext
    private EntityManager em;


    public List<Pages> selectAll() {
        Query query = em.createQuery("SELECT  p FROM pages p");
        List<Pages> pagesList = query.getResultList();
        System.out.println("SIZE of list-----------------" +pagesList.size());
        return pagesList;
    }
}
