package tecno.nosql2023.model.excepcionHandler;

import org.springframework.http.HttpStatus;

public class ExcepcionCustom extends RuntimeException {
    private final HttpStatus httpStatus;

    public ExcepcionCustom(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
