using Domain.Models;

namespace Client.ClientInterfaces;

public interface IPackageService
{
    Task<Package> GetPackageByIdAsync(long id);
}