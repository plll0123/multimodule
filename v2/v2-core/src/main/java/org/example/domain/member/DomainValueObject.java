package org.example.domain.member;

import java.util.regex.Pattern;

public class DomainValueObject {

    protected boolean doesntMatch(Pattern pattern, String target) {
        return !pattern.matcher(target).matches();
    }
}
