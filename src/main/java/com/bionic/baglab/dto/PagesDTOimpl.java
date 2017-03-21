package com.bionic.baglab.dto;

//import javax.inject.Inject;
//import javax.inject.Named;

import com.bionic.baglab.dao.PagesDAO;
import com.bionic.baglab.entity.PagesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by username on 3/21/17.
 */

@Component
public class PagesDTOimpl implements PagesDTO  {

    //@javax.inject.Inject
    @Autowired
    PagesDAO pagesDao;


    @Override
    public List<PagesEntity> selectAll() {
        return pagesDao.selectAll();
    }
}
