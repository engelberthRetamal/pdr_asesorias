<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Login</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">


<style type="text/css">
<%@include file="/css/style.css"%>
</style>

</head>
<body class="vh-100">

	<main class="login-main d-flex justify-center align-items-center py-5 ">
			<div class="container-fluid h-custom">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-md-7 col-lg-6 col-xl-5">
						<img
							src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
							class="img-fluid" alt="Sample image">
					</div>
					<div class="col-md-7 col-lg-6 col-xl-4 offset-xl-1">
					
						<form action="Login" method="post" class="login-form"> 

							<div class="form-outline mb-4">
								<input type="text" id="user" name="user"
									class="form-control form-control-lg" placeholder="Email" /> <label
									class="form-label" for="user" >Ingresa Usuario</label>
							</div>

							<div class="form-outline mb-3">
								<input type="password" id="password" name="password"
									class="form-control form-control-lg" placeholder="Contraseña" />
								<label class="form-label" for="password">Ingresa tu
									contraseña</label>
							</div>

							<div class="d-flex flex-column flex-md-row justify-content-between align-items-center">

								<div class="form-check mb-0">
									<input class="form-check-input me-2" type="checkbox" value=""
										id="form2Example3" /> <label class="form-check-label"
										for="form2Example3"> Recuerdame </label>
								</div>
								<a href="#!" class="text-body">Olvidaste tu contraseña?</a>
							</div>

							<div class="text-center text-lg-start mt-4 pt-2">
								<button type="submit" class="btn btn-primary btn-lg"
									>Login</button>
								<a href="Inicio" class="btn btn-lg btn-danger">Volver a Inicio</a>
									
								            
				<p class="small fw-bold mt-2 pt-1 mb-0">Aún no tienes una cuenta? 
				<a href="#!" class="link-danger">Registrate</a></p>
			
							</div>

						</form>
					</div>
				</div>
			</div>

	</main>

	<%@include file="footer.jsp" %>

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