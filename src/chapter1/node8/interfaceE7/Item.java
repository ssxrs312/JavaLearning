package chapter1.node8.interfaceE7;

import javax.sound.midi.Soundbank;

public class Item {

    //重写Item的 toString(), finalize()和equals()方法
    //    toString() 返回Item的name + price
    //    finalize() 输出当前对象正在被回收
    //    equals(Object o) 首先判断o是否是Item类型，然后比较两个Item的price是否相同
    String name;
    int price;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("当前对象正在被回收");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Item){
            Item item = (Item) o;
            if (item.price == this.price){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Item i1 = new Item();
        i1.name = "红色药品";
        i1.price = 100;
        Item i2 = new Item();
        i2.name ="蓝色药品";
        i2.price = 200;
        Item i3 = new Item();
        i3.name = "紫色药品";
        i3.price = 100;

        System.out.println(i1.toString());
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
    }
}
