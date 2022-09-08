

public class Homew2 {
    static int get_triangle_number(int rows) {

        // Простой цикл.
        // int result = 0;
        // for (int i=0; i<=rows; i++) {
        //     result += i;
        // }
        // return result;

        // Решение с рекурсией.
            if (rows == 1) {
                return 1;
            } else {
                return rows + get_triangle_number(rows-1);
            }

        // Просто формула. ))

        // return (rows*(rows+1))/2;
    }

    public static void main(String[] args) {
        System.out.println(get_triangle_number(15));
    }
}
