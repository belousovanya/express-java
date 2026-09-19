package homework_6.collection_tasks_optional.bracket_validator;

public class Main {
    public static void main(String[] args) {
        BracketValidator bracketValidator = new BracketValidator();

        System.out.println(bracketValidator.isValid("({[]})"));
        System.out.println(bracketValidator.isValid("({[]}]"));
        System.out.println(bracketValidator.isValid("]}]"));

    }
}
