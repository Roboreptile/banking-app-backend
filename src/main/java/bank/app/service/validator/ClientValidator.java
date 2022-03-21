
package bank.app.service.validator;

import bank.app.entity.ClientEntity;

import static bank.app.api.error_handler.errors.ObjectValidationFailedException.clientValidationFailed;

public class ClientValidator {

    public static void validateClient(ClientEntity client){
        if(client.getId() == null || client.getId().equals("")) throw clientValidationFailed("Client ID is null", client);
    }
}
