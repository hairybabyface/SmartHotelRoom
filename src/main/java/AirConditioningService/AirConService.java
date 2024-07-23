package AirConditioningService;

import java.io.IOException;

import AirConditioningService.AirConServiceGrpc.AirConServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class AirConService extends AirConServiceImplBase{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		AirConService airConService = new AirConService();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(airConService)
				.build()
				.start();

		System.out.println("Air Conditioning Service started, listening on " + port);

		server.awaitTermination();
	}


	@Override
	public void airConTurnOn(AirCon_turnOnRequest request, StreamObserver<AirCon_turnOnReply> responseObserver) 
	{
		
		// Get user request
		String s = request.getText();
		
		// Prepare response message
		AirCon_turnOnReply reply = null;
		
		// Check for valid user request
		if(s.equals("Turn on air con"))
		{
	       // Set response message
		   reply = AirCon_turnOnReply.newBuilder().setText("Air con turned on").build();
		}
		else
		{
		   // Set error message
		   reply = AirCon_turnOnReply.newBuilder().setText("ERROR: Invalid request").build();
		}
		
		responseObserver.onNext(reply);
	     
	    responseObserver.onCompleted();
	}
}
