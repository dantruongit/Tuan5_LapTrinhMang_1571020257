package tuan5;

import java.net.*;
import java.io.*;


public class ClientDemo {
    
    public static void main(String[] args) {
        final String host = "localhost";
        final int port = 12345;
        try {
            Socket socket = new Socket(host,port);
            System.out.println("Client da ket noi den server");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;
            while((message = userInput.readLine()) != null){
                out.println(message);
                System.out.println("Client : " + message);
                String response = in.readLine();
                System.out.println("Server : " + response);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
