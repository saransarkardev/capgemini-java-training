package test;

class Main {
    public static void show() {
        System.out.println("Show main");
    }
}


class Test extends Main{
    public static void show() {
        System.out.println("Show test");
    }
    public static void main(String[] args) {
       Main obj = new Test();
       obj.show();
    }
}
