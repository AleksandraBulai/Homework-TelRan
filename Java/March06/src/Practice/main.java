package Practice;

public class main {
    public static void main(String[] args) {
        // 01010101 - двоичная система счисления
        // 1200 - десятичная система счисления
        // от 0 до 7 - восьмеричная система счисления
        // после 9 идет (A,B,C,D,E, etc) AD9D- шестнадцатиричная система счисления
        // после двух слэшев можно записывать себе пометки
        // 123 = (1*8^2) + (2*8^1) + (3*8^0) прописываем 8, тк восмеричная система
        // 123 = 64 + 16 + 3 = 83 (123 (восьмеричной) = 83 (десятичной)

        // 123 (десятичная) переводим в восьмеричную = 173 (записываем с конца)
        // 123/8 = 15 (целая)
        // 123%8 = 3 (деление по модулю, с остатком)

        // 15/8 = 1 (целая)
        // 15%8 = 7 (остаток)

        // 1/8 = 0 (целая)
        // 1%8 = 1 (остаток)
        // деление происходит сначала на целую, потом на деление по модулю (с остатком)
        // до тех пор, пока в целом делениии не будет 0

        // 83/8 = 10
        // 83%8 = 3

        // 10/3 = 3
        // 10%3 = 1

        // 3/3 = 0
        // 3%3 = 1

        // 83 ( десятичная) = 123 (восьмеричная)



    }
}
