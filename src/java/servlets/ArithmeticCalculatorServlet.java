
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
        String operation = request.getParameter("operation");
        String[] operationvalues = request.getParameterValues(operation);
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("operation", operation);

        Boolean isNumber = false;
        
        try {
            Integer.parseInt(first);
            Integer.parseInt(second);
            isNumber = true;
        } catch (NumberFormatException e) {
            isNumber = false;
            }
    
        if (first == null || first.equals("") || second == null || second.equals("") || isNumber == false) {
            request.setAttribute("result", "invalid");
        } else {
            int newfirst = Integer.parseInt(first);
            int newsecond = Integer.parseInt(second);
            
            PrintWriter pw=response.getWriter();
        response.setContentType("text/html");

        pw.println(operationvalues[1]);   
       pw.close();    
            
//            if (operationvalues[0] == "+"){
//                request.setAttribute("result", newfirst + newsecond);
//            }
            
//            switch (operationvalues[0]) {
//                case "+" :
//                    request.setAttribute("result", newfirst + newsecond);
//                    break;
//                case "-" :
//                    request.setAttribute("result", newfirst - newsecond);
//                    break;
//                case "*" :
//                    request.setAttribute("result", newfirst * newsecond);
//                    break;
//                case "%" :
//                    request.setAttribute("result", newfirst % newsecond);
//                    break;
//            }       
        }          
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

}
