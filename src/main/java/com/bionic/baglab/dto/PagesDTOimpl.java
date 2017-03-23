package com.bionic.baglab.dto;

//import javax.inject.Inject;
//import javax.inject.Named;
import com.bionic.baglab.dao.PagesDAO_old;
import com.bionic.baglab.entity.PagesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PagesDTOimpl implements PagesDTO  {

    //@javax.inject.Inject
    @Autowired
    PagesDAO_old pagesDaoOld;


    @Override
    public List<PagesEntity> selectAll() {
        return pagesDaoOld.selectAll();
    }
}