var btnacenda = document.querySelector("#acenda");
var btnfogueira = document.querySelector("#fogueira");
var body = document.querySelector("body");

btnacenda.addEventListener("click", function(){
    body.className = "sign-in-js";
});

btnfogueira.addEventListener("click", function (){
    body.className = "sign-up-js";
});