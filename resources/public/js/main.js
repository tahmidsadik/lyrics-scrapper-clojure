(function () {
    var form = document.getElementById("form");
    form.onkeyup = function(event) {
        if(event.keyCode == 13) {
            alert("Enter pressed");
            var xhr = new XMLHttpRequest();

        }
    }
})();