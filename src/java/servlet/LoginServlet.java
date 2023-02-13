package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author migue
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        //if(session.getAttribute("username"))
 
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String uData = request.getParameter("uInput");
        String pData = request.getParameter("pInput");
        
        if(uData != "" && pData != ""){
            
        }

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
