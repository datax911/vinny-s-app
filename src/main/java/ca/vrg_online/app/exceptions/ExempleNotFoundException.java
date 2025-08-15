package ca.vrg_online.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExempleNotFoundException extends RuntimeException {
    public ExempleNotFoundException(long id) {
        super("Could not find exemple with id " + id);
    }
}
