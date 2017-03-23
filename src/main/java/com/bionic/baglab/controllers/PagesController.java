package com.bionic.baglab.controllers;

import com.bionic.baglab.dao.PagesDao;
import com.bionic.baglab.entity.PagesEntity;
import com.bionic.baglab.services.PagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by username on 3/21/17.
 */

@RestController
public class PagesController {
    @Autowired
    private PagesService pagesService;

    @Autowired
    private PagesDao pagesDaoRepo;

    @RequestMapping("/pages")
    public List<PagesEntity> showPages(){
        //System.out.println("size= " + pagesService.getPagesEntities());
        return pagesService.getPagesEntities();
        //List<PagesEntity> list = new ArrayList<>() ;
        //return list;
        //System.out.println("size= " + pagesDaoRepo.findAll().size());
        //return pagesDaoRepo.findAll();


    }

}
