public class Chess {
    //Создать программу для раскраски шахматной доски с помощью цикла.
    //Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
    //циклам значения B(Black) или W(White)
    public static void main(String[] args) {
        // Задаем размеры шахматной доски
        int boardSize = 8;

        // Создаем двумерный массив строк
        String[][] chessboard = new String[boardSize][boardSize];

        // Заполняем массив значениями "B" и "W" в зависимости от позиции
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if ((i + j) % 2 == 0) {
                    chessboard[i][j] = "W"; // Белая клетка
                } else {
                    chessboard[i][j] = "B"; // Черная клетка
                }
            }
        }

        // Выводим шахматную доску
        System.out.println("Шахматная доска:");

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }
}