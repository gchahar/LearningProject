class parent{
    void method(){
        System.out.println("inside subclass");
    }
}
class subclass extends parent{
    void method(){
        System.out.println("outside subclass");
    }

    public static void main(String[] args) {
        parent a =  new subclass(); //upcasting
        a.method();

        subclass b = (subclass)a;
    }
}