import javax.security.auth.login.AppConfigurationEntry;

public class Printer {

    String queue = "";
    int pagesAmount;



    public Printer() {
        queue = "Список документов на печать:";
    }

    public void append(String textDoc, String nameDoc, int pagesAmount) {
        this.pagesAmount = pagesAmount;
        queue = queue + "\n" + textDoc + "\n" + nameDoc + "\n" + pagesAmount + " стр" + "\n";
        int pendingPagesCount =  pagesAmount;
        System.out.println("страниц в очереди = " + pendingPagesCount);
    }

    public void append(String textDoc, String nameDoc) {
        append(textDoc, nameDoc, 1);
    }




    public void print() {
        System.out.println(queue);

        clear();
        System.out.println("страниц напечатано = " + pagesAmount);
}

    public void clear() {
        queue = "обнулился счётчик очереди";
    }


}
