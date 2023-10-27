package sep3.via.delivery_app.grpc.packet;

import sep3.via.delivery_app.Grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PackageGrpc {

  private PackageGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Package";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Grpc.PackageRequest,
      Grpc.PackageGetDTO> getGetPackageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPackage",
      requestType = Grpc.PackageRequest.class,
      responseType = Grpc.PackageGetDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Grpc.PackageRequest,
      Grpc.PackageGetDTO> getGetPackageMethod() {
    io.grpc.MethodDescriptor<Grpc.PackageRequest, Grpc.PackageGetDTO> getGetPackageMethod;
    if ((getGetPackageMethod = PackageGrpc.getGetPackageMethod) == null) {
      synchronized (PackageGrpc.class) {
        if ((getGetPackageMethod = PackageGrpc.getGetPackageMethod) == null) {
          PackageGrpc.getGetPackageMethod = getGetPackageMethod =
              io.grpc.MethodDescriptor.<Grpc.PackageRequest, Grpc.PackageGetDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPackage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Grpc.PackageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Grpc.PackageGetDTO.getDefaultInstance()))
              .setSchemaDescriptor(new PackageMethodDescriptorSupplier("getPackage"))
              .build();
        }
      }
    }
    return getGetPackageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PackageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageStub>() {
        @java.lang.Override
        public PackageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageStub(channel, callOptions);
        }
      };
    return PackageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PackageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageBlockingStub>() {
        @java.lang.Override
        public PackageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageBlockingStub(channel, callOptions);
        }
      };
    return PackageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PackageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PackageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PackageFutureStub>() {
        @java.lang.Override
        public PackageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PackageFutureStub(channel, callOptions);
        }
      };
    return PackageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPackage(Grpc.PackageRequest request,
                            io.grpc.stub.StreamObserver<Grpc.PackageGetDTO> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPackageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Package.
   */
  public static abstract class PackageImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PackageGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Package.
   */
  public static final class PackageStub
      extends io.grpc.stub.AbstractAsyncStub<PackageStub> {
    private PackageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageStub(channel, callOptions);
    }

    /**
     */
    public void getPackage(Grpc.PackageRequest request,
                           io.grpc.stub.StreamObserver<Grpc.PackageGetDTO> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPackageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Package.
   */
  public static final class PackageBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PackageBlockingStub> {
    private PackageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageBlockingStub(channel, callOptions);
    }

    /**
     */
    public Grpc.PackageGetDTO getPackage(Grpc.PackageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPackageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Package.
   */
  public static final class PackageFutureStub
      extends io.grpc.stub.AbstractFutureStub<PackageFutureStub> {
    private PackageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PackageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PackageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Grpc.PackageGetDTO> getPackage(
        Grpc.PackageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPackageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PACKAGE = 0;

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
        case METHODID_GET_PACKAGE:
          serviceImpl.getPackage((Grpc.PackageRequest) request,
              (io.grpc.stub.StreamObserver<Grpc.PackageGetDTO>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetPackageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Grpc.PackageRequest,
              Grpc.PackageGetDTO>(
                service, METHODID_GET_PACKAGE)))
        .build();
  }

  private static abstract class PackageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PackageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Grpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Package");
    }
  }

  private static final class PackageFileDescriptorSupplier
      extends PackageBaseDescriptorSupplier {
    PackageFileDescriptorSupplier() {}
  }

  private static final class PackageMethodDescriptorSupplier
      extends PackageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PackageMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PackageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PackageFileDescriptorSupplier())
              .addMethod(getGetPackageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
