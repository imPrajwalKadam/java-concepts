//a client that receives the messages from the server above

import java.io.*;
import java.net.*;


public class MultiClient {
     public static void main(String[] args)throws IOException {
          //create client socket with port number 999
          Socket s = new Socket("localhost",999);

          //to accept a data from server
          BufferedReader br = new BufferedReader(new  InputStreamReader
          (s.getInputStream()));

          //receves data as a long as server does not close client socket

          String str;
          while((str = br.readLine()) != null)
          System.out.println(str);

          //close connection
          br.close();
          s.close();
     }
}
