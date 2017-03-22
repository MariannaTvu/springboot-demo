package com.bionic.baglab.dao;

import com.bionic.baglab.entity.Pages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

//import javax.transaction.Transactional;
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

//@Transactional
public interface PagesDao extends CrudRepository<Pages, Long> {

  /**
   * Return all pages or null if no is found.
   * 
   *
   */
  public List<Pages> findAll();

} // class UserDao
