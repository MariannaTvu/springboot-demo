package com.bionic.baglab.dto;

import com.bionic.baglab.entity.PagesEntity;

import java.util.List;

/**
 * Created by username on 3/21/17.
 */
public interface PagesDTO {
    public List<PagesEntity> selectAll();
}
