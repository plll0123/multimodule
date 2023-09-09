package org.example.domain.member;

import java.util.Optional;
import java.util.regex.Pattern;

public class DomainValueObject {

    protected boolean validRegxp(Pattern pattern, String target) {
        return pattern.matcher(target).matches();
    }
}
