public class Printer {

    String queue = "";
    int pagesAmount;


    public Printer() {
        queue = "Список документов на печать:";

    }

    public void append(String textDoc, String nameDoc, int pagesAmount) {
        this.pagesAmount = pagesAmount;
        queue = queue + "\n" + textDoc + "\n" + nameDoc + "\n" + pagesAmount + " стр" + "\n";
    }

    public void append(String textDoc, String nameDoc) {
        append(textDoc, nameDoc, 1);
    }

    public int getPendingPagesCount() {
        return pagesAmount;
    }

    public int getAllPagesInPrint() {
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
