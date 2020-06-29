package challenge_9;

public enum Brackets {
    PARENTHESES('(', ')'), SQUARE('[', ']'), CURLY('{', '}');

    private final char openingBracket;
    private final char closingBracket;

    Brackets(char openingBracket, char closingBracket) {
        this.openingBracket = openingBracket;
        this.closingBracket = closingBracket;
    }

    public char getOpeningBracket() {
        return openingBracket;
    }

    public char getClosingBracket() {
        return closingBracket;
    }

    public static char getClosingFromOpeningBracket(final char openingBracket) {
        if (openingBracket == PARENTHESES.getOpeningBracket()) {
            return PARENTHESES.getClosingBracket();
        }
        if (openingBracket == SQUARE.getOpeningBracket()) {
            return SQUARE.getClosingBracket();
        }
        if (openingBracket == CURLY.getOpeningBracket()) {
            return CURLY.getClosingBracket();
        }

        return '\u0000';
    }
}
