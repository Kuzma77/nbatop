package com.swl.nba.dao;

import cn.hutool.db.Entity;
import com.swl.nba.dao.impl.PersonDaoImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author wl_sun
 * @ClassName $(NAME)
 * @Description TODO
 * @Date 2019/10/11
 * @Version 1.0
 **/
public class PersonDaoTest {
    private PersonDao personDao = new PersonDaoImpl();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
        List<Entity> entityList = null;
        try {
            entityList = personDao.findAll();
        } catch (SQLException e) {
            System.err.println("查询用户数据出现异常");
        }
        if (entityList != null) {
            entityList.forEach(entity -> System.out.println(entity));

        }else {
            System.out.println("没有数据");
        }
    }
}
