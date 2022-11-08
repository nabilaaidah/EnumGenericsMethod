/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author NABILA
 */
class GenericsMethodMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GenericsMethod GM = new GenericsMethod();
        
        GM.<String>genericsMethod("Halo semua");
        GM.<Double>genericsMethod(3.14);
    }
    
}
