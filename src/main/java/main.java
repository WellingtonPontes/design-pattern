/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wellg
 */
public class main {
    public static void main(String[] args) {
        Fila novafila =Fila.getInstance();
        novafila.setDocumento("Ola mundo");
        Fila novafila2 = Fila.getInstance();
        novafila2.setDocumento("ola mundo 2");
        
        System.out.println(novafila.getDocumento());
        System.out.println(novafila2.getDocumento());
        
    }
}
