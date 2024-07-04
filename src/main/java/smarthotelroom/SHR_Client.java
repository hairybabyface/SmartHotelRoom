package smarthotelroom;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import smarthotelroom.GreeterGrpc.GreeterBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class SHR_Client {

	private static final Logger logger = Logger.getLogger(SHR_Client.class.getName());

		  
	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		GreeterBlockingStub  blockingStub = GreeterGrpc.newBlockingStub(channel);
				
		SHR_Client client = new SHR_Client();
	    
	    try {
	    	 String name = "Paul";
	    	 HelloRequest request = HelloRequest.newBuilder().setName(name).build();
	    	 
	    	 HelloReply response = blockingStub.sayHello(request);
	    	 
	    	 logger.info("Greeting: " + response.getMessage());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	
	
}
