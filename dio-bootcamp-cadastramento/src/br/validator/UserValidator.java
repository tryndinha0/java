package br.validator;

import br.exception.ValidatorException;
import br.model.UserModel;

public class UserValidator {
    private UserValidator() {

    }

    public static void verifyModel(final UserModel model) throws ValidatorException {
        if (stringIsBlank(model.getNome()))
            throw new ValidatorException("Informe um nome válido") ;
        if (model.getNome().length() <=1)
            throw new ValidatorException("Informe um nome com mais de 1 caracter") ;
        if (stringIsBlank(model.getEmail()))
            throw new ValidatorException("Informe um email válido") ;
        if ((!model.getEmail().contains("@")) && (!model.getEmail().contains(".")))
            throw new ValidatorException("Informe um email válido");
        
    }

    private static boolean stringIsBlank(final String value) {
        return value == null || value.isBlank();
    }

}
