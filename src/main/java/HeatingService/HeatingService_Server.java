package HeatingService;

import java.io.IOException;

import HeatingService.HeatingServiceGrpc.HeatingServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class HeatingService_Server extends HeatingServiceImplBase{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		HeatingService_Server heatingService_Server = new HeatingService_Server();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(heatingService_Server)
				.build()
				.start();

		System.out.println("heatingService_Server started, listening on " + port);

		server.awaitTermination();
	}

	@Override
	public void heatingTurnOn(Heating_turnOnRequest request, StreamObserver<Heating_turnOnReply> responseObserver) 
	{
		//preparing the response message
		Heating_turnOnReply reply = Heating_turnOnReply.newBuilder().setText("Heating turned on").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
	
	@Override
	public void heatingTurnUp(Heating_turnUpRequest request, StreamObserver<Heating_turnUpReply> responseObserver) 
	{
		//preparing the response message
		Heating_turnUpReply reply = Heating_turnUpReply.newBuilder().setText("Heating turned up").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
	
	@Override
	public void heatingTurnDown(Heating_turnDownRequest request, StreamObserver<Heating_turnDownReply> responseObserver) 
	{
		//preparing the response message
		Heating_turnDownReply reply = Heating_turnDownReply.newBuilder().setText("Heating turned down").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
}
