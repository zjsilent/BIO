package com.netty.bio.demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 目标: Socket网络编程。
功能1： 客户端可以反复发，一个服务可以接收无数个客户端消息！！
 小结：服务器如果想要接收多个客户端，那么必须引入线程，一个客户端一个线程处理！！

 */
public class ClientDemo {

    public static void main(String[] args) throws IOException {

        System.out.println("客户端的启动");
        //创建一个socket通信管道，请求与服务端端口连接
        Socket socket = new Socket("127.0.0.1", 8888);
        //从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();
        InputStream in=socket.getInputStream();


        //把字节流改装成自己需要的流进行数据发送
        PrintStream ps = new PrintStream(os);

        Scanner scanner=new Scanner(System.in);
        while (true){

            System.out.print("请说:");
            String str=scanner.nextLine();
            ps.println(str);
            ps.flush();
        }

    }
}
