package week4.ChatProject;

import java.io.*;
import java.net.Socket;

/**
 * Created by Виталий on 11.02.2015.
 */
public class ClientSocket {

    private String ip;
    private int port;
    Socket socket;

    public ClientSocket(String s,int p){
        this.ip=s;
        this.port=p;
        try {
            socket=new Socket(ip,port);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  void send(OutputStream outputStream){
        try {
            DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
            BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
            String s="";

            while (true){
                System.out.println("My message");
                s=console.readLine();
                dataOutputStream.writeUTF(s);
                dataOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(InputStream inputStream){
        try {
            socket=new Socket(ip,port);
            DataInputStream dataInputStream=new DataInputStream(inputStream);
            System.out.println("Server message");
            System.out.println(dataInputStream.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
