/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    $(function () {
        $("#header").load("header.jsp");
        $("#footer").load("footer.jsp");
    });
    
//    $("ul#nav li a").click(function () {
//        var page = $(this).attr('id');
//        $('#nav li a').removeClass('active');
//        $(this).addClass('active');
//       // document.getElementById('bottom').innerHTML = loadPage(page + '.jsp');
//       window.location.replace = (page + '.jsp');
//
//        return false;
//    });

//    $("#myPosts").click(function(){
//        window.location.href = 'myPosts.jsp';
//    });
//    
//    $("#edit").click(function () {
//
//        window.location.href = 'editPost.jsp';
//    });
//
//    $("#view").click(function () {
//
//        window.location.href = 'viewRent.jsp';
//    });
//
//    $("#back").click(function () {
//
//        window.location.href = ('userIndex.jsp');
//    });
//
//    $("#search").click(function () {
//
//        $('#content').load('results.jsp');
//    });

});
