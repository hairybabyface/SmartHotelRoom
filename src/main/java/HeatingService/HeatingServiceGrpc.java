package HeatingService;

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
    comments = "Source: HeatingService.proto")
public final class HeatingServiceGrpc {

  private HeatingServiceGrpc() {}

  public static final String SERVICE_NAME = "HeatingService.HeatingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HeatingService.Heating_turnOnRequest,
      HeatingService.Heating_turnOnReply> getHeatingTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heating_turnOn",
      requestType = HeatingService.Heating_turnOnRequest.class,
      responseType = HeatingService.Heating_turnOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingService.Heating_turnOnRequest,
      HeatingService.Heating_turnOnReply> getHeatingTurnOnMethod() {
    io.grpc.MethodDescriptor<HeatingService.Heating_turnOnRequest, HeatingService.Heating_turnOnReply> getHeatingTurnOnMethod;
    if ((getHeatingTurnOnMethod = HeatingServiceGrpc.getHeatingTurnOnMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getHeatingTurnOnMethod = HeatingServiceGrpc.getHeatingTurnOnMethod) == null) {
          HeatingServiceGrpc.getHeatingTurnOnMethod = getHeatingTurnOnMethod = 
              io.grpc.MethodDescriptor.<HeatingService.Heating_turnOnRequest, HeatingService.Heating_turnOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingService.HeatingService", "Heating_turnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingService.Heating_turnOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingService.Heating_turnOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("Heating_turnOn"))
                  .build();
          }
        }
     }
     return getHeatingTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HeatingService.Heating_turnUpRequest,
      HeatingService.Heating_turnUpReply> getHeatingTurnUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heating_turnUp",
      requestType = HeatingService.Heating_turnUpRequest.class,
      responseType = HeatingService.Heating_turnUpReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingService.Heating_turnUpRequest,
      HeatingService.Heating_turnUpReply> getHeatingTurnUpMethod() {
    io.grpc.MethodDescriptor<HeatingService.Heating_turnUpRequest, HeatingService.Heating_turnUpReply> getHeatingTurnUpMethod;
    if ((getHeatingTurnUpMethod = HeatingServiceGrpc.getHeatingTurnUpMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getHeatingTurnUpMethod = HeatingServiceGrpc.getHeatingTurnUpMethod) == null) {
          HeatingServiceGrpc.getHeatingTurnUpMethod = getHeatingTurnUpMethod = 
              io.grpc.MethodDescriptor.<HeatingService.Heating_turnUpRequest, HeatingService.Heating_turnUpReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingService.HeatingService", "Heating_turnUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingService.Heating_turnUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingService.Heating_turnUpReply.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("Heating_turnUp"))
                  .build();
          }
        }
     }
     return getHeatingTurnUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HeatingService.Heating_turnDownRequest,
      HeatingService.Heating_turnDownReply> getHeatingTurnDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heating_turnDown",
      requestType = HeatingService.Heating_turnDownRequest.class,
      responseType = HeatingService.Heating_turnDownReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeatingService.Heating_turnDownRequest,
      HeatingService.Heating_turnDownReply> getHeatingTurnDownMethod() {
    io.grpc.MethodDescriptor<HeatingService.Heating_turnDownRequest, HeatingService.Heating_turnDownReply> getHeatingTurnDownMethod;
    if ((getHeatingTurnDownMethod = HeatingServiceGrpc.getHeatingTurnDownMethod) == null) {
      synchronized (HeatingServiceGrpc.class) {
        if ((getHeatingTurnDownMethod = HeatingServiceGrpc.getHeatingTurnDownMethod) == null) {
          HeatingServiceGrpc.getHeatingTurnDownMethod = getHeatingTurnDownMethod = 
              io.grpc.MethodDescriptor.<HeatingService.Heating_turnDownRequest, HeatingService.Heating_turnDownReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeatingService.HeatingService", "Heating_turnDown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingService.Heating_turnDownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeatingService.Heating_turnDownReply.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatingServiceMethodDescriptorSupplier("Heating_turnDown"))
                  .build();
          }
        }
     }
     return getHeatingTurnDownMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeatingServiceStub newStub(io.grpc.Channel channel) {
    return new HeatingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeatingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeatingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeatingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeatingServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class HeatingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void heatingTurnOn(HeatingService.Heating_turnOnRequest request,
        io.grpc.stub.StreamObserver<HeatingService.Heating_turnOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getHeatingTurnOnMethod(), responseObserver);
    }

    /**
     */
    public void heatingTurnUp(HeatingService.Heating_turnUpRequest request,
        io.grpc.stub.StreamObserver<HeatingService.Heating_turnUpReply> responseObserver) {
      asyncUnimplementedUnaryCall(getHeatingTurnUpMethod(), responseObserver);
    }

    /**
     */
    public void heatingTurnDown(HeatingService.Heating_turnDownRequest request,
        io.grpc.stub.StreamObserver<HeatingService.Heating_turnDownReply> responseObserver) {
      asyncUnimplementedUnaryCall(getHeatingTurnDownMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHeatingTurnOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingService.Heating_turnOnRequest,
                HeatingService.Heating_turnOnReply>(
                  this, METHODID_HEATING_TURN_ON)))
          .addMethod(
            getHeatingTurnUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingService.Heating_turnUpRequest,
                HeatingService.Heating_turnUpReply>(
                  this, METHODID_HEATING_TURN_UP)))
          .addMethod(
            getHeatingTurnDownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeatingService.Heating_turnDownRequest,
                HeatingService.Heating_turnDownReply>(
                  this, METHODID_HEATING_TURN_DOWN)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class HeatingServiceStub extends io.grpc.stub.AbstractStub<HeatingServiceStub> {
    private HeatingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceStub(channel, callOptions);
    }

    /**
     */
    public void heatingTurnOn(HeatingService.Heating_turnOnRequest request,
        io.grpc.stub.StreamObserver<HeatingService.Heating_turnOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeatingTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heatingTurnUp(HeatingService.Heating_turnUpRequest request,
        io.grpc.stub.StreamObserver<HeatingService.Heating_turnUpReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeatingTurnUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heatingTurnDown(HeatingService.Heating_turnDownRequest request,
        io.grpc.stub.StreamObserver<HeatingService.Heating_turnDownReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeatingTurnDownMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class HeatingServiceBlockingStub extends io.grpc.stub.AbstractStub<HeatingServiceBlockingStub> {
    private HeatingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public HeatingService.Heating_turnOnReply heatingTurnOn(HeatingService.Heating_turnOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getHeatingTurnOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public HeatingService.Heating_turnUpReply heatingTurnUp(HeatingService.Heating_turnUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getHeatingTurnUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public HeatingService.Heating_turnDownReply heatingTurnDown(HeatingService.Heating_turnDownRequest request) {
      return blockingUnaryCall(
          getChannel(), getHeatingTurnDownMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class HeatingServiceFutureStub extends io.grpc.stub.AbstractStub<HeatingServiceFutureStub> {
    private HeatingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeatingService.Heating_turnOnReply> heatingTurnOn(
        HeatingService.Heating_turnOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHeatingTurnOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeatingService.Heating_turnUpReply> heatingTurnUp(
        HeatingService.Heating_turnUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHeatingTurnUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeatingService.Heating_turnDownReply> heatingTurnDown(
        HeatingService.Heating_turnDownRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHeatingTurnDownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEATING_TURN_ON = 0;
  private static final int METHODID_HEATING_TURN_UP = 1;
  private static final int METHODID_HEATING_TURN_DOWN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeatingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeatingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEATING_TURN_ON:
          serviceImpl.heatingTurnOn((HeatingService.Heating_turnOnRequest) request,
              (io.grpc.stub.StreamObserver<HeatingService.Heating_turnOnReply>) responseObserver);
          break;
        case METHODID_HEATING_TURN_UP:
          serviceImpl.heatingTurnUp((HeatingService.Heating_turnUpRequest) request,
              (io.grpc.stub.StreamObserver<HeatingService.Heating_turnUpReply>) responseObserver);
          break;
        case METHODID_HEATING_TURN_DOWN:
          serviceImpl.heatingTurnDown((HeatingService.Heating_turnDownRequest) request,
              (io.grpc.stub.StreamObserver<HeatingService.Heating_turnDownReply>) responseObserver);
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

  private static abstract class HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeatingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HeatingService.SmartHotelRoomImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeatingService");
    }
  }

  private static final class HeatingServiceFileDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier {
    HeatingServiceFileDescriptorSupplier() {}
  }

  private static final class HeatingServiceMethodDescriptorSupplier
      extends HeatingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeatingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeatingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeatingServiceFileDescriptorSupplier())
              .addMethod(getHeatingTurnOnMethod())
              .addMethod(getHeatingTurnUpMethod())
              .addMethod(getHeatingTurnDownMethod())
              .build();
        }
      }
    }
    return result;
  }
}
