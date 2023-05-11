<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 	CSS (w3css) de la Page -->
    <link rel="stylesheet" href="<c:url value="css/w3.css" />"/>

    <title>Devoir Java à rendre</title>

</head>

<body>

<%--<jsp:include page="header.jsp"></jsp:include>--%>

<div class="w3-container">
    <div class="w3-panel w3-black">
        <h2 class="w3-opacity" style="text-align: center">Page d'espionnage des clients</h2>
    </div>

    <br>

    <img src="../../resources/images/espion.jpg" />

    <div class="w3-panel w3-leftbar w3-light-grey">
        <p class="w3-xlarge w3-serif">
            <i>"Bonjour à toi espion Java007 ! Bienvenue sur la page d'espionnage : Ici tu pourras trouver tout nos clients avec leurs informations, mais surtout leurs coordonnées, bon espionnage !"</i></p>
        <p>Marine K006</p>
    </div>

    <a class="w3-button" href="<c:url value="/" />">Retour</a>
</div>

</body>
<!-- JavaScript resources dataTables + jQuery -->

</html>
