package HeatingService;

import java.io.IOException;

import HeatingService.HeatingServiceGrpc.HeatingServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

// Service 1
public class HeatingService extends HeatingServiceImplBase{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		HeatingService heatingService = new HeatingService();

		int port = 50051;

		Server server = ServerBuilder.forPort(port)
				.addService(heatingService)
				.build()
				.start();

		System.out.println("Heating Service started, listening on " + port);

		server.awaitTermination();
	}

	// Method 1
	@Override
	public void heatingTurnOn(Heating_turnOnRequest request, StreamObserver<Heating_turnOnReply> responseObserver) 
	{
		// Set response message
		Heating_turnOnReply reply = Heating_turnOnReply.newBuilder().setText("Heating turned on").build();
		
		responseObserver.onNext(reply);
	     
	    responseObserver.onCompleted();
	}
}
