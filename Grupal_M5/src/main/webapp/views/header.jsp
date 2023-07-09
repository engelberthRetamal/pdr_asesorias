<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
	
<header>
	<nav class="navbar navbar-expand-lg navbar-dark bg-body-tertiary justify-content-around">
		<div>
			<img alt="Logo"
				src="https://asesoriasevita.cl/wp-content/uploads/2021/10/LOGO-COLOR-PNG-e1662151098951.png"
				width="120">
		</div>
		<div>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse " id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link"
						aria-current="page" href="Inicio">Inicio</a></li>
						
					<c:if test="${not empty sessionScope.user }">
						<li class="nav-item"><a class="nav-link" href="Contacto">Contacto</a></li>

						<li class="nav-item dropdown">
          					<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            					Crear
          					</a>
          					<ul class="dropdown-menu">
								<li class="nav-item"><a class="nav-link" href="CrearUsuario">Crear Usuario</a></li>
								<li class="nav-item"><a class="nav-link" href="CrearCapacitacion">Crear capacitacion</a></li>
          					</ul>
        				</li>
        				<li class="nav-item dropdown">
          					<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            					Listar
          					</a>
          					<ul class="dropdown-menu">
								<li class="nav-item"><a class="nav-link" href="ListarCapacitaciones">Capacitaciones</a></li>
								<li class="nav-item"><a class="nav-link" href="ListarUsuario">Usuarios</a></li>
          					</ul>
        				</li>
					</c:if>
					
					<c:if test="${empty sessionScope.user }">
							<li class="nav-item mx-lg-3"><a class="nav-link" href="Login">Login</a></li>
					</c:if>
					<c:if test="${not empty sessionScope.user }">
							<li class="nav-item mx-lg-3"><a class="nav-link" href="Logout">Logout</a></li>
					</c:if>
					
				</ul>
			</div>
		</div>
	</nav>
</header>