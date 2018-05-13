package whl;
// Импорт библиотек
import java.io.*;
import java.util.*;
// Создаем класс (главный)
// В данном классе объявим две переменные: a - инкремент. incr - для вычисл. синуса
public class wl {
    int a;
    double incr;
    void wl(){
// Цикл while. В данном цикле есть вложенное условие
// На первом этапе проверяется переменная incr. Если истина - то выводится SOP
// На втором этапе проверяется переменная incr. Если истина - то выводится SOP sqrt
        while(a<=7){
          incr = incr+1;
          if(incr==2){
              System.out.println("incr==2");
              if (incr==2){
                  System.out.println("Ответ = "+Math.sqrt(incr));
              }
          }
// Вычисление Sin
          double res = Math.sin(incr);
          System.out.println("Result = " +res);
          a++;
        }
    }
// Здесь все как обычно. Инстанциируем класс wl и вызываем метод wl
    public static void main(String[] args) {
        wl wh = new wl();
        wh.wl();
    }
}
