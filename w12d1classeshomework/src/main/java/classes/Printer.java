package classes;

public class Printer {

    private int sheets;
    private int tonerVolume;
    public Printer() {
        this.sheets = 0;
        this.tonerVolume = 20;
    }

    public void addSheet(int num){
        this.sheets += num;
    }

    public int getNumberOfSheets(){
        return this.sheets;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }
    public int print(int nrOfPages,int nrOfCopies) {
        int total = nrOfPages * nrOfCopies;
        int remaining = total;
        if (this.sheets > 0) {
            for (int i = 0; i < total; i++) {
                this.sheets -= 1;
                this.tonerVolume -= 1;
                remaining-=1;
            }
        }
        return remaining;
    }
}