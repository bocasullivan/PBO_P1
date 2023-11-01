package Latihan5;

abstract class manusia {
    private double tinggiBadan;
    private double beratBadan;

    public manusia(double TB, double BB){
        tinggiBadan = TB;
        beratBadan = BB;
    }

    public double getTB(){
        return tinggiBadan;
    }

    public double getBB(){
        return beratBadan;
    }

    public abstract double htgBBI();
    public abstract double IMT();
}

class lakilaki extends manusia {
    public lakilaki(double TB, double BB){
        super(TB, BB);
    }
    public double htgBBI(){
        return (super.getTB()-100)*0.9;
    }
    public double IMT(){
        return (super.getBB()/((super.getTB()/100) * (super.getTB()/100)));
    }
}

final class perempuan extends manusia{
    public perempuan(double TB, double BB){
        super(TB, BB);
    }

    public double htgBBI(){
        return (super.getTB()-100)*0.8;
    }
    public double IMT(){
        return (super.getBB()/((super.getTB()/100) * (super.getTB()/100)));
    }

}