package com.bionic.baglab.dao.impl;

/**
 * Created by username on 3/19/17.
 */

import com.bionic.baglab.dao.PagesDAO;
import com.bionic.baglab.entity.PagesEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PagesDAOimpl implements PagesDAO {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<PagesEntity> selectAll() {
        Query query = em.createQuery("SELECT  p FROM PagesEntity p");
        List<PagesEntity> pagesList = query.getResultList();
        System.out.println("SIZE of list-----------------" +pagesList.size());
        return pagesList;
    }
}
