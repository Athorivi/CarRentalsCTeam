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

        $('#saveInfo').prop('disabled', false);

    });
    
    $("button#saveInfo").click(function () {
        
        $('#saveInfo').prop('disabled', true);
        alert("Successfully Saved!");
        
    });
});
