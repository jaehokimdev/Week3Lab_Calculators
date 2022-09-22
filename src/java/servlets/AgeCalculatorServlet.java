
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joe Kim
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculators.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String age = request.getParameter("age");
        
        request.setAttribute("age", age);
        
        Boolean isNumber = false;
        
        try {
            Integer.parseInt(age);
            isNumber = true;
        } catch (NumberFormatException e) {
            isNumber = false;
            }
        
        if (age == null || age.equals("") || isNumber == false) {
            request.setAttribute("message", "You must give your current age");
        } else {
            int newage = Integer.parseInt(age) + 1;
            request.setAttribute("message", "Your age next birthday will be " + newage);
        }            
        
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculators.jsp").forward(request, response);

    }

}
