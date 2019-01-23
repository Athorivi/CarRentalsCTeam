/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//set min value for today
var today = new Date();
var dd = today.getDate();
var xx = today.getDate();
var mm = today.getMonth() + 1;
var yyyy = today.getFullYear();
if (dd < 10) {
    dd = '0' + dd;
}
if (mm < 10) {
    mm = '0' + mm;
}

today = yyyy + '-' + mm + '-' + dd;
second = yyyy + '-' + mm + '-' + (dd + 1);

document.getElementById("from").setAttribute("min", today);
document.getElementById("to").setAttribute("min", second);

document.getElementById("from").setAttribute("value", today);
document.getElementById("to").setAttribute("value", second);

// set min value of check-out date according to check-in date
document.getElementById("from").onchange = function () {

    var input = document.getElementById("to");
    input.min = this.value;

};
