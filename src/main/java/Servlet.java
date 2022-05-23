import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = "/xxx")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        String name = request.getParameter("name") ;
        int age = Integer.parseInt(request.getParameter("age"));
        String dayofbirth = request.getParameter("dayofbirth");
        Customer customer = new Customer(name,age,dayofbirth);
        customerList.add(customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("information.jsp");
        request.setAttribute("List",customerList);
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
