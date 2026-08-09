class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        char[] asArray = identifier.toCharArray();

        for (int i = 0; i < asArray.length; i++) {
            if (Character.isWhitespace(asArray[i])) {
                builder.append('_');
                continue;
            } 
            
            else if (asArray[i] == '-') {
                builder.append(Character.toUpperCase(asArray[i+1]));
                i++;
                continue;
            }

            else if (Character.isDigit(asArray[i])) {
                switch (asArray[i]) {
                    case '4':
                        builder.append('a');
                        break;
                    case '3':
                        builder.append('e');
                        break;
                    case '0':
                        builder.append('o');
                        break;
                    case '1':
                        builder.append('l');
                        break;
                    case '7':
                        builder.append('t');
                        break;
                }
                continue;
            }

            else if (!Character.isLetter(asArray[i])) {
                continue;
            }
            
            builder.append(asArray[i]);
        }

        String builtString = builder.toString();

        return builtString;
        
        // throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
    }
}
