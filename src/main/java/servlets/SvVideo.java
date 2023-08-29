
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvVideo", urlPatterns = {"/SvVideo"})
public class SvVideo extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            
        throws ServletException, IOException {
        String idVideo = request.getParameter("idvideo");
        
        System.out.println("idVideo: " + idVideo);
       //aqui vienen los datos por GET
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //aqui vienen los datos por POST
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
