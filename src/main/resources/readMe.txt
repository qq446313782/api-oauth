获取token：
http://localhost:8888/oauth/token?username=user_1&password=123456&grant_type=password&scope=select&client_id=pwd_client&client_secret=123456

访问Rest接口:
rest_url?access_token=7040065a-fd0e-4317-92b8-045ba64e2f09

访问Webservice：
webservice_url
    header
        Authorization : Bearer 7040065a-fd0e-4317-92b8-045ba64e2f09