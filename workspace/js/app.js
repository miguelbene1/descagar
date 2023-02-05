function validar(){

    //clacular el objeto
    const inputedad = document.getElementById("edad");
    //alert("el dato es "+inputedad.value)

    //variable mensaje
   let edad = inputedad.value;
    //if and else 

    if (edad > 17){
        alertify.success('usted es mayor');
        
    }else {
        alertify.error('usted es menor');
    }  
}
    

function pareimpar(){
    const input = document.getElementById("edad");
    let tamanio = input.value
    let par = 0;
    let impar = 0;

    for (let index = 0; index < tamanio; index++) {
        if (index % 2==0){
            par = par + 1;
        }else {
            impar = impar + 1;
        }
    }
    console.log(par)
    console.success("los pares son "+par);
    alertify.warning("los impares son "+impar);
}
        


//guardar array
   function guardar(){
    var nombre =  document.getElementById("nombres").value;
    var apellido =  document.getElementById("apellidos").value;

    if (nombre==""){
        alert("es obligatorio");
        document.getElementById("nombres").focus();
    }else{
        if (apellido==""){
            alert("apellido es obligatorio");
            document.getElementById("apellidos").focus();

    }else{
        console.log(nombre +" "+apellido);
        document.getElementById("nombres").value="";
        document.getElementById("apellidos").value="";
        document.getElementById("nombres").focus();
    }
    }

    
}
function sumar() {
    var numero1 = document.getElementById('numero1').value;
    var numero2 = document.getElementById('numero2').value;

    if (numero1 !== '' && numero2 !== '') {
        var suma = parseInt(numero1) + parseInt(numero2);
        document.getElementById('resultado').value = suma;
    }

}function restar() {
    var numero1 = document.getElementById('numero1').value;
    var numero2 = document.getElementById('numero2').value;

    if (numero1 !== '' && numero2 !== '') {
        var restar = parseInt(numero1) - parseInt(numero2);
        document.getElementById('resultado').value = restar;
    }
}function multiplicar() {
    var numero1 = document.getElementById('numero1').value;
    var numero2 = document.getElementById('numero2').value;

    if (numero1 !== '' && numero2 !== '') {
        var multiplicar = parseInt(numero1) * parseInt(numero2);
        document.getElementById('resultado').value = multiplicar;
    }
}function dividir() {
    var numero1 = document.getElementById('numero1').value;
    var numero2 = document.getElementById('numero2').value;

    if (numero1 !== '' && numero2 !== '') {
        var dividir = parseInt(numero1) / parseInt(numero2);
        document.getElementById('resultado').value = dividir;
    }
}
    function limpiar(){
        document.getElementById("numero1").value="";
        document.getElementById("numero2").value="";
        document.getElementById("resultado").value="";
       

    }
   
 


