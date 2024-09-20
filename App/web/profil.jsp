<%-- 
    Document   : profil
    Created on : Nov 23, 2022, 3:16:56 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           out.println("<p>Sexe : "+session.getAttribute("sex")+"</p>");
           out.println("<p> poids: "+session.getAttribute("poids")+"</p>");
           out.println("<p> taille:"+session.getAttribute("taille")+"</p>");
           out.println("<p> date de naissance : "+session.getAttribute("jour")+" / "+ session.getAttribute("mois")+" / "+session.getAttribute("annee")+ "</p>");
           out.println("<p> email : "+session.getAttribute("email")+"</p>");
           out.println("<p> type de regime : "+session.getAttribute("regime")+"</p>");
       %>
       
       <a href="deconnexion">Deconnexion</a>
    </body>
</html>
