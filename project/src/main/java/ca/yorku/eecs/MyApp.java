package ca.yorku.eecs;
import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

@SuppressWarnings("restriction")
public class MyApp implements HttpHandler {

	@Override
	public void handle(HttpExchange request) throws IOException {
		// TODO Auto-generated method stub
		
		
		if(request.getRequestMethod().equals("GET")) {
			
			handleGet(request);
			System.out.println("get");
			
		}else if(request.getRequestMethod().equals("POST")) {
			
			handlePost(request);
			
			System.out.println("post");
			
			
		}else if(request.getRequestMethod().equals("DELETE")) {
			
			handleDelete(request);
			System.out.println("delete");
		}else if(request.getRequestMethod().equals("PUT")) {
			
			handlePut(request);
			
			System.out.println("put");
		}
		
	}
	
	//Need to implement

private void handlePut(HttpExchange request) {
		// TODO Auto-generated method stub
		
	}

	private void handleDelete(HttpExchange request) {
		// TODO Auto-generated method stub
		
	}

	private void handlePost(HttpExchange request) {
		// TODO Auto-generated method stub
		
	}

	private void handleGet(HttpExchange request) {
		// TODO Auto-generated method stub
		
	}
	
	//Method for parsing json file goes here

}
 