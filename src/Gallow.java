public class Gallow {
    public static void showGallows(int mistakes) {
        System.out.println("==============");
        System.out.println("||           " + (mistakes > 0 ? "|" : ""));
        System.out.println("||           " + (mistakes > 1 ? "O" : ""));
        System.out.println("||          " + (mistakes > 2 ? "/" : "") + (mistakes > 3 ? "|" : "") + (mistakes > 4 ? "\\" : ""));
        System.out.println("||         " + (mistakes > 2 ? "/" : "") + (mistakes > 3 ? " | " : "") + (mistakes > 4 ? "\\" : ""));
        System.out.println("||          " + (mistakes > 5 ? "/" : "") + (mistakes > 6 ? " \\" : ""));
        System.out.println("||         " + (mistakes > 5 ? "/" : "") + (mistakes > 6 ? "   \\" : ""));
        System.out.println("||");
        System.out.println("==================");
    }
}
