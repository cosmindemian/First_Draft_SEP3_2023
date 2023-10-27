package sep3.via.delivery_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import sep3.via.delivery_app.model.Package;

@Repository
public interface PackageRepo extends JpaRepository<Package, Long> {
}
