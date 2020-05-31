# spring-boot-micrometer-prometheus-grafana

## Setup
- In docker/prometheus.yml file change targets ip address
- docker-compose up --abort-on-container-exit
      
- Go to http://localhost:9090
    - example query
        - http_server_requests_seconds_max
        - http_server_requests_seconds_max{uri="/"}
        - http_server_requests_seconds_max{uri="/1"}
        - http_server_requests_seconds_count

- Generate some request metrics
    - open chrome with disabled security and run this in web console
    ```
    Windows chrome browser:
    "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" --disable-web-security --user-data-dir="C:\tmpChromeSession"
    
    Ubuntu chromium browser:
    chromium --disable-web-security --user-data-dir="/vagrant/home/chrome-data"
    ```
    ```
    setInterval(()=> {
    
        var url = ['http://localhost:8080', 'http://localhost:8080/1', 'http://localhost:8080/2', 'http://localhost:8080/people'];
        var theUrl = url[Math.floor((Math.random()*url.length))]
        
        var xmlHttp = new XMLHttpRequest();
        xmlHttp.open( "GET", theUrl, true ); // false for synchronous request
        xmlHttp.send( null );
        console.log(xmlHttp.responseText);

    }, 3000);
    ```
    - or manual
    - http://localhost:8080
    - http://localhost:8080/1
    - http://localhost:8080/2