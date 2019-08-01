package chapter1.node8.interfaceE10;

public abstract class Item {
    String name;
    int price;

    public abstract boolean disposable();

    public static void main(String[] args) {
        Item item = new Item(){

            @Override
            public boolean disposable() {
                return false;
            }
        };
        System.out.println(item.disposable());

    }
}
