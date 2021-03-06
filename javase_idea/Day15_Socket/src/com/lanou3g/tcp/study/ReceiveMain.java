package com.lanou3g.tcp.study;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveMain {
    public static void main(String[] args) throws IOException {

        //创建一个接收方ServerSocket对象
        //构造方法传入的参数为:9999
        ServerSocket ss = new ServerSocket(9999);

        //从接收方,得到谁发过来的
        //因为接收方和发送方会建立连接
        //这里就是通过接收方,获得发送方
        //accept方法是一个阻塞时方法
        //如果获得不到发送方的scoket.那么就会将程序阻塞在这里,不在向下执行
        Socket socket = ss.accept();

        //获得发送方的读取对象
        InputStream is = socket.getInputStream();

        byte[] buf = new byte[1024];

        //调用is读取方法
        //将socket中的内容
        //读到buf这个字节数组中
//        int len = is.read(buf);   //返回值为读取了多少数据

        int len = 0;
//        String c = "";
        StringBuffer sb = new StringBuffer();   //缓存字符串

        while ((len = is.read(buf)) != -1){     //""返回一个-1
            //根据字节数组,创建一个字符串
            //取数组中,从0开始,取多少个,取len个
            String content = new String(buf,0,len);

            //输出
//            System.out.print(content);
//            c+= content;

            //向动态字符串数组中添加
            sb.append(content);
        }

        System.out.println(sb);

        ss.close();
    }
}
