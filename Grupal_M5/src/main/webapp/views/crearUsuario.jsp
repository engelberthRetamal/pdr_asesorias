<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Crear Capacitación</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
    <style type="text/css">
        <%@include file="/css/style.css" %>
    </style>
    <script type="text/js" src="js/validaciones.js">
        <%@include file="/js/validaciones.js" %>
    </script>
    <script type="text/javascript">
        <%@include file="/js/mostrarOpciones.js" %>
    </script>
</head>
<body>
    <%@ include file="header.jsp" %>
    <main class="container mx-auto my-5 d-flex flex-column flex-lg-row gap-5">
    
        <div
			class="info-form-container d-flex flex-column justify-content-center align-items-center">

			<h1 class="text-center my-4">Crear Usuario</h1>
			<p>Formulario para crear un nuevo usuario, con todas sus
				caracteristicas.</p>
			<div class="contact-img-container w-50">
				<img alt="crear_usuario_img" class="w-100"
					src="https://cdn-icons-png.flaticon.com/512/306/306232.png">
			</div>
		</div>

		<div class="form-container">

			<form method="post" class="col-12" action="CrearUsuario">
				<div class="col-sm-12">
					<label for="usuario" class="form-label">Nombre del Usuario</label>
					<input class="form-control" type="text" name="nombre" id="usuario"
						size="20" required><br>
				</div>
				
				<div class="col-sm-12">
					<label for="tipo" class="form-label">Tipo de Usuario</label> <select
						class="form-select" name="tipo" id="tipo"
						onchange="mostrarOpciones()" required>
						<option value="--">--</option>
						<option value="Cliente">Cliente</option>
						<option value="Administrativo">Administrativo</option>
						<option value="Profesional">Profesional</option>
					</select><br>
					<div class="col-sm-12" id="direccionDiv" style="display: none;">
						<label for="direccion" class="form-label">Dirección</label> <input
							class="form-control" type="text" name="direccion" id="direccion">
					</div>

					<div class="col-sm-12" id="telefonoDiv" style="display: none;">
						<label for="telefono" class="form-label">Teléfono</label> <input
							class="form-control" type="text" name="telefono" id="telefono"
							pattern="[0-9]+" title="Ingrese solo números">
					</div>

					<div class="col-sm-12" id="empleadosDiv" style="display: none;">
						<label for="empleados" class="form-label">Cantidad de
							empleados</label> <input class="form-control" type="number"
							name="empleados" id="empleados" pattern="[0-9]+"
							title="Ingrese solo números">

					</div>

					<div class="col-sm-12" id="experienciaDiv" style="display: none;">
						<label for="experiencia" class="form-label">Años de
							experiencia</label> <input class="form-control" type="number"
							name="experiencia" id="experiencia" pattern="[0-9]+"
							title="Ingrese solo números">
					</div>

					<div class="col-sm-12" id="departamentoDiv" style="display: none;">
						<label for="departamento" class="form-label">Departamento</label>
						<input class="form-control" type="text" name="departamento"
							id="departamento">
					</div>

					<div class="col-sm-12" id="cargoDiv" style="display: none;">
						<label for="cargo" class="form-label">Cargo</label> <input
							class="form-control" type="text" name="cargo" id="cargo">
					</div>

					<div class="col-sm-12" id="superiorDiv" style="display: none;">
						<label for="superior" class="form-label">Nombre del
							superior del administrativo</label> <input class="form-control"
							type="text" name="superior" id="superior">
					</div>
					<div class="row mt-3">
						<div class="col-sm-12">
							<a href="Inicio" class="btn btn-danger">Volver al Inicio</a>
							<button type="submit" class="btn btn-primary">Crear</button>
						</div>
					</div>
					</div>
			</form>

		</div>

	</main>
    <%@ include file="footer.jsp" %>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
            integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
            integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
            crossorigin="anonymous"></script>
</body>
</html>
