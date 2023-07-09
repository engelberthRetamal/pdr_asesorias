<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Creado</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

	
	<style type="text/css">
		<%@include file="/css/style.css" %>
	</style>
	
</head>
<body class="success-body vh-100 container d-flex justify-content-center align-items-center">

	<div class="success-container text-center border-bottom">
		<div class="overflow-hidden" style="max-height: 30vh;">
			<div class="container px-5">
				<img
					src="https://cdn-icons-png.flaticon.com/512/6711/6711626.png"
					class="img-fluid mb-4"
					alt="Example image" width="150" height="500" loading="lazy">
			</div>
		</div>
		<h1 class="display-4 fw-bold"><%= request.getAttribute("tipoCreacion").toString() %> correctamente</h1>
		
		<div class="col-lg-6 mx-auto">
			<div class="d-grid gap-2 d-sm-flex justify-content-sm-center mb-5">
				<a href="ListarCapacitaciones" class="btn btn-primary btn-lg px-4 me-sm-3">Ver listado de capacitaciones</a>
				<a href="CrearCapacitacion"
					class="btn btn-outline-secondary btn-lg px-4">Crear una nueva Capacitacion</a>
			</div>
		</div>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
		integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
		crossorigin="anonymous"></script>

</body>
</html>