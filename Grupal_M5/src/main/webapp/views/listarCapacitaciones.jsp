<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Capacitaciones disponibles</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
    crossorigin="anonymous">

<link rel="stylesheet" href="https://cdn.datatables.net/1.11.3/css/dataTables.bootstrap5.min.css">
<style type="text/css">
    <%@include file="/css/style.css" %>
</style>

</head>
<body>
<%@include file="header.jsp"%>

<main class="container">
    <h1 class="text-center my-4">Capacitaciones disponibles</h1>

    <table id="capacitacionesTable" class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Detalle</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="capacitacion" items="${capacitaciones}">
                <tr>
                    <td>${capacitacion.id}</td>
                    <td>${capacitacion.nombre}</td>
                    <td>${capacitacion.detalle}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div class="text-center">
        <button type="button" class="btn btn-primary" onclick="redireccionar()">Agregar</button>
        <a href="Inicio" class="btn btn-danger">Volver al Inicio</a>
    </div>
</main>

<%@include file="footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
<script src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.3/js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function() {
        $('#capacitacionesTable').DataTable();
    });

    function redireccionar() {
        window.location.href = "CrearCapacitacion";
    }
</script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
    integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
    crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
    integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
    crossorigin="anonymous"></script>
</body>
</html>
