package com.okcoin.commons.okcoin.open.api.test.ws.spot.config;

/**
 * config
 *
 * @author oker
 * @create 2019-06-12 15:06
 **/
public class WebSocketConfig {

    // okcoin webSocket url
    private static final String SERVICE_URL = "wss://real.okcoin.com:10442/ws/v3";
    // api key
    private static final String API_KEY = "";
    // secret key
    private static final String SECRET_KEY = "";
    // passphrase

    private static final String PASSPHRASE = "";

    public static void publicConnect(WebSocketClient webSocketClient) {
        webSocketClient.connection(SERVICE_URL);
    }

    public static void loginConnect(WebSocketClient webSocketClient) {
        //与服务器建立连接
        webSocketClient.connection(SERVICE_URL);
        //登录账号,用户需提供 api-key，passphrase,secret—key 不要随意透漏 ^_^
        webSocketClient.login(API_KEY , PASSPHRASE , SECRET_KEY);
    }
}
