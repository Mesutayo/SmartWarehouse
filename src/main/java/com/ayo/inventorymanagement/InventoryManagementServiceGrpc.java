package com.ayo.inventorymanagement;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: InventoryManagementservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventoryManagementServiceGrpc {

  private InventoryManagementServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.ayo.inventorymanagement.InventoryManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ayo.inventorymanagement.GetStockLevelsRequest,
      com.ayo.inventorymanagement.GetStockLevelsResponse> getGetStockLevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStockLevels",
      requestType = com.ayo.inventorymanagement.GetStockLevelsRequest.class,
      responseType = com.ayo.inventorymanagement.GetStockLevelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ayo.inventorymanagement.GetStockLevelsRequest,
      com.ayo.inventorymanagement.GetStockLevelsResponse> getGetStockLevelsMethod() {
    io.grpc.MethodDescriptor<com.ayo.inventorymanagement.GetStockLevelsRequest, com.ayo.inventorymanagement.GetStockLevelsResponse> getGetStockLevelsMethod;
    if ((getGetStockLevelsMethod = InventoryManagementServiceGrpc.getGetStockLevelsMethod) == null) {
      synchronized (InventoryManagementServiceGrpc.class) {
        if ((getGetStockLevelsMethod = InventoryManagementServiceGrpc.getGetStockLevelsMethod) == null) {
          InventoryManagementServiceGrpc.getGetStockLevelsMethod = getGetStockLevelsMethod =
              io.grpc.MethodDescriptor.<com.ayo.inventorymanagement.GetStockLevelsRequest, com.ayo.inventorymanagement.GetStockLevelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStockLevels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.inventorymanagement.GetStockLevelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.inventorymanagement.GetStockLevelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryManagementServiceMethodDescriptorSupplier("GetStockLevels"))
              .build();
        }
      }
    }
    return getGetStockLevelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ayo.inventorymanagement.UpdateStockRequest,
      com.ayo.inventorymanagement.UpdateStockResponse> getUpdateStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStock",
      requestType = com.ayo.inventorymanagement.UpdateStockRequest.class,
      responseType = com.ayo.inventorymanagement.UpdateStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ayo.inventorymanagement.UpdateStockRequest,
      com.ayo.inventorymanagement.UpdateStockResponse> getUpdateStockMethod() {
    io.grpc.MethodDescriptor<com.ayo.inventorymanagement.UpdateStockRequest, com.ayo.inventorymanagement.UpdateStockResponse> getUpdateStockMethod;
    if ((getUpdateStockMethod = InventoryManagementServiceGrpc.getUpdateStockMethod) == null) {
      synchronized (InventoryManagementServiceGrpc.class) {
        if ((getUpdateStockMethod = InventoryManagementServiceGrpc.getUpdateStockMethod) == null) {
          InventoryManagementServiceGrpc.getUpdateStockMethod = getUpdateStockMethod =
              io.grpc.MethodDescriptor.<com.ayo.inventorymanagement.UpdateStockRequest, com.ayo.inventorymanagement.UpdateStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.inventorymanagement.UpdateStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.inventorymanagement.UpdateStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryManagementServiceMethodDescriptorSupplier("UpdateStock"))
              .build();
        }
      }
    }
    return getUpdateStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ayo.inventorymanagement.AddProductRequest,
      com.ayo.inventorymanagement.AddProductResponse> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProduct",
      requestType = com.ayo.inventorymanagement.AddProductRequest.class,
      responseType = com.ayo.inventorymanagement.AddProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ayo.inventorymanagement.AddProductRequest,
      com.ayo.inventorymanagement.AddProductResponse> getAddProductMethod() {
    io.grpc.MethodDescriptor<com.ayo.inventorymanagement.AddProductRequest, com.ayo.inventorymanagement.AddProductResponse> getAddProductMethod;
    if ((getAddProductMethod = InventoryManagementServiceGrpc.getAddProductMethod) == null) {
      synchronized (InventoryManagementServiceGrpc.class) {
        if ((getAddProductMethod = InventoryManagementServiceGrpc.getAddProductMethod) == null) {
          InventoryManagementServiceGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<com.ayo.inventorymanagement.AddProductRequest, com.ayo.inventorymanagement.AddProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.inventorymanagement.AddProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ayo.inventorymanagement.AddProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryManagementServiceMethodDescriptorSupplier("AddProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryManagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryManagementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryManagementServiceStub>() {
        @java.lang.Override
        public InventoryManagementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryManagementServiceStub(channel, callOptions);
        }
      };
    return InventoryManagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryManagementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryManagementServiceBlockingStub>() {
        @java.lang.Override
        public InventoryManagementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryManagementServiceBlockingStub(channel, callOptions);
        }
      };
    return InventoryManagementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryManagementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryManagementServiceFutureStub>() {
        @java.lang.Override
        public InventoryManagementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryManagementServiceFutureStub(channel, callOptions);
        }
      };
    return InventoryManagementServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStockLevels(com.ayo.inventorymanagement.GetStockLevelsRequest request,
        io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.GetStockLevelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStockLevelsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.UpdateStockRequest> updateStock(
        io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.UpdateStockResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateStockMethod(), responseObserver);
    }

    /**
     */
    default void addProduct(com.ayo.inventorymanagement.AddProductRequest request,
        io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.AddProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InventoryManagementService.
   */
  public static abstract class InventoryManagementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InventoryManagementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InventoryManagementService.
   */
  public static final class InventoryManagementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InventoryManagementServiceStub> {
    private InventoryManagementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryManagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryManagementServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStockLevels(com.ayo.inventorymanagement.GetStockLevelsRequest request,
        io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.GetStockLevelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStockLevelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.UpdateStockRequest> updateStock(
        io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.UpdateStockResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getUpdateStockMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void addProduct(com.ayo.inventorymanagement.AddProductRequest request,
        io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.AddProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InventoryManagementService.
   */
  public static final class InventoryManagementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InventoryManagementServiceBlockingStub> {
    private InventoryManagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryManagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ayo.inventorymanagement.GetStockLevelsResponse getStockLevels(com.ayo.inventorymanagement.GetStockLevelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStockLevelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ayo.inventorymanagement.AddProductResponse addProduct(com.ayo.inventorymanagement.AddProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InventoryManagementService.
   */
  public static final class InventoryManagementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InventoryManagementServiceFutureStub> {
    private InventoryManagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryManagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryManagementServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ayo.inventorymanagement.GetStockLevelsResponse> getStockLevels(
        com.ayo.inventorymanagement.GetStockLevelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStockLevelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ayo.inventorymanagement.AddProductResponse> addProduct(
        com.ayo.inventorymanagement.AddProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STOCK_LEVELS = 0;
  private static final int METHODID_ADD_PRODUCT = 1;
  private static final int METHODID_UPDATE_STOCK = 2;

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
        case METHODID_GET_STOCK_LEVELS:
          serviceImpl.getStockLevels((com.ayo.inventorymanagement.GetStockLevelsRequest) request,
              (io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.GetStockLevelsResponse>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.ayo.inventorymanagement.AddProductRequest) request,
              (io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.AddProductResponse>) responseObserver);
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
        case METHODID_UPDATE_STOCK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateStock(
              (io.grpc.stub.StreamObserver<com.ayo.inventorymanagement.UpdateStockResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetStockLevelsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ayo.inventorymanagement.GetStockLevelsRequest,
              com.ayo.inventorymanagement.GetStockLevelsResponse>(
                service, METHODID_GET_STOCK_LEVELS)))
        .addMethod(
          getUpdateStockMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.ayo.inventorymanagement.UpdateStockRequest,
              com.ayo.inventorymanagement.UpdateStockResponse>(
                service, METHODID_UPDATE_STOCK)))
        .addMethod(
          getAddProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ayo.inventorymanagement.AddProductRequest,
              com.ayo.inventorymanagement.AddProductResponse>(
                service, METHODID_ADD_PRODUCT)))
        .build();
  }

  private static abstract class InventoryManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ayo.inventorymanagement.InventoryManagementServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryManagementService");
    }
  }

  private static final class InventoryManagementServiceFileDescriptorSupplier
      extends InventoryManagementServiceBaseDescriptorSupplier {
    InventoryManagementServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryManagementServiceMethodDescriptorSupplier
      extends InventoryManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InventoryManagementServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InventoryManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryManagementServiceFileDescriptorSupplier())
              .addMethod(getGetStockLevelsMethod())
              .addMethod(getUpdateStockMethod())
              .addMethod(getAddProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
