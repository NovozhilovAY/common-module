package liga.medical.dto.dto;

import liga.medical.dto.enums.MessageType;
import lombok.Data;

@Data
public class RabbitMessageDto {
    private Long id;
    private MessageType messageType;
    private String description;
}
