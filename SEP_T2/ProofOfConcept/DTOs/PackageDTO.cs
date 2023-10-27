namespace Domain.DTO;

public class PackageDTO
{
    public long SenderId { get; set; }
    public double Weight { get; set; }
    public long Id { get; set; }
    public string Status { get; set; }
    public string SenderName { get; set; }
    public string ReceiverName { get; set; }
    public AddressDTO ReceiverAddress { get; set; }

    public PackageDTO(long senderId, double weight, long id, string status, string senderName, string receiverName, AddressDTO receiverAddress)
    {
        SenderId = senderId;
        Weight = weight;
        Id = id;
        Status = status;
        SenderName = senderName;
        ReceiverName = receiverName;
        ReceiverAddress = receiverAddress;
    }
}