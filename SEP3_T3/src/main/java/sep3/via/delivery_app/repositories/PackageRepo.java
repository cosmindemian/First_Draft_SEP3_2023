package sep3.via.delivery_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sep3.via.delivery_app.model.Package;

@Repository
public interface PackageRepo extends JpaRepository<Package, Long> {
}
