$(document).ready(function(){
    $("#btn").click(function(){
        $.post("/test/send?msg="+$("#text").val(),{},function (data) {
            $("#send").html(data.msg)
        },"json");
    });
});