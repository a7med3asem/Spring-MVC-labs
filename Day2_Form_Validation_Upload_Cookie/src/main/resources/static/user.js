$(document).ready(function(){
    $.ajax({
        url: "http://localhost:7575/mvcDay2/user"
    }).then(function(data){
            $('.userName').append(data.userName);
            $('.age').append(data.age);
    });
});
