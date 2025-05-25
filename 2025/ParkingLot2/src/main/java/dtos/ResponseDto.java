package dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
public class ResponseDto {
    private ResponseStatus status;
    private String errorMsg;

    public ResponseDto(ResponseStatus status, String errorMsg) {
        this.status = status;
        this.errorMsg = errorMsg;
    }
}
