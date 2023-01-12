public class Main {

    public static void main(String[] args) {

        Addition add = new Addition();
        System.out.println(add.calc(5,6));



    }


    public interface Operations{

        int a = 0;
        int b =0;

        public abstract int calc(int a, int b);
    }


    public static class Addition implements Operations{


        @Override
        public int calc(int a, int b) {
            return a+b;

        }
    }

    public static class Subtraction implements Operations{


        @Override
        public int calc(int a, int b) {
            return a-b;

        }
    }

}
