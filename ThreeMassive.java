import java.util.Scanner;

//Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли
public class ThreeMassive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задаем размеры трехмерного массива
        System.out.print("Введите размер по x: ");
        int xSize = scanner.nextInt();

        System.out.print("Введите размер по y: ");
        int ySize = scanner.nextInt();

        System.out.print("Введите размер по z: ");
        int zSize = scanner.nextInt();

        // Создаем трехмерный массив
        int[][][] threeDArray = new int[xSize][ySize][zSize];

        // Заполняем массив случайными значениями
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int k = 0; k < zSize; k++) {
                    threeDArray[i][j][k] = (int) (Math.random() * 100); // Пример случайных значений от 0 до 99
                }
            }
        }

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printArray(threeDArray);

        // Получаем число для увеличения элементов
        System.out.print("Введите число для увеличения элементов: ");
        int incrementValue = scanner.nextInt();

        // Увеличиваем каждый элемент на заданное число
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int k = 0; k < zSize; k++) {
                    threeDArray[i][j][k] += incrementValue;
                }
            }
        }

        // Выводим измененный массив
        System.out.println("Массив после увеличения на " + incrementValue + ":");
        printArray(threeDArray);
    }

    // Метод для вывода трехмерного массива
    private static void printArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

