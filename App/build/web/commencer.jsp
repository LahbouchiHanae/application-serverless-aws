<%-- 
    Document   : commencer
    Created on : Nov 23, 2022, 2:31:05 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            button {
                background-color: lightblue;
                padding: 10px  20px;
                border: none ;
                border-radius: 10px;
            }
        </style>
    </head>
    <body>
        <form method="POST" action="commencer">
            <table>
                <tr>
                   <tr>
                    <td>Sexe : </td>
                    <td> 
                        <INPUT type="radio" name="sexe" value="F" checked>
                    <span>F</span></td>
                    <td> 
                        <INPUT type="radio" name="sexe" value="M">
                    <span>M </span></td>
                    <td>
                        <%
               if(request.getAttribute("errorsex") != null){
                   out.print(request.getAttribute("errorsex"));
               }
           %>
                    </td>
                </tr>
                </tr>
                <tr>
                    <td>Poids: </td>
                    <td><input name="poids"/></td>
                    <td>
                        <%
               if(request.getAttribute("errorpoids") != null){
                   out.print(request.getAttribute("errorpoids"));
               }
           %>
                    </td>
                </tr>
                <tr>
                    <td>Taille : </td>
                    <td><input name="taille"></input></td>
                    <td>
                        <%
               if(request.getAttribute("errortaille") != null){
                   out.print(request.getAttribute("errortaille"));
               }
           %>
                    </td>
                </tr>
                <tr>
                    <td>Date de naissance:  </td>
                   <td><input name="jour" placeholder="jour"></input></td>
                   <td><input name="mois"  placeholder="mois"></input></td>
                   <td><input name="annee"  placeholder="annee"></input></td>
                   <td>
                        <%
               if(request.getAttribute("errordate") != null){
                   out.print(request.getAttribute("errordate"));
               }
           %>
                    </td>
                </tr>
               
            </table>
            <button type="submit">je commence</button>
        </form>
    </body>
</html>
