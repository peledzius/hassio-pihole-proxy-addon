
server {
    listen 80 default_server;

    include /etc/nginx/includes/server_params.conf;

	allow   172.30.32.2;
    deny    all;
    
    location / {
        proxy_pass http://backend/web/;
        include /etc/nginx/includes/proxy_params.conf;
    } 
}
