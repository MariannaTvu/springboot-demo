package com.bionic.baglab.dao;

import com.bionic.baglab.entity.PagesEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * A DAO for the entity User is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 * 
 * @author netgloo
 */

@Transactional
public interface PagesDao extends CrudRepository<PagesEntity, Long> {

  /**
   * Return all pages or null if no is found.
   * 
   *
   */
  public List<PagesEntity> findAll();

  public PagesEntity findByBody(String body);

} // class UserDao
