// validaciones.js

function validarFormulario() {
  var usuario = document.getElementById("usuario").value;
  var dato1 = document.getElementById("detalle").value;
  // Obtén los valores de los demás campos de entrada

  if (usuario === "" || detalle === "") {
    alert("Por favor, complete todos los campos.");
    return false;
  }

  // Agrega más validaciones según tus necesidades

  return true;
}
