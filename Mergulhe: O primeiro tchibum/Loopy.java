public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Antes do Loop");
        while (x < 4) {
            System.out.println("Dentro do loop");
            System.out.println("O valor de  x é " + x);
            x = x + 1;
        }
        System.out.println("Isso é depois do loop");
    }
}

