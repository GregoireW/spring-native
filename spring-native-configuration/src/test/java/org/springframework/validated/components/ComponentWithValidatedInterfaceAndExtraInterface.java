package org.springframework.validated.components;

import org.springframework.stereotype.Component;

@Component
public class ComponentWithValidatedInterfaceAndExtraInterface implements ValidatedInterface, VoidInterface {

    @Override
    public void foo() {

    }

}
