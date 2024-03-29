package chapter1.node8.interfaceE10;

public class Hero1 {
    public String name;
    protected float hp;

    private static void battleWin(){
        System.out.println("battle win");
    }

    //敌方的水晶
    static class EnemyCrystal{
        int hp=5000;

        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
                Hero1.battleWin();

                //静态内部类不能直接访问外部类的对象属性
//                System.out.println(name + " win this game");
            }
        }
    }

    public static void main(String[] args) {
        //实例化静态内部类
        Hero1.EnemyCrystal crystal = new Hero1.EnemyCrystal();
        crystal.checkIfVictory();
    }
}
