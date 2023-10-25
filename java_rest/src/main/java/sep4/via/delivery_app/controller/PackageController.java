package sep4.via.delivery_app.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sep4.via.delivery_app.model.Package;
import sep4.via.delivery_app.model.dto.PackageGetDTO;
import sep4.via.delivery_app.service.PackageService;

@RestController
@RequestMapping("/package")
public class PackageController {

    public PackageController(PackageService packageService) {
        this.packageService = packageService;
    }

    private final PackageService packageService;
    @GetMapping("/{id}")
    public ResponseEntity<PackageGetDTO> getPackage(@PathVariable Long id) {
        return new ResponseEntity<>(packageService.getPackageById(id), HttpStatusCode.valueOf(200));
    }
}
