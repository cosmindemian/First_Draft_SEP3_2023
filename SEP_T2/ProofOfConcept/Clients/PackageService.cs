using Grpc.Net.Client;

namespace ProofOfConcept.Clients;

public class PackageService
{

    public PackageService()
    {
        
    }
    public async Task<string> getPackage(long id)
    { 
        var channel = GrpcChannel.ForAddress("http://localhost:9090");
        var client = new Package.PackageClient(channel);

        var request = new PackageRequest();
        request.Id = id;
        Console.WriteLine(request.Id);
        var response = await client.getPackageAsync(request);
        Console.WriteLine(response.Message);
        return "hello";
    }

}