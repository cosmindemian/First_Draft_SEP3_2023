using Domain.DTO;
using Grpc.Net.Client;

namespace ProofOfConcept.Clients;

public class PackageService
{

    public PackageService()
    {
        
    }
    public async Task<PackageDTO> getPackage(long id)
    { 
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        var client = new Package.PackageClient(channel);

        var request = new PackageRequest();
        request.Id = id;
        Console.WriteLine(request.Id);
        var response = await client.getPackageAsync(request);
        AddressDTO receiverAddress = new AddressDTO(response.Id, response.ReceiverAddress.Street, response.ReceiverAddress.City,
            1,response.ReceiverAddress.ZipCode);
        PackageDTO package = new PackageDTO(response.SenderId,response.Weight, response.Id, response.Status, response.SenderName, response.ReceiverName, receiverAddress);
        //Console.WriteLine(response.Message);
        return package;
    }

}