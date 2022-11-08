/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NABILA
 */
public class EnumMain {

    /**
     * @param args the command line arguments
     */
    enum bulan{
        Januari,
        Februari,
        Maret,
        April,
        Mei,
        Juni,
        Juli,
        Agustus,
        September,
        Oktober,
        November,
        Desember;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        bulan MonthPicked = bulan.Januari;
            switch(MonthPicked){
                case Januari:
                case Februari:
                case Maret:
                case April:
                case Mei:
                case Juni:
                    System.out.println("Adalah paruh tahun pertama");
                    break;
                
                case Juli:
                case Agustus:
                case September:
                case Oktober:
                case November:
                case Desember:
                    System.out.println("Adalah psruh tshun kedua");
                    break;
            }
    }
    
}
