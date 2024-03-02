
class Function_Overloading {
    public static void main(String[] args) {
    //    int ans=fun(32323);
        System.out.println(fun(32323));
        fun("Ayush");
    }

    static int fun(int a){
    //    System.out.println(a);
        return a;
    }
    
    static void fun(String name){
        System.out.println();
        System.out.println();
        System.out.println(name);
    }
}
