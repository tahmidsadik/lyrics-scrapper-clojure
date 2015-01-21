(function () {
    var form = document.getElementById('form');
    form.onkeyup = function(event) {
        if(event.keyCode == 13) {
            var link = document.getElementById("url").value;
            var xhr = new XMLHttpRequest();
            var scrape_url = 'scrape/';
            var url = scrape_url + '?link=' + link;
            xhr.onreadystatechange = function() {
                if (xhr.readyState == 4) {
                    var p = document.getElementById('lyric');
                    //var lyric = document.createElement("p");
                    //lyric.appendChild(document.createTextNode(xhr.responseText));
                    //var body = document.getElementsByTagName('body');
                    //body.appendChild(lyric);
                    p.innerHTML = xhr.responseText;
                }
            };
            xhr.open('GET', url, true);
            xhr.send()
        }
    }
})();