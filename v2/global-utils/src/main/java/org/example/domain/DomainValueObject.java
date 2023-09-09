package org.example.domain;

import java.util.regex.Pattern;

public class DomainValueObject {

    protected boolean doesntMatch(Pattern pattern, String target) {
        return !pattern.matcher(target).matches();
    }
}
