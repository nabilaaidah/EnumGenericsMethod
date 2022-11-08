
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NABILA
 */
public class GenericClassMain<T> {

    /**
     * @param args the command line arguments
     */
    
    private T t;
    public void set(T t) {
        this.t = t;}
    
    public T get(){
        return t;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        GenericClassMain<Integer> persegi = new GenericClassMain<Integer>();
        GenericClassMain<Double> lingkaran = new GenericClassMain<Double>();
        
        persegi.set(100);
        lingkaran.set(21.7);
        System.out.println(persegi.get());
        System.out.println(lingkaran.get());
    }
    
}
