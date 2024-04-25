package Model;

import java.io.Serializable;

import static Model.JustScanner.Scan;

public class Coordinates implements Serializable { // Класс для координат
    private int x;
    private float y; //Поле не может быть null
    public Coordinates(){
        while(true){
            try{
                System.out.print("Введите (int)х: ");
                x = Integer.parseInt(Scan());
                break;
            }catch(NumberFormatException e){
                System.out.println("Надо ввести значение int!");
            }
        }

        while(true){
            try{
                System.out.print("Введите (Float)y: ");
                y = Float.parseFloat(Scan());
                break;
            }catch(NumberFormatException e){
                System.out.println("Надо ввести значение Float!");
            }
        }


    }
    @Override
    public String toString(){
        return ("x: "+String.valueOf(x)+", y: "+String.valueOf(y));
    }
}
