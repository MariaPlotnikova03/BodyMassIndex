public class BodyMassIndexService {
    public double calculate(int weight, double height) {
        double index = weight / (height * height);
        return index;
    }
}
