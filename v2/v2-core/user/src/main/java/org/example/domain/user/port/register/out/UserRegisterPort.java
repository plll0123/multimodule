package org.example.domain.user.port.register.out;

import org.example.domain.user.model.User;

public interface UserRegisterPort {

    void save(final User user);
}
