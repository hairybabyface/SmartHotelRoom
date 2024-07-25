package PowerService;

import java.io.IOException;

import PowerService.PowerServiceGrpc.PowerServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class PowerService_Server extends PowerServiceImplBase{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		PowerService_Server powerService_Server = new PowerService_Server();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(powerService_Server)
				.build()
				.start();

		System.out.println("PowerService_Server started, listening on " + port);

		server.awaitTermination();
	}

	@Override
	public void powerTurnOn(Power_turnOnRequest request, StreamObserver<Power_turnOnReply> responseObserver) 
	{
		//preparing the response message
		Power_turnOnReply reply = Power_turnOnReply.newBuilder().setText("Power turned on").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
	
	@Override
	public void powerTurnOff(Power_turnOffRequest request, StreamObserver<Power_turnOffReply> responseObserver) 
	{
		//preparing the response message
		Power_turnOffReply reply = Power_turnOffReply.newBuilder().setText("Power turned off").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
	
	@Override
	public void powerCardWarning(Power_cardWarningRequest request, StreamObserver<Power_cardWarningReply> responseObserver) 
	{
		//preparing the response message
		Power_cardWarningReply reply = Power_cardWarningReply.newBuilder().setText("Card warning sent").build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}
}
