/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author acer
 */
@WebServlet(urlPatterns = {"/etape2"})
public class etape2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String mdp = request.getParameter("password");
            String Cmdp = request.getParameter("Compassword");
            String regime = request.getParameter("regime");

            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            session.setAttribute("regime", regime);

            if (email.equals("") || mdp.equals("") || Cmdp.equals("") || regime.equals("")) {
                if (email.equals("")) {
                    request.setAttribute("error", "tout les champs sont obligatoires");

                }
                if (mdp.equals("")) {
                    request.setAttribute("error", "tout les champs sont obligatoires");

                }
                if (Cmdp.equals("")) {
                    request.setAttribute("error", "tout les champs sont obligatoires");
                }
                if (regime.equals("")) {
                    request.setAttribute("errorreg", "tout les champs sont obligatoires");

                }
                

                getServletContext().getRequestDispatcher("/etape2.jsp").forward(request, response);

            } else {
                if( mdp.equals(Cmdp)){
                    getServletContext().getRequestDispatcher("/profil.jsp").forward(request, response);
                }else{
                     request.setAttribute("error", "mot de passe et confirmation mot de passe sont differents");
                      getServletContext().getRequestDispatcher("/etape2.jsp").forward(request, response);
                }
                
            }

        }
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
