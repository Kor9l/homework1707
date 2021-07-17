public class Main {
    public static void main(String[] args) {
        Service.age();
        try {
           var gender = Service.gender();
                   }
        catch (UncheckedException e){
            System.out.println(e.getMessage());
        }
    }
}
