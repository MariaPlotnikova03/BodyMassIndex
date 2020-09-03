public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        int weight = 54;
        double height = 1.63;
        double index = service.calculate(weight, height);
        System.out.println("Индекс массы тела = " + index);
    }
}
