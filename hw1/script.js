
function sayHello(){
    console.log('Hello WORLD');
    document.getElementById('joke').innerHTML = 'I DONT KNOW, BETTER ASK GOOGLE :)';
}

let searchBTN = document.querySelector('#searchButton');
searchBTN.onclick=sayHello;

//-----------------------------------------------------------

function sum(){
    let firstVal = document.getElementById('firstVal').value;
    firstVal = parseInt(firstVal);
    let secondVal = document.getElementById('secondVal').value;
    secondVal = parseInt(secondVal);
    let result = firstVal + secondVal
    console.log(result);
    document.getElementById('resultVal').innerHTML = result;
}

function minus(){
    let firstVal = document.getElementById('firstVal').value;
    firstVal = parseInt(firstVal);
    let secondVal = document.getElementById('secondVal').value;
    secondVal = parseInt(secondVal);
    let result = firstVal - secondVal
    console.log(result);
    document.getElementById('resultVal').innerHTML = result;
}

function multiply(){
    let firstVal = document.getElementById('firstVal').value;
    firstVal = parseInt(firstVal);
    let secondVal = document.getElementById('secondVal').value;
    secondVal = parseInt(secondVal);
    let result = firstVal * secondVal
    console.log(result);
    document.getElementById('resultVal').innerHTML = result;
}

function division(){
    let firstVal = document.getElementById('firstVal').value;
    firstVal = parseInt(firstVal);
    let secondVal = document.getElementById('secondVal').value;
    secondVal = parseInt(secondVal);
    let result;
    if(secondVal != 0){
        result = firstVal / secondVal
        console.log(result);
        document.getElementById('resultVal').innerHTML = result;
    }else{
        console.log('Couldn`t divisio on zero!!!');
        document.getElementById('resultVal').innerHTML = 'Couldn`t division by zero!!!';
    }
}

//-----------------------------------------------------------


