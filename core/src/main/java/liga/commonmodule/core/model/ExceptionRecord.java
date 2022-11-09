package liga.commonmodule.core.model;

import liga.medical.dto.enums.SystemType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exception")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExceptionRecord {
    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "system_type_id")
    private SystemType systemType;

    @Column(name = "method_params")
    private String methodParams;
}
