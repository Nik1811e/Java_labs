package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Sss extends javax.servlet.http.HttpServlet
        implements javax.servlet.Servlet {



    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        String filename = rq.getParameter("file");
        String docdir   = getServletContext().getInitParameter("doc-dir");

        System.out.println("Servlet:SSS");
    }
}
