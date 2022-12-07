package task3;

public class Item {
    private Integer id;
    private Integer price;

    public Item(Integer id, Integer price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    class ItemB {
        private int a;
        public int b;

    }

    public void cos () {

        ItemB itemba = new ItemB();
        itemba.a = 3;
    }
}
