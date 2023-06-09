let btnEncriptar = document.querySelector(".btn-encriptar");
let btnDesencriptar = document.querySelector(".btn-desencriptar");
let containerResultado = document.querySelector(".containerResultsImage");
let containerParagraph = document.querySelector(".containerParagraph");
let result = document.querySelector(".containerTextResult");

btnEncriptar.onclick = encriptar;
btnDesencriptar.onclick = desencriptar;

function recuperarTexto() {
    let boxText = document.getElementById("boxText").value;
    console.log("Texto recuperado: " + boxText);
    return boxText;
}

function encriptar() {
    ocultarAdelante();
    let boxText = recuperarTexto()
    result.textContent = encriptarTexto(boxText);
}

function desencriptar() {
    ocultarAdelante();
    let boxText = recuperarTexto()
    result.textContent = desencriptarTexto(boxText);
}

function ocultarAdelante() {
    containerResultado.classList.add("ocultar");
    containerParagraph.classList.add("ocultar");
}

function encriptarTexto(mensaje) {
    let texto = mensaje;
    let textoFinal = "";
    let textSize = 0;
    textSize = texto.length !== undefined ? texto.length : 0;
    if (textSize > 0) {
        for (var i = 0; i < textSize; i++) {
            if (texto[i] == "a") {
                textoFinal = textoFinal + "ai"
            }
            else if (texto[i] == "e") {
                textoFinal = textoFinal + "enter"
            }
            else if (texto[i] == "i") {
                textoFinal = textoFinal + "imes"
            }
            else if (texto[i] == "o") {
                textoFinal = textoFinal + "ober"
            }
            else if (texto[i] == "u") {
                textoFinal = textoFinal + "ufat"
            }
            else {
                textoFinal = textoFinal + texto[i]
            }
        }
    }
    return textoFinal;

}

function desencriptarTexto(mensaje) {
    let texto = mensaje.trim();
    let textoFinal = "";
    let textSize = 0;
    textSize = texto.length !== undefined ? texto.length : 0;
    if (textSize > 0) {
        for (var i = 0; i < textSize; i++) {
            if (texto[i] == "a") {
                textoFinal = textoFinal + "a"
                i = i + 1;
            }
            else if (texto[i] == "e") {
                textoFinal = textoFinal + "e"
                i = i + 4;
            }
            else if (texto[i] == "i") {
                textoFinal = textoFinal + "i"
                i = i + 3;
            }
            else if (texto[i] == "o") {
                textoFinal = textoFinal + "o"
                i = i + 3;
            }

            else if (texto[i] == "u") {
                textoFinal = textoFinal + "u"
                i = i + 3;
            }
            else {
                textoFinal = textoFinal + texto[i];
            }
        }
    }
    return textoFinal;

}

const btnCopy = document.querySelector(".btn-copy");
btnCopy.addEventListener("click", copiar = () => {
    let contenido = document.querySelector(".containerTextResult").textContent;
    navigator.clipboard.writeText(contenido);
    console.log("test probando copy"); 
});