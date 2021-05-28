package joggingApp.jogs.repository;

import joggingApp.jogs.entity.JogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JogRepository extends JpaRepository<JogEntity, Long> {

}
