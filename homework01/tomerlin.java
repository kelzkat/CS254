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

    public static void main(String[] args) throws IOException {

        ServerSocket test = new ServerSocket(500);
        int port = test.getLocalPort();
        Socket socket = new Socket("11.144.9.921", 500);
        System.out.println("Connection accepted: " + socket);
        DataInputStream dIS = new DataInputStream(System.in);
        System.out.println("");
    }
}
