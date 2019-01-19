/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("ul#nav li a").click(function () {
        var page = $(this).attr('href');
        $('#content').load(page + '.jsp');
        return false;
    });
});
