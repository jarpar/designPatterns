package strategy.exercise;

public class ModuloStrategy implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a % b;
    }
}