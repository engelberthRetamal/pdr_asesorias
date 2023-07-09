<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="modulo5.Modelo.Cliente" %>
<%@ page import="modulo5.Modelo.Profesional" %>
<%@ page import="modulo5.Modelo.Administrativo" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Editar Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
              rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
              crossorigin="anonymous">
    <style type="text/css">
        <%@include file="/css/style.css" %>
    </style>
    <script type="text/javascript">
        <%@include file="/js/mostrarOpciones.js" %>
    </script>
</head>
<body>
    <%@ include file="header.jsp" %>
    <main class="container mx-auto my-5">
        <h1 class="text-center my-4">Editar Usuario</h1>
        <form id="editForm" action="EditarUsuario" method="post" class="col-md-6 mx-auto">
            <div class="col-sm-12">
                <label for="id" class="form-label">ID:</label>
                <input type="text" name="id" value="<%= request.getAttribute("idUsuario") %>" class="form-control" readonly>
            </div>
            <div class="col-sm-12">
                <label for="nombre" class="form-label">Nombre:</label>
                <input type="text" name="nombre" value="<%= request.getAttribute("nombreUsuario") %>" class="form-control">
            </div>
            <div class="col-sm-12">
                <label for="tipo" class="form-label">Tipo:</label>
                <input type="text" name="tipo" value="<%= request.getAttribute("tipoUsuario") %>" class="form-control" readonly>
            </div>
             <% if (request.getAttribute("tipoUsuario").equals("Cliente")) { %>
                        <div id="direccionDiv">
                            <div class="col-sm-12">
                                <label for="direccion" class="form-label">Dirección:</label>
                                <input type="text" name="direccion" value="<%= request.getAttribute("direccion") %>" class="form-control">
                            </div>
                        </div>
                        <div id="telefonoDiv">
                            <div class="col-sm-12">
                                <label for="telefono" class="form-label">Teléfono:</label>
            <input type="text" name="telefono" value="<%= ((Cliente) request.getAttribute("usuario")).getTelefono() %>" class="form-control" pattern="[0-9]+" title="Ingrese un número de teléfono válido">                </div>
                        </div>
                        <div id="empleadosDiv">
                            <div class="col-sm-12">
                                <label for="empleados" class="form-label">Cantidad de empleados:</label>
                                <input type="number" name="empleados" value="<%= ((Cliente) request.getAttribute("usuario")).getCantidadEmpleados() %>" class="form-control" min="0" pattern="[0-9]+" title="Ingrese un número válido">
                            </div>
                        </div>
                        <% } else if (request.getAttribute("tipoUsuario").equals("Profesional")) { %>
                        <div id="experienciaDiv">
                            <div class="col-sm-12">
                                <label for="experiencia" class="form-label">Años de experiencia:</label>
                                <input type="number" name="experiencia" value="<%= ((Profesional) request.getAttribute("usuario")).getAniosExperiencia() %>" class="form-control" min="0" pattern="[0-9]+" title="Ingrese un número válido">
                            </div>
                        </div>
                        <div id="departamentoDiv">
                            <div class="col-sm-12">
                                <label for="departamento" class="form-label">Departamento:</label>
                                <input type="text" name="departamento" value="<%= ((Profesional) request.getAttribute("usuario")).getDepartamento() %>" class="form-control">
                            </div>
                        </div>
            <% } else if (request.getAttribute("tipoUsuario").equals("Administrativo")) { %>
            <div id="cargoDiv">
                <div class="col-sm-12">
                    <label for="cargo" class="form-label">Cargo:</label>
                    <input type="text" name="cargo" value="<%= ((Administrativo) request.getAttribute("usuario")).getCargo() %>" class="form-control">
                </div>
            </div>
            <div id="superiorDiv">
                <div class="col-sm-12">
                    <label for="superior" class="form-label">Nombre del superior del administrativo:</label>
                    <input type="text" name="superior" value="<%= ((Administrativo) request.getAttribute("usuario")).getNombreSupervisor() %>" class="form-control">
                </div>
            </div>
            <% } %>
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
    </main>
    <%@ include file="footer.jsp" %>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.min.js"></script>
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
