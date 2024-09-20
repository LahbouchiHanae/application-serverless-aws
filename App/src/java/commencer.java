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
@WebServlet(urlPatterns = {"/commencer"})
public class commencer extends HttpServlet {

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
            String sex = request.getParameter("sexe");
            String poids = request.getParameter("poids");
            String taille = request.getParameter("taille");
            String jour = request.getParameter("jour");
            String mois = request.getParameter("mois");
            String annee = request.getParameter("annee");

            HttpSession session = request.getSession();
            session.setAttribute("sex", sex);
            session.setAttribute("poids", poids);
            session.setAttribute("taille", taille);
            session.setAttribute("jour", jour);
            session.setAttribute("mois", mois);
            session.setAttribute("annee", annee);

            if (sex.equals("") || poids.equals("") || taille.equals("") || jour.equals("") || mois.equals("") || annee.equals("") ) {
                if (sex.equals("")) {
                    request.setAttribute("errorsex", "champ obligatoire");

                }
                if (poids.equals("")) {
                    request.setAttribute("errorpoids", "champ obligatoire");

                }
                if (taille.equals("")) {
                    request.setAttribute("errortaille", "champ obligatoire");
                }
                if (jour.equals("")) {
                    request.setAttribute("errordate", "champ obligatoire");

                }
                if (mois.equals("")) {
                    request.setAttribute("errordate", "champ obligatoire");

                }
                if (annee.equals("")) {
                    request.setAttribute("errordate", "champ obligatoire");
                }
                getServletContext().getRequestDispatcher("/commencer.jsp").forward(request, response);

            } else {
                getServletContext().getRequestDispatcher("/etape2.jsp").forward(request, response);
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
