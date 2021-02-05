package com.netty.bio.demo2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @PackageName: com.netty.bio.demo1
 * @author: youjp
 * @create: 2020-12-18 10:59
 * @description: 服务端案例:引入线程池
 * @Version: 1.0
 */
public class ServerDemo {

    public static void main(String[] args) throws IOException {

        System.out.println("==服务器的启动==");
        ExecutorService service=Executors.newCachedThreadPool();
        // 注册端口
        ServerSocket serverSocket = new ServerSocket(8888);
        //开始在这里暂停等待接收客户端的连接,得到一个端到端的Socket管道
        while (true){
            System.out.println("线程信息名称:"+Thread.currentThread().getName());
            final  Socket socket=serverSocket.accept();
           // service.submit(new ServerReadThread(socket));

        }


    }


}
