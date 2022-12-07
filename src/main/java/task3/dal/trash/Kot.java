package task3.dal.trash;

public abstract class Kot extends Zwierze {

    @Override
    void dajGlos() {
        System.out.println("Miau");
    }

    abstract void drapMeble();
}
