package com.crud;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class Logout extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
    {
        HttpSession session=request.getSession();
        session.removeAttribute("username");
        session.invalidate();
        //redirecting to login page
        response.sendRedirect("login.jsp");
    }
}
