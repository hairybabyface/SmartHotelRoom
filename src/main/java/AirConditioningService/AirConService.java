package AirConditioningService;

import java.io.IOException;

import AirConditioningService.AirConServiceGrpc.AirConServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

// Service 1
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

	// Method 1
	@Override
	public void airConTurnOn(AirCon_turnOnRequest request, StreamObserver<AirCon_turnOnReply> responseObserver) 
	{
		// Set response message
		AirCon_turnOnReply reply = AirCon_turnOnReply.newBuilder().setText("Air con turned on").build();
		
		responseObserver.onNext(reply);
	     
	    responseObserver.onCompleted();
	}
	
	// Method 2
	@Override
	public void airConTurnUp(AirCon_turnUpRequest request, StreamObserver<AirCon_turnUpReply> responseObserver) 
	{
		// Set response message
		AirCon_turnUpReply reply = AirCon_turnUpReply.newBuilder().setText("Air con turned up").build();
		
		responseObserver.onNext(reply);
	     
	    responseObserver.onCompleted();
	}
	
	// Method 3
	@Override
	public void airConTurnDown(AirCon_turnDownRequest request, StreamObserver<AirCon_turnDownReply> responseObserver) 
	{
		// Set response message
		AirCon_turnDownReply reply = AirCon_turnDownReply.newBuilder().setText("Air con turned down").build();
			
		responseObserver.onNext(reply);
		     
		responseObserver.onCompleted();
	}
}
