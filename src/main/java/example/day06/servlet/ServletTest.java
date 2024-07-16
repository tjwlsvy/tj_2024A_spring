package example.day06.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/day06/servlettest")
public class ServletTest extends HttpServlet {
    
    // 1. doGet
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("ServletController.doPut");

        int value = 10;

        //  요청 데이터
        System.out.println("request data : " + req.getParameter("value"));
        //  응답 데이터
        resp.getWriter().println(value + 2);

    }

    // 2. doPost
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);

        int value = 10;

        //  요청 데이터
        System.out.println("request data : " + req.getParameter("value"));
        //  응답 데이터
        resp.getWriter().println(value * 2);
    }


    // 3.doPut
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPut(req, resp);
        int value = 10;

        //  요청 데이터
        System.out.println("request data : " + req.getParameter("value"));
        //  응답 데이터
        resp.getWriter().println(value / 2);
    }


    // 4.doDelete
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doDelete(req, resp);
        int value = 10;

        //  요청 데이터
        System.out.println("request data : " + req.getParameter("value"));
        //  응답 데이터
        resp.getWriter().println(value % 2);
    }


}
