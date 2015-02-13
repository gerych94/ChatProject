package week4.ChatProject;

import java.io.OutputStream;

/**
 * Created by Виталий on 11.02.2015.
 */
public class SendThread implements Runnable {


    private ClientSocket clientSocket;
    private OutputStream outputStream;

    public SendThread(ClientSocket clientSocket, OutputStream outputStream) {
        this.clientSocket = clientSocket;
        this.outputStream = outputStream;
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
     clientSocket.send(outputStream);
    }

}
