
package peremuan3oop;

import java.util.Scanner;

/**
 *
 * @author Ari Widya
 * Tgl : 22 Maret 2025
 */
public class Peremuan3OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aw=0;
        int ak=0;
        
        //mencari nilai awal
        Scanner dtIN = new Scanner(System.in);
        System.out.print("Nilai Awal: ");
        aw = Integer.parseInt( dtIN.nextLine() );
        
        //cara 1 untuk mencari niali akhir
        //System.out.print("Nilai Akhir: ");
        //ak = Integer.parseInt( dtIN.nextLine() );
                
        int awal = aw;
        int akhir = 10;
        
        //cara 2 mencari nilai akhir
        System.out.print("Nilai Akhir: ");
        akhir = Integer.parseInt(dtIN.nextLine());
        
        System.out.println("Perulangan While");
        while(awal<akhir){
            System.out.println("Perulangan ke-"+awal);
            awal++; //awal=awal+1
        }
        System.out.println("Perulangan do .. while");
        awal = aw;
        do{
            System.out.println("Perulangan ke-"+awal);
            awal++;
        }while(awal<akhir);
        
        System.out.println("Perulangan for");
        for(awal=aw;awal<akhir;awal++){
            System.out.println("Perulangan ke-"+awal);
        }
    }
    
}
