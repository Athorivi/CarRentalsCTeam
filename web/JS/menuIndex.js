/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("ul#nav li a").click(function () {
        var page = $(this).attr('id');
        $('#nav li a').removeClass('active');
        $(this).addClass('active');
        
        $('#content').load(page + '.jsp');
        
        return false;
    });
    
    $("#edit").click(function (){
        
        window.location.href = 'editPost.jsp';
    });
    
    $("#view").click(function (){
        
        window.location.href = 'viewRent.jsp';
    });
    
    $("#back").click(function (){
        
        $('#content').load('userIndex.jsp');
    });
    
});
