import javax.security.auth.login.AppConfigurationEntry;

public class Printer {

    private String queue = "";
    private int pagesInThePrintQueue = 0;
    private int totalPrintInPagesCount = 0;

    public Printer() {
        queue = "Список документов на печать:";
    }

    public void append(String textDoc, String nameDoc, int pagesAmount) {
        queue = queue + "\n" + textDoc + "\n" + nameDoc + "\n" + pagesAmount + " стр" + "\n";
        pagesInThePrintQueue += pagesAmount;
    }

    public void append(String textDoc, String nameDoc) {
        append(textDoc, nameDoc, 1);
    }

    public void append(String textDoc) {
        append(textDoc, "Undefined", 1);
    }

    public void print() {
        System.out.println(queue);
        totalPrintInPagesCount += pagesInThePrintQueue;
        clear();
    }

    public void clear() {
        queue = "";
        pagesInThePrintQueue = 0;
    }

    public int getPendingPagesCount() {
        return pagesInThePrintQueue;
    }

    public int getTotalPrintedPages() {
        return totalPrintInPagesCount;
    }
}
