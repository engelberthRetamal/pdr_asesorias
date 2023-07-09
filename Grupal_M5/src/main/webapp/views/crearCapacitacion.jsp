<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
	
	<style type="text/css">
		<%@include file="/css/style.css" %>
	</style>
	
</head>
<body>

	<%@ include file = "header.jsp"%>

<main class="container mx-auto my-5 d-flex flex-column flex-lg-row gap-5">

		<div
			class="info-form-container d-flex flex-column justify-content-center align-items-center">
			<h1 class="text-center my-4">Crear capacitacion</h1>
			<p>Formulario para crear una nueva capacitación.</p>
			<div class="contact-img-container w-75">
				<img alt="" class="w-100"
					src="https://www.buk.cl/hubfs/CL%20-%20Pillar%208%20-%20Capacitaci%C3%B3n/Manos%20a%20la%20obra%20capacitaci%C3%B3n%20a%20tu%20medida.png">
			</div>
		</div>

		<div class="form-container">

			<form method="post" class="col-12"
				action="CrearCapacitacion">
				<div class="col-sm-12">
					<label for="usuario" class="form-label">Nombre Capacitación</label>
					<input class="form-control" type="text" name="nombre" id="usuario"
						size="20" required><br>
				</div>
				<div class="col-sm-12">
					<label for="dato1" class="form-label">Detalle de
						Capacitación</label> <input class="form-control" type="text"
						name="detalle" id="detalle" size="20" required><br>
				</div>
				<a href="Inicio" class="btn btn-danger">Volver al Inicio</a>
				<button type="submit" class="btn btn-primary">Crear</button>
			</form>

		</div>

	</main>

	<%@ include file = "footer.jsp"%>

	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>
</body>
</html>