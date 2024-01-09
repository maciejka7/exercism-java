package com.exercism.learning.SqueakyClean;

public class SqueakyClean {

    public static String clean(String identifier) {
        if (identifier.length() == 0) {
            return identifier;
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char cc = identifier.charAt(i);
            if (Character.isSpaceChar(cc)) {
                str.append("_");
            } else if (Character.isISOControl(cc)) {
                str.append("CTRL");
            } else if (cc == '-') {

                if (!Character.isDigit(identifier.charAt(i + 1))) {
                    str.append(Character.toUpperCase(identifier.charAt(i + 1)));
                } else {
                    str.append("");
                }
                i++;
            }

            else if (!Character.isLetter(cc) || (cc >= 'α' && cc <= 'ω')) {
                str.append("");
            } else {
                str.append(cc);
            }

        }

        return str.toString();

    }
}
