<%-- 
    Document   : etape2
    Created on : Nov 23, 2022, 2:48:12 PM
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
            h1 {
                background-color: lightgreen ; 
                 padding: 10px  20px;
                 border-bottom-right-radius: 10px;
                 width:80%;
                 font-size: 18px;
            }
            </style>
    </head>
    <body>
        <form method="POST" action="etape2">
            <h1>1. VOTRE PROFIL </h1>
            <table>
                
                <tr>
                    <td>Sexe : </td>
                    <td> 
                        <INPUT type="radio" name="sexe" value="F" >
                        <span>F</span></td>
                    <td> 
                        <INPUT type="radio" name="sexe" value="M"  >
                        <span>M </span></td>

                </tr>
                
                <tr>
                    <td>Poids: </td>
                    <td><input name="poids" value="<%= session.getAttribute("poids")%>"/></td>

                </tr>
                <tr>
                    <td>Taille : </td>
                    <td><input name="taille" value="<%= session.getAttribute("taille")%>"></input></td>

                </tr>
                <tr>
                    <td>Date de naissance:  </td>
                    <td><input name="jour" placeholder="jour" value="<%= session.getAttribute("jour")%>"></input></td>
                    <td><input name="mois"  placeholder="mois" value="<%= session.getAttribute("mois")%>"></input></td>
                    <td><input name="annee"  placeholder="annee" value="<%= session.getAttribute("annee")%>"></input></td>

                </tr>

            </table>

            <h1>2. CREER VOTRE COMPTE</h1>
            <table>
                <tr>
                    <td>*EMAIL: </td>
                    <td><input name="email" /></td>

                </tr>
                <tr>
                    <td>*MOT DE PASSE: </td>
                    <td><input name="password" type="password"></input></td>

                </tr>
                <tr>
                    <td>*CONFIRMATION MOT DE PASSE: </td>
                    <td><input name="Compassword" type="password"></input></td>

                </tr>
                <tr>
                    <td>
                          <%
               if(request.getAttribute("error") != null){
                   out.print(request.getAttribute("error"));
               
               }
           %>
                    </td>
                </tr>
            </table>
            <h1>3. VOTRE CADRE D'ALIMENTATION</h1>
            <table>
                <tr>*Type de regime: </tr>
               <tr>
                    <td> 
                        <INPUT type="radio" name="regime" value="minceur" >
                        <span>Minceur</span>
                    </td>
                    <td> 
                        <INPUT type="radio" name="regime" value="minceur rapide">
                        <span>Minceur rapide </span>
                    </td>
                </tr>
                <tr>
                    <td> 
                        <INPUT type="radio" name="regime" value="equilibre" >
                        <span>Equilibre</span>
                    </td>
                    <td> 
                        <INPUT type="radio" name="regime" value="sportif">
                        <span>Sportif</span>
                    </td>
                    
                </tr>
                <tr>
                    <td>
                          <%
               if(request.getAttribute("errorreg") != null){
                   out.print(request.getAttribute("errorreg"));
               }
           %>
                    </td>
                </tr>
               

            </table>
            <button type="submit">je valide</button>
        </form>
    </body>
</html>
