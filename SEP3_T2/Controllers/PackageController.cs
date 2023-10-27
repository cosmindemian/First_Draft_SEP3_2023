using Microsoft.AspNetCore.Mvc;
using ProofOfConcept.Clients;

namespace ProofOfConcept.Controllers;

[ApiController]
[Route("[controller]")]
public class PackageController : ControllerBase
{

    private PackageService _packageService;

    public PackageController(PackageService service)
    {
        _packageService = service;

    }
    
    [HttpGet]
    public async Task<ActionResult<string>> getPackage()
    {
        return StatusCode(200, await _packageService.getPackage(1));
        
    }
}