package servlet;

import entity.Operation;
import entity.User;
import service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/history")
public class HistoryServlet extends HttpServlet {

    OperationService opService = new OperationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Operation> operations = opService.getAll(((User) req.getSession().getAttribute("user")));
        for (Operation operation : operations) {
            System.out.println(operation);
        }
        req.setAttribute("operations", operations);
        getServletContext().getRequestDispatcher("/history.jsp").forward(req,resp);
    }
}
