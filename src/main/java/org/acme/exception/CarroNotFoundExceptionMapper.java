package org.acme.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CarroNotFoundExceptionMapper implements ExceptionMapper<CarroNotFoundException> {
    @Override
    public Response toResponse(CarroNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND.getStatusCode(), "Não encontrado").build();
    }
}
