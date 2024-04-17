package com.ayo.orderprocessing;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: OrderProcessingService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderProcessingServiceGrpc {

  private OrderProcessingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ayo.orderprocessing.OrderProcessingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ayo.orderprocessing.ProcessOrderRequest,
      com.ayo.orderprocessing.ProcessOrderResponse> getProcessOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessOrder",
      requestType = com.ayo.orderprocessing.ProcessOrderRequest.class,
      responseType = com.ayo.orderprocessing.ProcessOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ayo.orderprocessing.ProcessOrderRequest,
      com.ayo.orderprocessing.ProcessOrderResponse> getProcessOrderMethod() {
    io.grpc.MethodDescriptor<com.ayo.orderprocessing.ProcessOrderRequest, com.ayo.orderprocessing.ProcessOrderResponse> getProcessOrderMethod;
    if ((getProcessOrderMethod = OrderProcessingServiceGrpc.getProcessOrderMethod) == null) {
      synchronized (OrderProcessingServiceGrpc.class) {
        if ((getProcessOrderMethod = OrderProcessingServiceGrpc.getProcessOrderMethod) == null) {
          OrderProcessingServiceGrpc.getProcessOrderMethod = getProcessOrderMethod =
              io.grpc.MethodDescriptor.<com.ayo.orderprocessing.ProcessOrderRequest, com.ayo.orderprocessing.ProcessOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.orderprocessing.ProcessOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.orderprocessing.ProcessOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderProcessingServiceMethodDescriptorSupplier("ProcessOrder"))
              .build();
        }
      }
    }
    return getProcessOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ayo.orderprocessing.ProcessOrderRequest,
      com.ayo.orderprocessing.ProcessOrderResponse> getStreamProcessOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamProcessOrders",
      requestType = com.ayo.orderprocessing.ProcessOrderRequest.class,
      responseType = com.ayo.orderprocessing.ProcessOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.ayo.orderprocessing.ProcessOrderRequest,
      com.ayo.orderprocessing.ProcessOrderResponse> getStreamProcessOrdersMethod() {
    io.grpc.MethodDescriptor<com.ayo.orderprocessing.ProcessOrderRequest, com.ayo.orderprocessing.ProcessOrderResponse> getStreamProcessOrdersMethod;
    if ((getStreamProcessOrdersMethod = OrderProcessingServiceGrpc.getStreamProcessOrdersMethod) == null) {
      synchronized (OrderProcessingServiceGrpc.class) {
        if ((getStreamProcessOrdersMethod = OrderProcessingServiceGrpc.getStreamProcessOrdersMethod) == null) {
          OrderProcessingServiceGrpc.getStreamProcessOrdersMethod = getStreamProcessOrdersMethod =
              io.grpc.MethodDescriptor.<com.ayo.orderprocessing.ProcessOrderRequest, com.ayo.orderprocessing.ProcessOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamProcessOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.orderprocessing.ProcessOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.orderprocessing.ProcessOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderProcessingServiceMethodDescriptorSupplier("StreamProcessOrders"))
              .build();
        }
      }
    }
    return getStreamProcessOrdersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderProcessingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderProcessingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderProcessingServiceStub>() {
        @java.lang.Override
        public OrderProcessingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderProcessingServiceStub(channel, callOptions);
        }
      };
    return OrderProcessingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderProcessingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderProcessingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderProcessingServiceBlockingStub>() {
        @java.lang.Override
        public OrderProcessingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderProcessingServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderProcessingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderProcessingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderProcessingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderProcessingServiceFutureStub>() {
        @java.lang.Override
        public OrderProcessingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderProcessingServiceFutureStub(channel, callOptions);
        }
      };
    return OrderProcessingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void processOrder(com.ayo.orderprocessing.ProcessOrderRequest request,
        io.grpc.stub.StreamObserver<com.ayo.orderprocessing.ProcessOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessOrderMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.ayo.orderprocessing.ProcessOrderRequest> streamProcessOrders(
        io.grpc.stub.StreamObserver<com.ayo.orderprocessing.ProcessOrderResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamProcessOrdersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrderProcessingService.
   */
  public static abstract class OrderProcessingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrderProcessingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrderProcessingService.
   */
  public static final class OrderProcessingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrderProcessingServiceStub> {
    private OrderProcessingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderProcessingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderProcessingServiceStub(channel, callOptions);
    }

    /**
     */
    public void processOrder(com.ayo.orderprocessing.ProcessOrderRequest request,
        io.grpc.stub.StreamObserver<com.ayo.orderprocessing.ProcessOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ayo.orderprocessing.ProcessOrderRequest> streamProcessOrders(
        io.grpc.stub.StreamObserver<com.ayo.orderprocessing.ProcessOrderResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamProcessOrdersMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrderProcessingService.
   */
  public static final class OrderProcessingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrderProcessingServiceBlockingStub> {
    private OrderProcessingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderProcessingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderProcessingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ayo.orderprocessing.ProcessOrderResponse processOrder(com.ayo.orderprocessing.ProcessOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrderProcessingService.
   */
  public static final class OrderProcessingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrderProcessingServiceFutureStub> {
    private OrderProcessingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderProcessingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderProcessingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ayo.orderprocessing.ProcessOrderResponse> processOrder(
        com.ayo.orderprocessing.ProcessOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_ORDER = 0;
  private static final int METHODID_STREAM_PROCESS_ORDERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_ORDER:
          serviceImpl.processOrder((com.ayo.orderprocessing.ProcessOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.ayo.orderprocessing.ProcessOrderResponse>) responseObserver);
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
        case METHODID_STREAM_PROCESS_ORDERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamProcessOrders(
              (io.grpc.stub.StreamObserver<com.ayo.orderprocessing.ProcessOrderResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getProcessOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ayo.orderprocessing.ProcessOrderRequest,
              com.ayo.orderprocessing.ProcessOrderResponse>(
                service, METHODID_PROCESS_ORDER)))
        .addMethod(
          getStreamProcessOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.ayo.orderprocessing.ProcessOrderRequest,
              com.ayo.orderprocessing.ProcessOrderResponse>(
                service, METHODID_STREAM_PROCESS_ORDERS)))
        .build();
  }

  private static abstract class OrderProcessingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderProcessingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ayo.orderprocessing.OrderProcessingServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderProcessingService");
    }
  }

  private static final class OrderProcessingServiceFileDescriptorSupplier
      extends OrderProcessingServiceBaseDescriptorSupplier {
    OrderProcessingServiceFileDescriptorSupplier() {}
  }

  private static final class OrderProcessingServiceMethodDescriptorSupplier
      extends OrderProcessingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrderProcessingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrderProcessingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderProcessingServiceFileDescriptorSupplier())
              .addMethod(getProcessOrderMethod())
              .addMethod(getStreamProcessOrdersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
