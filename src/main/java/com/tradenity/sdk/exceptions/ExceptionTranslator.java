package com.tradenity.sdk.exceptions;

import com.tradenity.sdk.client.TradenityClient;
import com.tradenity.sdk.exceptions.messages.ApiError;
import com.tradenity.sdk.exceptions.messages.ErrorMessage;

public class ExceptionTranslator {
    private TradenityClient client;

    public ExceptionTranslator(TradenityClient client) {
        this.client = client;
    }

    public RequestErrorException createErrorException(int statusCode, ErrorMessage err) {
        if (statusCode == 500) {
            throw new ServerErrorException();
        } else if (statusCode == 401) {
            if (client.getSessionTokenStore().hasToken()) {
                return new SessionExpiredException(err);
            } else {
                return new AuthenticationException(err.getMessage());
            }
        } else if (statusCode == 403) {
            return new AuthorizationException(err);
        } else if (statusCode == 404) {
            return new EntityNotFoundException(err);
        } else if (statusCode == 400) {
            if (err.getErrorCode() == ApiError.DATA_VALIDATION_ERROR_CODE) {
                return new DataValidationException(err);
            }
        }
        return new RequestErrorException(err);
    }
}