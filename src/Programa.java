import org.w3c.dom.ls.LSOutput;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class Programa
{


    public static void main(String[] args)
    {
        // Duomenutipas kintamojoVardas = reiksme;

        byte maziausias = 120;              // -127 iki 127
        short truputiDidesnis = 10000;      // nuo -32768 iki 32767
        int populiariausias = Integer.MAX_VALUE;   // nuo -2^31 iki +2^31
        long didziausias = Long.MAX_VALUE;  // nuo -2^63 iki 2^63

        // Isvesti tuos kintamuosisu i konsole:

        System.out.println("didziausias" + didziausias);
        System.out.println(populiariausias);
        System.out.println("asilo berete");
        System.out.println("true");
        System.out.println("-----------------------");



        // Realieji kintamieji (skaiciai su kableliais)
        float maziauTikslesnis = 0.35f;             //32 bit tisklusmo, retai naudojamas;
        double labiauTikslesnis = 0.35;             //64 bit tikslumo, naudojamas dazniausiai;

        System.out.println(maziauTikslesnis);
        System.out.println(labiauTikslesnis);
        System.out.println("-----------------------");

        // Tekstiniai kintamieji (char ir string);
        char raide = 'r';                           //char su viengubom kabutem ''''''';
        String zodis = "bla bla bla";               //string su dvigubom kabutem """""";  ---- String reikia rasyti is didziosios -String- !


        System.out.println(raide);
        System.out.println(zodis);
        System.out.println("Bandymas isvesti");



        System.out.println("-----------------------");

        // automatinis konvertavimas is mazesnio duomenu tipo i didesni;

        byte x = 25;
        int y = x + 5;

        // priverstinis konvertavimas is didesnio i mazesni;

        int mazesnis = 84;
        int didesnis = 123512;

        short mazesnisShort = (short)mazesnis;
        short didesnisShort = (short)didesnis;

        System.out.println("didesnis = " + didesnis + "didesnisShort =" + didesnisShort);
        System.out.println("mazesnis = " + mazesnis + "mazesnisShort =" + mazesnisShort);


        // trecias konvertavimas naudojant funkcijas
        String tekstinisSkaicius = "2458";
        int konvertuotasSkaicius = Integer.parseInt(tekstinisSkaicius);
        // int konvertuotasShort = Short.parseInt(tekstinisSkaicius);

        // System.out.println(konvertuotasShort + "didesnisShort =" + didesnisShort);
        System.out.println("mazesnis = " + mazesnis + "mazesnisShort =" + mazesnisShort);
        System.out.println("mazesnis = " + mazesnis + "mazesnisShort =" + mazesnisShort);
        System.out.println("mazesnis = " + mazesnis + "mazesnisShort =" + mazesnisShort); // control+d



    }
}
