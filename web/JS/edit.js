/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("input#edit").click(function () {

        $('#content').load('edit.jsp');
        return false;

    });
    
    $("input").click(function () {

        $('button#saveInfo').prop('disabled', false);
        $('button#savePhoto').prop('disabled', false);
    });
    
    $("select").click(function () {

        $('button#category').prop('disabled', false);
        
    });
    
    $("button#category").click(function () {
        
        $('button#catogory').prop('disabled', true);
        
    });
    
    $("button#saveInfo").click(function () {
        
        $('#saveInfo').prop('disabled', true);
        //alert("Successfully Saved!");
        
    });
    
    $("button#savePhoto").click(function() {
        
        $('#savePhoto').prop('disabled', true);
        
    });
    
    $("input").click(function () {

        $('#update').prop('disabled', false);

    });
    
    $("button#update").click(function () {
        
        $('#update').prop('disabled', true);
        //alert("Successfully Updated!");
        
    });
});
