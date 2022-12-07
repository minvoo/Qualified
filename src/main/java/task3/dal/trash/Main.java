package task3.dal.trash;

public class Main {


    public static void main(String[] args) {

        Zwierze kotek = new Kot() {
            @Override
            void drapMeble() {
                System.out.println("Draping");
            }
        };
        kotek.dajGlos();




    }
}
