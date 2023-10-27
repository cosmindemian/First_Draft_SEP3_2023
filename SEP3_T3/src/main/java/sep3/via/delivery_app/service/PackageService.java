package sep3.via.delivery_app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sep3.via.delivery_app.model.dto.PackageGetDTO;
import sep3.via.delivery_app.repositories.PackageRepo;

@Service
@RequiredArgsConstructor
public class PackageService {

    private final PackageRepo packageRepo;

    public PackageGetDTO getPackageById(Long id) {
        return new PackageGetDTO(packageRepo.findById(id).orElseThrow());
    }

}
