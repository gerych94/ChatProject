package week4.ChatProject;

import java.io.InputStream;
import java.net.Socket;

/**
 * Created by Виталий on 11.02.2015.
 */
public class ReadThread implements Runnable {


   private ClientSocket clientSocket;
    private InputStream inputStream;

    public ReadThread(ClientSocket clientSocket, InputStream inputStream) {
        this.clientSocket = clientSocket;
        this.inputStream = inputStream;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
       clientSocket.read(inputStream);
    }
}
