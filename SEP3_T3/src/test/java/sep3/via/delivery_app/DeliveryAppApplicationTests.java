package sep3.via.delivery_app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sep3.via.delivery_app.model.Package;
import sep3.via.delivery_app.repositories.PackageRepo;

@SpringBootTest
class DeliveryAppApplicationTests {

	@Autowired
	PackageRepo packageRepo;
	@Test
	void contextLoads() {
		Package dto =packageRepo.findById(1L).orElse(null);
		System.out.println(dto);
	}

}
