/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    $('#login').click(function () {
        $('#content').load("login.jsp");
    });

    $('#register').click(function () {
        $('#content').load("register.jsp");
    });

    $('.this').click(function () {

        $('.this').removeClass('active');
        $('.this').addClass('navbarColor');
        $(this).addClass('active');
        $(this).removeClass('navbarColor');

    });

});
