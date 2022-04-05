package _14_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda =new Araba();//p siz obj creat ettik sonra elle girdik
        honda.setModel("accord");
        honda.setYil(2018);
        honda.setMotor(1600);
        honda.setRenk("kirmizi");


        Araba toyota= new Araba("avensis","beyaz",2000,2020);
        Araba volvo= new Araba("s80","füme",2400,2010);
        Araba haciMurat=new  Araba(1200,1974);//2 parametreli
        System.out.println("honda "+honda);//tostring meth olmaz ise bu obje referans degeri print eder
        System.out.println("volvo:"+volvo);
        System.out.println("modeli:"+toyota.getModel()+"renk:"+toyota.getRenk()+" motorgucu:"+toyota.getMotor());

    }
}
