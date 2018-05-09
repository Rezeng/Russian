package com.zengrui.socketServer;

import java.net.Socket;

/**
 * Created by Zeng Rui on 2018/5/4.
 */
public class Connection {
    private Socket socket;

    public void send(String msg){}

    public Socket getSocket(){
        socket = new Socket();
        return socket;
    }





}
