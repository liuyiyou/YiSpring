$(document).ready(function(){

    $("#submitButton").click(function(){
        $("#myForm").ajaxSubmit({
            url: "jsonString",
            type:"post",
            success:function(data){
                $("#result").html(data);
            }
        });
    });
});