public class Printer {

    String queue = "";
    int pagesAmount;


    public Printer() {
        queue = "Список документов на печать:";

    }

    public void append(String textDoc, String nameDoc, int pagesAmount) {
        queue = queue + "\n" + textDoc + "\n" + nameDoc + "\n" + pagesAmount + " стр" + "\n";
    }

    public void append(String textDoc, String nameDoc) {
        queue = queue + "\n" + textDoc + "\n" + nameDoc + "\n";
    }

    public void append(String textDoc) {
        queue = queue + "\n" + textDoc + "\n";
    }

    public int allPagesCountInPrint() {
        return pagesAmount;
    }


    public void print() {
        System.out.println(queue);
        clear();
}

    public void clear() {
        queue = "";
    }
}
