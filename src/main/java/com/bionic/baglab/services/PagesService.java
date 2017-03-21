package com.bionic.baglab.services;

import com.bionic.baglab.dto.PagesDTO;
import com.bionic.baglab.entity.PagesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by username on 3/21/17.
 */
@Service
public class PagesService {
    @Autowired
    PagesDTO pagesDTO;

    public List<PagesEntity> getPagesEntities(){
        return pagesDTO.selectAll();
    }
}
