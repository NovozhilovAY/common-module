package liga.commonmodule.core.repository;

import liga.commonmodule.core.model.ExceptionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionRepository extends JpaRepository<ExceptionRecord, String> {
}
