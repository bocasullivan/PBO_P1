package TPraktikum5;

abstract class sepatu {
    private double pjgTelapak;

    sepatu(double pjgTelapak){
        this.pjgTelapak = pjgTelapak;
    }
    public void setPjgTelapak(double pjgTelapak){
        this.pjgTelapak = pjgTelapak;
    }

    public double getPT(){
        return this.pjgTelapak;
    }
    public abstract double hasilEU();
    public abstract double hasilUK();
}

class ukuranSepatu extends sepatu {
    public ukuranSepatu (double pjgTelapak){
        super (pjgTelapak);
    }

    public double hasilEU(){
        return (super.getPT() + 16);
    }

    public double hasilUK(){
        return (super.getPT() - 17.5);
    }
}
