<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

	
	<style type="text/css">
		<%@include file="/css/style.css" %>
	</style>
	
<title>Inicio</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<main class="container p-0 pb-5">

		<section class="bg-light text-center border-bottom hero">
			<div class="col-lg-6 hero-content d-flex flex-column justify-content-center">
				<h1 class="display-4 fw-bold text-white">Asesorias en prevencion de riesgo.</h1>
			
				<p class="lead mb-4 text-white">sistema de información para administrar los principales procesos que se llevan a cabo en la Empresa.</p>

			</div>
		</section>

		<section class="container-fluid my-4 py-3">

			<div class="row row-cols-1 row-cols-md-2 row-cols-xl-3 g-4">
				<div class="col">
					<div class="card h-100">
						<div class="card-img">
							<img
								src="https://img.freepik.com/vector-premium/refiera-concepto-amigo-manos-dibujos-animados-sosteniendo-telefono-lista-contactos-amigos-banner-estrategia-marketing-referencia-plantilla-pagina-destino-interfaz-usuario-web-aplicacion-movil-poster-pancarta-folleto_186332-211.jpg"
								class="card-img-top" alt="Hollywood Sign on The Hill" />
						</div>

						<div class="card-body">
							<h5 class="card-title">Enviar un mensaje mediante la pagina
								contacto</h5>
							<p class="card-text">Permite enviar un mensaje a travez de un
								formulario.</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card h-100">
						<div class="card-img">
							<img
								src="https://canopylab.com/wp-content/uploads/2021/04/3784896-scaled.jpg"
								class="card-img-top" alt="Palm Springs Road" />
						</div>
						<div class="card-body">
							<h5 class="card-title">Crear una capacitacion, listar
								capacitaciones</h5>
							<p class="card-text">Se puede crear nuevas capacitaciones,
								asi como tambien ver una lista de capacitaciones ya existentes.</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card h-100">
						<div class="card-img">
							<img
								src="https://blog.ida.cl/wp-content/uploads/sites/5/2020/05/ida-arquetiposdeusuario-blog-655x470.png"
								class="card-img-top" alt="Los Angeles Skyscrapers" />
						</div>
						<div class="card-body">
							<h5 class="card-title">Crear usuarios, listar usuarios</h5>
							<p class="card-text">Se podrán crear nuesvos usuarios y poder
								ver una lista de los usuarios ya existentes.</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card h-100">
						<div class="card-img">
							<img
								src="https://paginaswebenguadalajara.com.mx/wp-content/uploads/2021/05/5-ideas-para-mejorar-el-customer-experience-de-tu-marca.jpg"
								class="card-img-top" alt="Skyscrapers" />
						</div>
						<div class="card-body">
							<h5 class="card-title">Editar cliente</h5>
							<p class="card-text">Se permite editar clientes.</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card h-100">
						<div class="card-img">
							<img
								src="https://ceas.cl/wp-content/uploads/2020/11/ACTUALIZA-01.png"
								class="card-img-top" alt="Hollywood Sign on The Hill" />
						</div>
						<div class="card-body">
							<h5 class="card-title">Editar Usuario, Administrativo,
								profesional, etc.</h5>
							<p class="card-text">Se permite Editar usuarios de cada tipo.</p>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="card h-100">
						<div class="card-img">
							<img
								src="https://lobbyfix.com/wp-content/uploads/2021/04/control-de-recepcion.jpg"
								class="card-img-top" alt="Hollywood Sign on The Hill" />
						</div>
						<div class="card-body">
							<h5 class="card-title">Listar visitas</h5>
							<p class="card-text">Se permite listar visitas.</p>
						</div>
					</div>
				</div>
			</div>

		</section>

	</main>

	<%@ include file="footer.jsp"%>


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