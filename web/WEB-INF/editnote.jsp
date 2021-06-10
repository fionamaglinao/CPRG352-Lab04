<%-- 
    Document   : editnote
    Created on : Jun 7, 2021, 11:16:40 PM
    Author     : 851314
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note - Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>

        <form method="POST" action="note">
            <label>Title: </label>
            <input type="text" name="title" value="${note.title}">
            <br>
            <label>Contents: </label>
            <%--<input type="text" name="contents" value="${note.contents}">--%>
            <textarea name="contents" rows="6" cols="30">
            ${note.contents}
            </textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
