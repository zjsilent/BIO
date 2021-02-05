package com.netty.bio.demo3;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 目标: Socket网络编程。

实现：消息的反复接收发送

 */
public class ClientDemo {

    public static void main(String[] args) throws IOException {

        System.out.println("客户端的启动");
        //创建一个socket通信管道，请求与服务端端口连接
        Socket socket = new Socket("127.0.0.1", 8888);
        //从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();
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
