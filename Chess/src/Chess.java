public class Chess {
    public static void main(String[] args) {
        String gap = "   ";
        String[] letters = {"H", "G", "F", "E", "D", "С", "B", "A"};

    for (int i = 0; i < 8; i ++){
        for (int j = 0; j < 8; j ++){
            System.out.print(i + 1 + letters[j] + gap);

        }
        System.out.println();
        System.out.println(gap);
    }

    }
}
