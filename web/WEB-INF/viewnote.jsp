<%-- 
    Document   : viewnote
    Created on : Jun 7, 2021, 11:16:24 PM
    Author     : 851314
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note - Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <label><b>Title: </b>${note.title}</label>
        <br><br>
        <label><b>Contents: </b></label>
        <p>${note.contents}</p>
        <a href="note?edit">Edit</a>
    </body>
</html>