public class Main {

    public static void main(String[] args) {
        SearchForText stringProcessor = new SearchForText();
        stringProcessor.readInput();
        stringProcessor.findMatch();
        stringProcessor.showResults();
    }
}
