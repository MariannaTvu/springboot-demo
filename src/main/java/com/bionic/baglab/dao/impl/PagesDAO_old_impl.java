package com.bionic.baglab.dao.impl;

/**
 * Created by username on 3/19/17.
 */

import com.bionic.baglab.dao.PagesDAO_old;
import com.bionic.baglab.entity.PagesEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PagesDAO_old_impl implements PagesDAO_old {
    @PersistenceContext
    private EntityManager em;


    public List<PagesEntity> selectAll() {
        Query query = em.createQuery("SELECT  p FROM PagesEntity p");
        List<PagesEntity> pagesEntityList = query.getResultList();
        System.out.println("----------------" + pagesEntityList.get(0).toString());
        return pagesEntityList;
    }
}
