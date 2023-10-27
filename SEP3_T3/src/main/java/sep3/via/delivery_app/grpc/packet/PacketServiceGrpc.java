package sep3.via.delivery_app.grpc.packet;

import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import sep3.via.delivery_app.Grpc;
import sep3.via.delivery_app.model.Package;
import sep3.via.delivery_app.repositories.PackageRepo;

@RequiredArgsConstructor
@GrpcService
public class PacketServiceGrpc extends PackageGrpc.PackageImplBase {

    private final PackageRepo packetRepo;

    @Override
    public void getPackage(Grpc.PackageRequest request,
                           io.grpc.stub.StreamObserver<Grpc.PackageGetDTO> responseObserver) {
        Long id = request.getId();
        System.out.println(id);
        Package packet = packetRepo.findById(id).orElse(null);
        Grpc.AddressGetDTO addressDto = Grpc.AddressGetDTO.newBuilder().
                setCity(packet.getReceiverAddress().getCity().getName())
                .setId(packet.getReceiverAddress().getId())
                .setStreet(packet.getReceiverAddress().getStreet())
                .setZipCode(packet.getReceiverAddress().getCity().getZipCode())
                .build();
        Grpc.PackageGetDTO dto = Grpc.PackageGetDTO.newBuilder()
                .setId(packet.getId())
                .setWeight(packet.getWeight())
                .setSenderId(packet.getSender().getId())
                .setReceiverName(packet.getReceiver().getName())
                .setSenderName(packet.getSender().getName())
                .setReceiverAddress(addressDto)
                .build();
        responseObserver.onNext(dto);
        responseObserver.onCompleted();
    }


}
