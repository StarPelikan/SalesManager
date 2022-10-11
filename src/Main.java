public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{12,68,35,54});
        //salesManager.max();
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.averageSales());
    }
}