package ca.yorku.eecs;

import java.io.IOException;
import java.net.InetSocketAddress;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;

import com.sun.net.httpserver.HttpServer;

public class App 
{
    static int PORT = 8000;
    @SuppressWarnings("restriction")
	public static void main(String[] args) throws IOException
    {
        
		HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", PORT), 0);
        server.start();
        System.out.printf("Server started on port %d...\n", PORT);
    }
    
    
 
   
}
