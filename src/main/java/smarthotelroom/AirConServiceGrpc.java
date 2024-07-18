package smarthotelroom;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: AirConService.proto")
public final class AirConServiceGrpc {

  private AirConServiceGrpc() {}

  public static final String SERVICE_NAME = "AirConService.AirConService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnOnRequest,
      smarthotelroom.AirCon_turnOnReply> getAirConTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirCon_turnOn",
      requestType = smarthotelroom.AirCon_turnOnRequest.class,
      responseType = smarthotelroom.AirCon_turnOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnOnRequest,
      smarthotelroom.AirCon_turnOnReply> getAirConTurnOnMethod() {
    io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnOnRequest, smarthotelroom.AirCon_turnOnReply> getAirConTurnOnMethod;
    if ((getAirConTurnOnMethod = AirConServiceGrpc.getAirConTurnOnMethod) == null) {
      synchronized (AirConServiceGrpc.class) {
        if ((getAirConTurnOnMethod = AirConServiceGrpc.getAirConTurnOnMethod) == null) {
          AirConServiceGrpc.getAirConTurnOnMethod = getAirConTurnOnMethod = 
              io.grpc.MethodDescriptor.<smarthotelroom.AirCon_turnOnRequest, smarthotelroom.AirCon_turnOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AirConService.AirConService", "AirCon_turnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthotelroom.AirCon_turnOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthotelroom.AirCon_turnOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AirConServiceMethodDescriptorSupplier("AirCon_turnOn"))
                  .build();
          }
        }
     }
     return getAirConTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnUpRequest,
      smarthotelroom.AirCon_turnUpReply> getAirConTurnUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirCon_turnUp",
      requestType = smarthotelroom.AirCon_turnUpRequest.class,
      responseType = smarthotelroom.AirCon_turnUpReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnUpRequest,
      smarthotelroom.AirCon_turnUpReply> getAirConTurnUpMethod() {
    io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnUpRequest, smarthotelroom.AirCon_turnUpReply> getAirConTurnUpMethod;
    if ((getAirConTurnUpMethod = AirConServiceGrpc.getAirConTurnUpMethod) == null) {
      synchronized (AirConServiceGrpc.class) {
        if ((getAirConTurnUpMethod = AirConServiceGrpc.getAirConTurnUpMethod) == null) {
          AirConServiceGrpc.getAirConTurnUpMethod = getAirConTurnUpMethod = 
              io.grpc.MethodDescriptor.<smarthotelroom.AirCon_turnUpRequest, smarthotelroom.AirCon_turnUpReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AirConService.AirConService", "AirCon_turnUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthotelroom.AirCon_turnUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthotelroom.AirCon_turnUpReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AirConServiceMethodDescriptorSupplier("AirCon_turnUp"))
                  .build();
          }
        }
     }
     return getAirConTurnUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnDownRequest,
      smarthotelroom.AirCon_turnDownReply> getAirConTurnDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirCon_turnDown",
      requestType = smarthotelroom.AirCon_turnDownRequest.class,
      responseType = smarthotelroom.AirCon_turnDownReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnDownRequest,
      smarthotelroom.AirCon_turnDownReply> getAirConTurnDownMethod() {
    io.grpc.MethodDescriptor<smarthotelroom.AirCon_turnDownRequest, smarthotelroom.AirCon_turnDownReply> getAirConTurnDownMethod;
    if ((getAirConTurnDownMethod = AirConServiceGrpc.getAirConTurnDownMethod) == null) {
      synchronized (AirConServiceGrpc.class) {
        if ((getAirConTurnDownMethod = AirConServiceGrpc.getAirConTurnDownMethod) == null) {
          AirConServiceGrpc.getAirConTurnDownMethod = getAirConTurnDownMethod = 
              io.grpc.MethodDescriptor.<smarthotelroom.AirCon_turnDownRequest, smarthotelroom.AirCon_turnDownReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AirConService.AirConService", "AirCon_turnDown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthotelroom.AirCon_turnDownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthotelroom.AirCon_turnDownReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AirConServiceMethodDescriptorSupplier("AirCon_turnDown"))
                  .build();
          }
        }
     }
     return getAirConTurnDownMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirConServiceStub newStub(io.grpc.Channel channel) {
    return new AirConServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirConServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirConServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirConServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirConServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class AirConServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void airConTurnOn(smarthotelroom.AirCon_turnOnRequest request,
        io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirConTurnOnMethod(), responseObserver);
    }

    /**
     */
    public void airConTurnUp(smarthotelroom.AirCon_turnUpRequest request,
        io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnUpReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirConTurnUpMethod(), responseObserver);
    }

    /**
     */
    public void airConTurnDown(smarthotelroom.AirCon_turnDownRequest request,
        io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnDownReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirConTurnDownMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAirConTurnOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarthotelroom.AirCon_turnOnRequest,
                smarthotelroom.AirCon_turnOnReply>(
                  this, METHODID_AIR_CON_TURN_ON)))
          .addMethod(
            getAirConTurnUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarthotelroom.AirCon_turnUpRequest,
                smarthotelroom.AirCon_turnUpReply>(
                  this, METHODID_AIR_CON_TURN_UP)))
          .addMethod(
            getAirConTurnDownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smarthotelroom.AirCon_turnDownRequest,
                smarthotelroom.AirCon_turnDownReply>(
                  this, METHODID_AIR_CON_TURN_DOWN)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirConServiceStub extends io.grpc.stub.AbstractStub<AirConServiceStub> {
    private AirConServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirConServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirConServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirConServiceStub(channel, callOptions);
    }

    /**
     */
    public void airConTurnOn(smarthotelroom.AirCon_turnOnRequest request,
        io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAirConTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void airConTurnUp(smarthotelroom.AirCon_turnUpRequest request,
        io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnUpReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAirConTurnUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void airConTurnDown(smarthotelroom.AirCon_turnDownRequest request,
        io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnDownReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAirConTurnDownMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirConServiceBlockingStub extends io.grpc.stub.AbstractStub<AirConServiceBlockingStub> {
    private AirConServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirConServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirConServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirConServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smarthotelroom.AirCon_turnOnReply airConTurnOn(smarthotelroom.AirCon_turnOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getAirConTurnOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public smarthotelroom.AirCon_turnUpReply airConTurnUp(smarthotelroom.AirCon_turnUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getAirConTurnUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public smarthotelroom.AirCon_turnDownReply airConTurnDown(smarthotelroom.AirCon_turnDownRequest request) {
      return blockingUnaryCall(
          getChannel(), getAirConTurnDownMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class AirConServiceFutureStub extends io.grpc.stub.AbstractStub<AirConServiceFutureStub> {
    private AirConServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirConServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirConServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirConServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarthotelroom.AirCon_turnOnReply> airConTurnOn(
        smarthotelroom.AirCon_turnOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAirConTurnOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarthotelroom.AirCon_turnUpReply> airConTurnUp(
        smarthotelroom.AirCon_turnUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAirConTurnUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarthotelroom.AirCon_turnDownReply> airConTurnDown(
        smarthotelroom.AirCon_turnDownRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAirConTurnDownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AIR_CON_TURN_ON = 0;
  private static final int METHODID_AIR_CON_TURN_UP = 1;
  private static final int METHODID_AIR_CON_TURN_DOWN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirConServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirConServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AIR_CON_TURN_ON:
          serviceImpl.airConTurnOn((smarthotelroom.AirCon_turnOnRequest) request,
              (io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnOnReply>) responseObserver);
          break;
        case METHODID_AIR_CON_TURN_UP:
          serviceImpl.airConTurnUp((smarthotelroom.AirCon_turnUpRequest) request,
              (io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnUpReply>) responseObserver);
          break;
        case METHODID_AIR_CON_TURN_DOWN:
          serviceImpl.airConTurnDown((smarthotelroom.AirCon_turnDownRequest) request,
              (io.grpc.stub.StreamObserver<smarthotelroom.AirCon_turnDownReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AirConServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirConServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smarthotelroom.SmartHotelRoomImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirConService");
    }
  }

  private static final class AirConServiceFileDescriptorSupplier
      extends AirConServiceBaseDescriptorSupplier {
    AirConServiceFileDescriptorSupplier() {}
  }

  private static final class AirConServiceMethodDescriptorSupplier
      extends AirConServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirConServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AirConServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirConServiceFileDescriptorSupplier())
              .addMethod(getAirConTurnOnMethod())
              .addMethod(getAirConTurnUpMethod())
              .addMethod(getAirConTurnDownMethod())
              .build();
        }
      }
    }
    return result;
  }
}
