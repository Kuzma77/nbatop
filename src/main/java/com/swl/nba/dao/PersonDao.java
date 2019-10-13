package com.swl.nba.dao;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * @author wl_sun
 * @ClassName $(NAME)
 * @Description TODO
 * @Date 2019/10/11
 * @Version 1.0
 **/
public interface PersonDao {
    List<Entity> findAll() throws SQLException;
}
