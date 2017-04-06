package gof.structural.decorator_synthetic;

public class Client {
    public void doSomeUseful() {
        
        Glass plain = new PlainGlass("4M1");
        Glass chamfered = new ChamferedGlass(new PlainGlass("6M1"), 1);
        Glass temperedAndChamfered1 = new ChamferedGlass(new TemperedGlass(new PlainGlass("6M1")),1);
        Glass temperedAndChamfered2 = new TemperedGlass(new ChamferedGlass(new PlainGlass("10M1"),2));
        
        plain.postprocess();
        System.out.println();
        chamfered.postprocess();
        System.out.println();
        temperedAndChamfered1.postprocess();
        System.out.println();
        temperedAndChamfered2.postprocess();
    }
}
