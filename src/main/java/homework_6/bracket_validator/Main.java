package homework_6.bracket_validator;

public class Main {
    public static void main(String[] args) {
        BracketValidator bracketValidator = new BracketValidator();

        System.out.println(bracketValidator.isValid("({[]})"));
        System.out.println(bracketValidator.isValid("({[]}]"));
        System.out.println(bracketValidator.isValid("]}]"));

    }
}
