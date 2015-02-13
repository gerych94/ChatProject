package week4.ChatProject;


import java.io.IOException;

/**
 * Created by Виталий on 11.02.2015.
 */
public class TestClient {

    public static void main(String[] args) throws InterruptedException, IOException {
        ClientSocket clientSocket=new ClientSocket("192.168.0.103",10090);

        Thread thread1=new Thread(new ReadThread(clientSocket, clientSocket.socket.getInputStream()));
        Thread thread2=new Thread(new SendThread(clientSocket, clientSocket.socket.getOutputStream()));

        thread1.start();
        thread2.start();

       // thread1.join();
       // thread2.join();

    }

}
