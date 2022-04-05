package _14_Encapsulation;

public class Araba {//POJO :planing old java object--modal class
 private   String model;
    private   String renk;
    private   int motor;
    private  int yil;
public  Araba(){

}
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
    if (motor<1000){
        System.out.println("agam bizimle eglenir");
        this.motor=1200;

    }else {

    }
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
    if (yil<0){
        this.yil=(-1)*yil;
        System.out.println("agam nisledinggg m.o araba vadi biz mi binmedik");
    }else {

    }
        this.yil = yil;
    }

    @Override
    public String toString() {//bu meth bu classtan create edilen obj field stringe cevirir
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }

    public Araba(int motor, int yil) {//p li
        this.motor = motor;
        this.yil = yil;
    }

    public Araba(String model, String renk, int motor, int yil) {//pli const
        this.model = model;
        this.renk = renk;
       // this.motor = motor;
      //  this.yil = yil;
        setMotor(motor);//cons
        setYil(yil);



        }

        }



