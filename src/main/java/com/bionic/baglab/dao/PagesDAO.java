package com.bionic.baglab.dao;

import com.bionic.baglab.entity.PagesEntity;

import java.util.List;


public interface PagesDAO {
    public List<PagesEntity> selectAll();
}
