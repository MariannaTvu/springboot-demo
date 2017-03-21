package com.bionic.baglab.controls;

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
    PagesService pagesService;

    @RequestMapping("/pages")
    public List<PagesEntity> showPages(){
        return pagesService.getPagesEntities();
    }

}
