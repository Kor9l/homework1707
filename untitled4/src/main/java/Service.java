import java.util.Scanner;

public class Service {
    static  void age(){
        System.out.println("Введите дату рождения");
        var scanner = new Scanner(System.in);

        var bdDate = scanner.nextInt();
        try {
            if (bdDate<0){
              throw   new UncheckedException("Дата не может быть отрицательной");

            }
            if (bdDate>150){
               throw  new CheckedExcaption("Люди не живут больше 150лет");
            }
        } catch (CheckedExcaption e) {
            e.printStackTrace();
        }

    }
    static String gender(){
        var scanner = new Scanner(System.in);
        String gender =scanner.nextLine();
        if (gender!="M"|gender!="F") {
            throw new UncheckedException("Wrong gender");
        }
        return gender;
    }
}
