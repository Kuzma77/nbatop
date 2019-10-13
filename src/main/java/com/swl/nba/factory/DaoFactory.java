package com.swl.nba.factory;

import com.swl.nba.dao.PersonDao;
import com.swl.nba.dao.impl.PersonDaoImpl;

/**
 * @author wl_sun
 * @ClassName $(NAME)
 * @Description TODO
 * @Date 2019/10/11
 * @Version 1.0
 **/
public class DaoFactory {
    public static PersonDao getPersonDaoInstance(){
        return new PersonDaoImpl();
    }
}
