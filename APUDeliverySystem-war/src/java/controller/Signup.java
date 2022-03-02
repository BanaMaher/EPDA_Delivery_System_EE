/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MyUser;
import model.UserFacade;

/**
 *
 * @author banamaher
 */
@WebServlet(name = "Signup", urlPatterns = {"/Signup"})
public class Signup extends HttpServlet {

    @EJB
    private UserFacade userFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request server request
     * @param response server response
     * @throws ServletException if a server-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String email = request.getParameter("email");
        String pswd = request.getParameter("pswd");
        String fullName = request.getParameter("fullName");
        String address = request.getParameter("address");
        int phone = Integer.parseInt(request.getParameter("phone"));
        int icNum = Integer.parseInt(request.getParameter("ic"));
        String userRole = request.getParameter("userRoleParam");
        
        
        MyUser found = userFacade.find(email);
        request.getRequestDispatcher("signup.jsp").include(request, response);
        
        
        
        try (PrintWriter out = response.getWriter()) {  
            String userRoleFromReq = request.getParameter("userRoleParam");
            
            if (userRoleFromReq == "customer") {
                userRole = "customer";
            }
            
            if(found == null){
                MyUser newUser = new MyUser(email,
                                    pswd,
                                    fullName,
                                    address,
                                    phone,
                                    icNum,
                                    userRole);
                
                 userFacade.create(newUser);
                out.println("<br> Registration Done!");
            } else {
                out.println("<br> The username has been registered!");
            }
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
