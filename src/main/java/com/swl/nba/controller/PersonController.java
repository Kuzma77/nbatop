package com.swl.nba.controller;

import cn.hutool.db.Entity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.swl.nba.factory.DaoFactory;
import com.swl.nba.utils.ResponseObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
/**
 * @author wl_sun
 * @ClassName $(NAME)
 * @Description 用户控制层
 * @Date 2019/10/11
 * @Version 1.0
 **/


@WebServlet(urlPatterns = "/person")
public class PersonController  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Entity> entityList = null;
        try {
            entityList = DaoFactory.getPersonDaoInstance().findAll();
        } catch (SQLException e) {
            System.err.println("查询用户数据出现异常");
        }
        ResponseObject ro = new ResponseObject();
        ro.setCode(resp.getStatus());
        if(resp.getStatus() == 200){
            ro.setMsg("请求成功");
        }else{
            ro.setMsg("请求失败");
        }
        ro.setData(entityList);

        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setContentType("application/json;charset = utf-8");
        PrintWriter out = resp.getWriter();
        Gson gson = new GsonBuilder().create();
        out.print(gson.toJson(ro));
        out.close();

    }
}
