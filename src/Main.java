public class Main {
    public static class MainV6 {
        public static <limit> void main(String[] args) {
            boolean registered = true;
            int percent = registered ? 1000 : 100;
            long amount = 1100;
            long bonus = amount / percent ;
            long limit = 1000;
            if (bonus > limit) {
                bonus = limit;
            }
            System.out.println(bonus);
        }
    }
}





