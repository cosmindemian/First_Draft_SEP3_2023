namespace Domain.DTO;

public class AddressDTO
{
    public long Id;
    public string Street;
    public string City;
    public short Number;
    public string ZipCode;

    public AddressDTO(long id, string street, string city, short number, string zipCode)
    {
        Id = id;
        Street = street;
        City = city;
        Number = number;
        ZipCode = zipCode;
    }
}