/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    $(function () {
        $("#userHeader").load("userHeader.jsp");
        $("#adminHeader").load("adminHeader.jsp");
        $("#footer").load("footer.jsp");
        $("#indexFooter").load("indexFooter.jsp");

    });

    $("#registerButton").click(function () {
        var pass = document.getElementById("password").value;
        var repeatPass = document.getElementById("repeatPassword").value;
        if (!(pass === repeatPass)) {
            alert("Wrong password missmatch!\nPlease make sure you typed it right.");
        }
    });

    $("#delete").click(function () {
        confirm("Are you sure you want to delete this item?!");
    });

    $("#deleteUser").click(function () {
        confirm("Are you sure?!");
    });

});
