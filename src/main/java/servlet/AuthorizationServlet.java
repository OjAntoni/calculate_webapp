package servlet;

import entity.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class AuthorizationServlet extends HttpServlet {
    UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("valid","true");
        getServletContext().getRequestDispatcher("/auth.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        System.out.println(service.exists(username,password));

        if(service.exists(username,password)){
            req.getSession().setAttribute("user", new User(name,username,password));
            getServletContext().getRequestDispatcher("/").forward(req,resp);
        }
        else {
            req.setAttribute("valid", "false");
            getServletContext().getRequestDispatcher("/auth.jsp").forward(req,resp);
        }
    }
}
