/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_bases_1;

import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;
import javax.swing.JOptionPane;
/**
 *
 * @author alexd
 */
public class Prueba_bases_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Hola mundo");
        System.out.println("Hola alex");
        System.out.println("Intento poner un mensaje para que todos lo miren");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Esto me gusta");
        }
        
        System.out.print("Ingrese palabra a encriptar: ");
        String textoSinEncriptar = entrada.nextLine();
        System.out.println("Texto sin encriptar: " + textoSinEncriptar);
        String textoEncriptadoConMD5=DigestUtils.md5Hex(textoSinEncriptar); 
        JOptionPane.showMessageDialog(null, "Texto Encriptado con MD5 : "+textoEncriptadoConMD5);
    }
}