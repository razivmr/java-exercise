
 class deretpiramida {
    public static void main(String[] args) {
        int a, b;
        int total=0;
        for (a=1;a<=10;a++){
            for (b=1;b<=a;b++){
                total=total+b;
                if(b!=a){
                    System.out.print(b+"+");
                }
                else {
                    System.out.print(b+"=");
                }
            }
            System.out.println(total);
            total =0;
        }
    }
}
