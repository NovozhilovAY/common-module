package liga.commonmodule.core.api;

import liga.medical.dto.dto.DebugDto;
import liga.medical.dto.dto.ExceptionDto;

public interface LogService {
    void logDebug(DebugDto debugDto);

    void logException(ExceptionDto exceptionDto);
}
