package smarthotelroom;

import java.io.IOException;
import java.util.logging.Logger;

import smarthotelroom.GreeterGrpc.GreeterImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SHR_Server extends GreeterImplBase {

	private static final Logger logger = Logger.getLogger(SHR_Server.class.getName());

	public static void main(String[] args) {
		
		SHR_Server greeterserver = new SHR_Server();
		
		int port = 50051;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(greeterserver)
			    .build()
			    .start();
			
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    logger.info("Server started, listening on " + port);
	    		    
	   
	}
	
	@Override
	public void sayHello(HelloRequest request,  StreamObserver<HelloReply> responseObserver) {
		    
		System.out.println("receiving hello request");
		
		 HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
	

}
