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
		
		//prepare the value to be set back
		//String r = request.getText();
		
		//preparing the response message
		AirCon_turnOnReply reply = AirCon_turnOnReply.newBuilder().setText("Air con turned on").build();
	     
		responseObserver.onNext(reply);
	     
	    responseObserver.onCompleted();
	}
}
