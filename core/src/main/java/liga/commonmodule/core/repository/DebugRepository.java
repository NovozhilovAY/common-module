package liga.commonmodule.core.repository;

import liga.commonmodule.core.model.DebugRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebugRepository extends JpaRepository<DebugRecord, String> {
}
