package org.poutsjr.cra.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;

/**
 * Created with IntelliJ IDEA.
 * User: poutsjr
 * Date: 05/03/13
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
public class PremiereServlet extends HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        resp.setContentType("text/html");
        ServletOutputStream out = resp.getOutputStream();
        out.println("<HTML>\n");
        out.println("<HEAD>\n");
        out.println("<TITLE>Bonjour</TITLE>\n");
        out.println("</HEAD>\n");
        out.println("<BODY>\n");
        out.println("<H1>Bonjour</H1>\n");
        out.println("</BODY>\n");
        out.println("</HTML>");
    }

}
