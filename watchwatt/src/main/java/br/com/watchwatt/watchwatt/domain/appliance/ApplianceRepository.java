package br.com.watchwatt.watchwatt.domain.appliance;

import br.com.watchwatt.watchwatt.domain.appliance.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplianceRepository extends JpaRepository<Appliance, Long> {

        Appliance findByApplianceId(Long id);
}
