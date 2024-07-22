package AirConditioningService;

import java.io.IOException;

import com.google.protobuf.Descriptors.FieldDescriptor;

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
		System.out.println("receiving request to turn on Air Conditioning");
		
		//prepare the value to be set back
		int length = request.getText().length();
		
		//preparing the response message
		AirCon_turnOnReply reply = AirCon_turnOnReply.newBuilder().setLength(length).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}
}
