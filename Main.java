public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("здесь текст про широты", "Долгие широты нашей страны", 6);
        printer.append("тут текст про авто", "Битва гигантов: отечественные против иномарок", 5);
        printer.append("тут текст о кулинарии", "Гордон Рамзи: гений или выскочка", 13);
        printer.allPagesCountInPrint();
        printer.print();
    }
}
