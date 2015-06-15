/**
 * org.darwin.myweb.dao.AllPlanDaoImpl.java
 * created by Tianxin(tianjige@163.com) on 2015年6月15日 下午5:36:24
 */
package org.darwin.myweb.dao;

import org.darwin.genericDao.dao.impl.GenericAllShardsDao;
import org.darwin.genericDao.dao.impl.ScanShardsJdbcTemplate;
import org.darwin.myweb.bo.Plan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * created by Tianxin on 2015年6月15日 下午5:36:24
 */
@Repository
public class AllPlanDaoImpl extends GenericAllShardsDao<Integer, Plan> implements AllPlanDao{
  /**
   * 默认生成的该类的LOG记录器，使用slf4j组件。避免产生编译警告，使用protected修饰符。
   */
  protected final static Logger LOG = LoggerFactory.getLogger(AllPlanDaoImpl.class);
  
  @Override
  @Autowired
  public void setShardsJdbcTemplate(ScanShardsJdbcTemplate jdbcTemplate) {
    super.setShardsJdbcTemplate(jdbcTemplate);
  }
 
}
