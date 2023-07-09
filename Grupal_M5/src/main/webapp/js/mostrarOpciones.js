function mostrarOpciones() {
    var tipoUsuario = document.getElementById("tipo").value;

    // Mostrar u ocultar campos adicionales según el tipo de usuario
    var direccionDiv = document.getElementById("direccionDiv");
    var telefonoDiv = document.getElementById("telefonoDiv");
    var empleadosDiv = document.getElementById("empleadosDiv");
    var experienciaDiv = document.getElementById("experienciaDiv");
    var departamentoDiv = document.getElementById("departamentoDiv");
    var cargoDiv = document.getElementById("cargoDiv");
    var superiorDiv = document.getElementById("superiorDiv");

    direccionDiv.style.display = tipoUsuario === "Cliente" ? "block" : "none";
    telefonoDiv.style.display = tipoUsuario === "Cliente" ? "block" : "none";
    empleadosDiv.style.display = tipoUsuario === "Cliente" ? "block" : "none";

    experienciaDiv.style.display = tipoUsuario === "Profesional" ? "block" : "none";
    departamentoDiv.style.display = tipoUsuario === "Profesional" ? "block" : "none";

    cargoDiv.style.display = tipoUsuario === "Administrativo" ? "block" : "none";
    superiorDiv.style.display = tipoUsuario === "Administrativo" ? "block" : "none";
}
