package com.swl.nba.dao.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.swl.nba.dao.PersonDao;

import java.sql.SQLException;
import java.util.List;

/**
 * @author wl_sun
 * @ClassName $(NAME)
 * @Description TODO
 * @Date 2019/10/11
 * @Version 1.0
 **/
public class PersonDaoImpl  implements PersonDao {
    @Override
    public List<Entity> findAll() throws SQLException {
        return Db.use().query("SELECT * FROM nba_top ORDER BY id DESC ");
    }
}
