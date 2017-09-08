package homework01;

import java.io.*;
import java.net.*;

/**
 * cite:
 * https://stackoverflow.com/questions/2165006/simple-java-client-server-program
 *
 * @author Kelsie
 */
public class tomerlin {

    public static void main(String[] args) throws UnknownHostException,
            IOException {

        ServerSocket test = new ServerSocket(0);
        int port = test.getLocalPort();
        Socket socket = new Socket("10.100.1.239", 255);
        System.out.println("Connection accepted: " + socket);
        DataInputStream dIS = new DataInputStream(System.in);
        System.out.println("");
    }
}
