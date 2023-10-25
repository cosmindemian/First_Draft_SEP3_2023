using System.Text.Json;
using Client.ClientInterfaces;
using Domain.DTO;
using Domain.Models;
using Domain.Models.Location;

namespace Client.ClientImplementations;

public class PackageHttpClient :IPackageService
{
    private readonly HttpClient client;

    public PackageHttpClient(HttpClient client)
    {
        this.client = client;
    }
    public async Task<Package> GetPackageByIdAsync(long id)
    {
        HttpResponseMessage response = await client.GetAsync($"/packages/{id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        //use var (packageDTO)
        var packageDTO = JsonSerializer.Deserialize<PackageGetDTO>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        Customer sender = new Customer(packageDTO.SenderName);
        Address receiverAddress = new Address(packageDTO.ReceiverAddress.Street, packageDTO.ReceiverAddress.Number,
            packageDTO.ReceiverAddress.City);
        Address lastKnowLocation = new Address("Kabelikova", 3, "Prerov");

        Package package = new Package(packageDTO.Weight, sender, lastKnowLocation, receiverAddress);
        return package;
    }
}