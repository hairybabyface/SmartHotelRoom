package AirConService;

import java.io.IOException;

import AirConService.AirConServiceGrpc.AirConServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class AirConService_Server extends AirConServiceImplBase{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		AirConService_Server airConService_Server = new AirConService_Server();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(airConService_Server)
				.build()
				.start();

		System.out.println("AirConService_Server started, listening on " + port);

		server.awaitTermination();
	}

	@Override
	public void airConTurnOn(AirCon_turnOnRequest request, StreamObserver<AirCon_turnOnReply> responseObserver) 
	{
		//preparing the response message
		AirCon_turnOnReply reply = AirCon_turnOnReply.newBuilder().setText("Air con turned on").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
	
	@Override
	public void airConTurnUp(AirCon_turnUpRequest request, StreamObserver<AirCon_turnUpReply> responseObserver) 
	{
		//preparing the response message
		AirCon_turnUpReply reply = AirCon_turnUpReply.newBuilder().setText("Air con turned up").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
	
	@Override
	public void airConTurnDown(AirCon_turnDownRequest request, StreamObserver<AirCon_turnDownReply> responseObserver) 
	{
		//preparing the response message
		AirCon_turnDownReply reply = AirCon_turnDownReply.newBuilder().setText("Air con turned down").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
}
