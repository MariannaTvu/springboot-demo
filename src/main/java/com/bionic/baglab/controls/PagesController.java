package com.bionic.baglab.controls;

import com.bionic.baglab.dao.PagesDao;
import com.bionic.baglab.entity.Pages;
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
/*
    @Autowired
    private PagesDao daoRepo;*/

    @RequestMapping("/pages")
    public List<Pages> showPages(){
        System.out.println("size= " + pagesService.getPagesEntities());
        return pagesService.getPagesEntities();
    }

}
