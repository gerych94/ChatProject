package week4.ChatProject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Виталий on 11.02.2015.
 */
public class My_ServerSocket {

    public void start(){
        int count =0;
        try {
            ServerSocket serverSocket=new ServerSocket(10090);

            Socket client=serverSocket.accept();

            DataInputStream inputStream=new DataInputStream(client.getInputStream());
            DataOutputStream outputStream=new DataOutputStream(client.getOutputStream());
            String str;

            while (true){
                System.out.printf("%d cent = %s\n", count, client.getInetAddress().toString());
                str=inputStream.readUTF();
                System.out.println(str);
                outputStream.writeUTF("hello from server");
                outputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
