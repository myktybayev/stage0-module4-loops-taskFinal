package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for(int i = 1; i <= 10; i++){
            int res = i * numberTableToPrint;
            System.out.printf("%d x %d = %d\n", i, numberTableToPrint,res);
        }
    }

}
