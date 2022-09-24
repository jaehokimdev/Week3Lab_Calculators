
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Joe Kim
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      request.setAttribute("result", "---");
      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String[] operationvalues = request.getParameterValues("operation");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);

        Boolean isNumber = true;
        
        try {
            Integer.parseInt(first);
            Integer.parseInt(second);
        } catch (NumberFormatException e) {
            isNumber = false;
            }
    
        if (first == null || first.equals("") || second == null || second.equals("") || isNumber == false) {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;

        } else {
            int newfirst = Integer.parseInt(first);
            int newsecond = Integer.parseInt(second);
            
            switch (operationvalues[0]) {
                case "+" :
                    request.setAttribute("result", newfirst + newsecond);
                    break;
                case "-" :
                    request.setAttribute("result", newfirst - newsecond);
                    break;
                case "*" :
                    request.setAttribute("result", newfirst * newsecond);
                    break;
                case "%" :
                    request.setAttribute("result", newfirst % newsecond);
                    break;
            }       
        }          
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

}
