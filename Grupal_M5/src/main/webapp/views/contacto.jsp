<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Contacto</title>

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

	<main class="container contacto mx-auto my-5 d-flex flex-column flex-lg-row gap-5">
		
		<div class="info-form-container d-flex flex-column justify-content-center align-items-center">
			<h1 class="text-center my-4">Contactanos</h1>
			<p>Para todas las consultas, envíenos un correo utilizando el
				siguiente formulario.</p>
			<div class="contact-img-container w-75">
				<img alt=""
					class="w-100"
					src="https://hibertcoca.files.wordpress.com/2016/04/emailhibertcoca1.png?w=399&h=248">
			</div>
		</div>

		<div class="form-container">

			<form method="post" class="col-12">
				<div class="col-sm-12">
					<label for="nombreContact" class="form-label">Ingrese su
						nombre:</label> <input class="form-control" type="text"
						name="nombreContact" id="nombreContact" size="20"><br>
				</div>
				<div class="col-sm-12">
					<label for="emailContact" class="form-label">Ingrese su
						correo:</label> <input class="form-control" type="email"
						name="emailContact" id="emailContact" size="20"><br>
				</div>
				<div class="col-sm-12">
					<label for="message" class="form-label">Ingrese su mensaje:</label>
					<textarea class="form-control" name="message" aria-label="With textarea"></textarea>
				</div>
				<br> <a href="Inicio" class="btn btn-danger">Volver al
					Inicio</a>

				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>
			
		</div>

	</main>
	
	<%@ include file = "footer.jsp"%>

	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js" integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS" crossorigin="anonymous"></script>

</body>
</html>