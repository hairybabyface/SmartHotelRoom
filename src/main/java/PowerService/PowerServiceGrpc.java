package PowerService;

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
    comments = "Source: PowerService.proto")
public final class PowerServiceGrpc {

  private PowerServiceGrpc() {}

  public static final String SERVICE_NAME = "PowerService.PowerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<PowerService.PowerService_turnOnRequest,
      PowerService.PowerService_turnOnReply> getPowerServiceTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PowerService_turnOn",
      requestType = PowerService.PowerService_turnOnRequest.class,
      responseType = PowerService.PowerService_turnOnReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PowerService.PowerService_turnOnRequest,
      PowerService.PowerService_turnOnReply> getPowerServiceTurnOnMethod() {
    io.grpc.MethodDescriptor<PowerService.PowerService_turnOnRequest, PowerService.PowerService_turnOnReply> getPowerServiceTurnOnMethod;
    if ((getPowerServiceTurnOnMethod = PowerServiceGrpc.getPowerServiceTurnOnMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getPowerServiceTurnOnMethod = PowerServiceGrpc.getPowerServiceTurnOnMethod) == null) {
          PowerServiceGrpc.getPowerServiceTurnOnMethod = getPowerServiceTurnOnMethod = 
              io.grpc.MethodDescriptor.<PowerService.PowerService_turnOnRequest, PowerService.PowerService_turnOnReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PowerService.PowerService", "PowerService_turnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PowerService.PowerService_turnOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PowerService.PowerService_turnOnReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PowerServiceMethodDescriptorSupplier("PowerService_turnOn"))
                  .build();
          }
        }
     }
     return getPowerServiceTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PowerService.PowerService_turnOffRequest,
      PowerService.PowerService_turnOffReply> getPowerServiceTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PowerService_turnOff",
      requestType = PowerService.PowerService_turnOffRequest.class,
      responseType = PowerService.PowerService_turnOffReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PowerService.PowerService_turnOffRequest,
      PowerService.PowerService_turnOffReply> getPowerServiceTurnOffMethod() {
    io.grpc.MethodDescriptor<PowerService.PowerService_turnOffRequest, PowerService.PowerService_turnOffReply> getPowerServiceTurnOffMethod;
    if ((getPowerServiceTurnOffMethod = PowerServiceGrpc.getPowerServiceTurnOffMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getPowerServiceTurnOffMethod = PowerServiceGrpc.getPowerServiceTurnOffMethod) == null) {
          PowerServiceGrpc.getPowerServiceTurnOffMethod = getPowerServiceTurnOffMethod = 
              io.grpc.MethodDescriptor.<PowerService.PowerService_turnOffRequest, PowerService.PowerService_turnOffReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PowerService.PowerService", "PowerService_turnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PowerService.PowerService_turnOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PowerService.PowerService_turnOffReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PowerServiceMethodDescriptorSupplier("PowerService_turnOff"))
                  .build();
          }
        }
     }
     return getPowerServiceTurnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PowerService.Power_cardWarningRequest,
      PowerService.Power_cardWarningReply> getPowerCardWarningMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Power_cardWarning",
      requestType = PowerService.Power_cardWarningRequest.class,
      responseType = PowerService.Power_cardWarningReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PowerService.Power_cardWarningRequest,
      PowerService.Power_cardWarningReply> getPowerCardWarningMethod() {
    io.grpc.MethodDescriptor<PowerService.Power_cardWarningRequest, PowerService.Power_cardWarningReply> getPowerCardWarningMethod;
    if ((getPowerCardWarningMethod = PowerServiceGrpc.getPowerCardWarningMethod) == null) {
      synchronized (PowerServiceGrpc.class) {
        if ((getPowerCardWarningMethod = PowerServiceGrpc.getPowerCardWarningMethod) == null) {
          PowerServiceGrpc.getPowerCardWarningMethod = getPowerCardWarningMethod = 
              io.grpc.MethodDescriptor.<PowerService.Power_cardWarningRequest, PowerService.Power_cardWarningReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PowerService.PowerService", "Power_cardWarning"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PowerService.Power_cardWarningRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PowerService.Power_cardWarningReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PowerServiceMethodDescriptorSupplier("Power_cardWarning"))
                  .build();
          }
        }
     }
     return getPowerCardWarningMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PowerServiceStub newStub(io.grpc.Channel channel) {
    return new PowerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PowerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PowerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PowerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PowerServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class PowerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void powerServiceTurnOn(PowerService.PowerService_turnOnRequest request,
        io.grpc.stub.StreamObserver<PowerService.PowerService_turnOnReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPowerServiceTurnOnMethod(), responseObserver);
    }

    /**
     */
    public void powerServiceTurnOff(PowerService.PowerService_turnOffRequest request,
        io.grpc.stub.StreamObserver<PowerService.PowerService_turnOffReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPowerServiceTurnOffMethod(), responseObserver);
    }

    /**
     */
    public void powerCardWarning(PowerService.Power_cardWarningRequest request,
        io.grpc.stub.StreamObserver<PowerService.Power_cardWarningReply> responseObserver) {
      asyncUnimplementedUnaryCall(getPowerCardWarningMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPowerServiceTurnOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                PowerService.PowerService_turnOnRequest,
                PowerService.PowerService_turnOnReply>(
                  this, METHODID_POWER_SERVICE_TURN_ON)))
          .addMethod(
            getPowerServiceTurnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                PowerService.PowerService_turnOffRequest,
                PowerService.PowerService_turnOffReply>(
                  this, METHODID_POWER_SERVICE_TURN_OFF)))
          .addMethod(
            getPowerCardWarningMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                PowerService.Power_cardWarningRequest,
                PowerService.Power_cardWarningReply>(
                  this, METHODID_POWER_CARD_WARNING)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PowerServiceStub extends io.grpc.stub.AbstractStub<PowerServiceStub> {
    private PowerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PowerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PowerServiceStub(channel, callOptions);
    }

    /**
     */
    public void powerServiceTurnOn(PowerService.PowerService_turnOnRequest request,
        io.grpc.stub.StreamObserver<PowerService.PowerService_turnOnReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPowerServiceTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void powerServiceTurnOff(PowerService.PowerService_turnOffRequest request,
        io.grpc.stub.StreamObserver<PowerService.PowerService_turnOffReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPowerServiceTurnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void powerCardWarning(PowerService.Power_cardWarningRequest request,
        io.grpc.stub.StreamObserver<PowerService.Power_cardWarningReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPowerCardWarningMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PowerServiceBlockingStub extends io.grpc.stub.AbstractStub<PowerServiceBlockingStub> {
    private PowerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PowerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PowerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public PowerService.PowerService_turnOnReply powerServiceTurnOn(PowerService.PowerService_turnOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getPowerServiceTurnOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public PowerService.PowerService_turnOffReply powerServiceTurnOff(PowerService.PowerService_turnOffRequest request) {
      return blockingUnaryCall(
          getChannel(), getPowerServiceTurnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public PowerService.Power_cardWarningReply powerCardWarning(PowerService.Power_cardWarningRequest request) {
      return blockingUnaryCall(
          getChannel(), getPowerCardWarningMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PowerServiceFutureStub extends io.grpc.stub.AbstractStub<PowerServiceFutureStub> {
    private PowerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PowerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PowerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PowerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PowerService.PowerService_turnOnReply> powerServiceTurnOn(
        PowerService.PowerService_turnOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPowerServiceTurnOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PowerService.PowerService_turnOffReply> powerServiceTurnOff(
        PowerService.PowerService_turnOffRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPowerServiceTurnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PowerService.Power_cardWarningReply> powerCardWarning(
        PowerService.Power_cardWarningRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPowerCardWarningMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POWER_SERVICE_TURN_ON = 0;
  private static final int METHODID_POWER_SERVICE_TURN_OFF = 1;
  private static final int METHODID_POWER_CARD_WARNING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PowerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PowerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POWER_SERVICE_TURN_ON:
          serviceImpl.powerServiceTurnOn((PowerService.PowerService_turnOnRequest) request,
              (io.grpc.stub.StreamObserver<PowerService.PowerService_turnOnReply>) responseObserver);
          break;
        case METHODID_POWER_SERVICE_TURN_OFF:
          serviceImpl.powerServiceTurnOff((PowerService.PowerService_turnOffRequest) request,
              (io.grpc.stub.StreamObserver<PowerService.PowerService_turnOffReply>) responseObserver);
          break;
        case METHODID_POWER_CARD_WARNING:
          serviceImpl.powerCardWarning((PowerService.Power_cardWarningRequest) request,
              (io.grpc.stub.StreamObserver<PowerService.Power_cardWarningReply>) responseObserver);
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

  private static abstract class PowerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PowerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PowerService.SmartHotelRoomImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PowerService");
    }
  }

  private static final class PowerServiceFileDescriptorSupplier
      extends PowerServiceBaseDescriptorSupplier {
    PowerServiceFileDescriptorSupplier() {}
  }

  private static final class PowerServiceMethodDescriptorSupplier
      extends PowerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PowerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PowerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PowerServiceFileDescriptorSupplier())
              .addMethod(getPowerServiceTurnOnMethod())
              .addMethod(getPowerServiceTurnOffMethod())
              .addMethod(getPowerCardWarningMethod())
              .build();
        }
      }
    }
    return result;
  }
}
