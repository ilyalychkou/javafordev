package lesson3.task3;

public class FigureRunner {
    public static void main(String[] args) {
        Figure figure1 = new Circle();
        Figure figure2 = new Square();

        figure1.printInfo();
        figure1.draw();
        figure2.printInfo();
        figure2.draw();
    }
}
