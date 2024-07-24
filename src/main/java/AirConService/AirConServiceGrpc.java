package AirConService;

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
  private static volatile io.grpc.MethodDescriptor<AirConService.AirCon_turnOnRequest,
      AirConService.AirCon_turnOnReply> getAirConTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirCon_turnOn",
      requestType = AirConService.AirCon_turnOnRequest.class,
      responseType = AirConService.AirCon_turnOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AirConService.AirCon_turnOnRequest,
      AirConService.AirCon_turnOnReply> getAirConTurnOnMethod() {
    io.grpc.MethodDescriptor<AirConService.AirCon_turnOnRequest, AirConService.AirCon_turnOnReply> getAirConTurnOnMethod;
    if ((getAirConTurnOnMethod = AirConServiceGrpc.getAirConTurnOnMethod) == null) {
      synchronized (AirConServiceGrpc.class) {
        if ((getAirConTurnOnMethod = AirConServiceGrpc.getAirConTurnOnMethod) == null) {
          AirConServiceGrpc.getAirConTurnOnMethod = getAirConTurnOnMethod = 
              io.grpc.MethodDescriptor.<AirConService.AirCon_turnOnRequest, AirConService.AirCon_turnOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AirConService.AirConService", "AirCon_turnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AirConService.AirCon_turnOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AirConService.AirCon_turnOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AirConServiceMethodDescriptorSupplier("AirCon_turnOn"))
                  .build();
          }
        }
     }
     return getAirConTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AirConService.AirCon_turnUpRequest,
      AirConService.AirCon_turnUpReply> getAirConTurnUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirCon_turnUp",
      requestType = AirConService.AirCon_turnUpRequest.class,
      responseType = AirConService.AirCon_turnUpReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AirConService.AirCon_turnUpRequest,
      AirConService.AirCon_turnUpReply> getAirConTurnUpMethod() {
    io.grpc.MethodDescriptor<AirConService.AirCon_turnUpRequest, AirConService.AirCon_turnUpReply> getAirConTurnUpMethod;
    if ((getAirConTurnUpMethod = AirConServiceGrpc.getAirConTurnUpMethod) == null) {
      synchronized (AirConServiceGrpc.class) {
        if ((getAirConTurnUpMethod = AirConServiceGrpc.getAirConTurnUpMethod) == null) {
          AirConServiceGrpc.getAirConTurnUpMethod = getAirConTurnUpMethod = 
              io.grpc.MethodDescriptor.<AirConService.AirCon_turnUpRequest, AirConService.AirCon_turnUpReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AirConService.AirConService", "AirCon_turnUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AirConService.AirCon_turnUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AirConService.AirCon_turnUpReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AirConServiceMethodDescriptorSupplier("AirCon_turnUp"))
                  .build();
          }
        }
     }
     return getAirConTurnUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AirConService.AirCon_turnDownRequest,
      AirConService.AirCon_turnDownReply> getAirConTurnDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirCon_turnDown",
      requestType = AirConService.AirCon_turnDownRequest.class,
      responseType = AirConService.AirCon_turnDownReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AirConService.AirCon_turnDownRequest,
      AirConService.AirCon_turnDownReply> getAirConTurnDownMethod() {
    io.grpc.MethodDescriptor<AirConService.AirCon_turnDownRequest, AirConService.AirCon_turnDownReply> getAirConTurnDownMethod;
    if ((getAirConTurnDownMethod = AirConServiceGrpc.getAirConTurnDownMethod) == null) {
      synchronized (AirConServiceGrpc.class) {
        if ((getAirConTurnDownMethod = AirConServiceGrpc.getAirConTurnDownMethod) == null) {
          AirConServiceGrpc.getAirConTurnDownMethod = getAirConTurnDownMethod = 
              io.grpc.MethodDescriptor.<AirConService.AirCon_turnDownRequest, AirConService.AirCon_turnDownReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AirConService.AirConService", "AirCon_turnDown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AirConService.AirCon_turnDownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AirConService.AirCon_turnDownReply.getDefaultInstance()))
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
    public void airConTurnOn(AirConService.AirCon_turnOnRequest request,
        io.grpc.stub.StreamObserver<AirConService.AirCon_turnOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirConTurnOnMethod(), responseObserver);
    }

    /**
     */
    public void airConTurnUp(AirConService.AirCon_turnUpRequest request,
        io.grpc.stub.StreamObserver<AirConService.AirCon_turnUpReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirConTurnUpMethod(), responseObserver);
    }

    /**
     */
    public void airConTurnDown(AirConService.AirCon_turnDownRequest request,
        io.grpc.stub.StreamObserver<AirConService.AirCon_turnDownReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirConTurnDownMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAirConTurnOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                AirConService.AirCon_turnOnRequest,
                AirConService.AirCon_turnOnReply>(
                  this, METHODID_AIR_CON_TURN_ON)))
          .addMethod(
            getAirConTurnUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                AirConService.AirCon_turnUpRequest,
                AirConService.AirCon_turnUpReply>(
                  this, METHODID_AIR_CON_TURN_UP)))
          .addMethod(
            getAirConTurnDownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                AirConService.AirCon_turnDownRequest,
                AirConService.AirCon_turnDownReply>(
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
    public void airConTurnOn(AirConService.AirCon_turnOnRequest request,
        io.grpc.stub.StreamObserver<AirConService.AirCon_turnOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAirConTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void airConTurnUp(AirConService.AirCon_turnUpRequest request,
        io.grpc.stub.StreamObserver<AirConService.AirCon_turnUpReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAirConTurnUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void airConTurnDown(AirConService.AirCon_turnDownRequest request,
        io.grpc.stub.StreamObserver<AirConService.AirCon_turnDownReply> responseObserver) {
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
    public AirConService.AirCon_turnOnReply airConTurnOn(AirConService.AirCon_turnOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getAirConTurnOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public AirConService.AirCon_turnUpReply airConTurnUp(AirConService.AirCon_turnUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getAirConTurnUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public AirConService.AirCon_turnDownReply airConTurnDown(AirConService.AirCon_turnDownRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<AirConService.AirCon_turnOnReply> airConTurnOn(
        AirConService.AirCon_turnOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAirConTurnOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AirConService.AirCon_turnUpReply> airConTurnUp(
        AirConService.AirCon_turnUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAirConTurnUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AirConService.AirCon_turnDownReply> airConTurnDown(
        AirConService.AirCon_turnDownRequest request) {
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
          serviceImpl.airConTurnOn((AirConService.AirCon_turnOnRequest) request,
              (io.grpc.stub.StreamObserver<AirConService.AirCon_turnOnReply>) responseObserver);
          break;
        case METHODID_AIR_CON_TURN_UP:
          serviceImpl.airConTurnUp((AirConService.AirCon_turnUpRequest) request,
              (io.grpc.stub.StreamObserver<AirConService.AirCon_turnUpReply>) responseObserver);
          break;
        case METHODID_AIR_CON_TURN_DOWN:
          serviceImpl.airConTurnDown((AirConService.AirCon_turnDownRequest) request,
              (io.grpc.stub.StreamObserver<AirConService.AirCon_turnDownReply>) responseObserver);
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
      return AirConService.AirConServiceImpl.getDescriptor();
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
