public class Dragao35 {
    public static void main(String[] args) {
        
        String dragao0 = "F";
        String naoDrag0 = "F";        
        String dragao1 = dragao0 + "L" + naoDrag0;
        String naoDrag1 = dragao0 + "R" + naoDrag0;
        String dragao2 = dragao1 + "L" + naoDrag1;
        String naoDrag2 = dragao1 + "R" + naoDrag1;
        String dragao3 = dragao2 + "L" + naoDrag2;
        String naoDrag3 = dragao2 + "R" + naoDrag2;
        String dragao4 = dragao3 + "L" + naoDrag3;
        String naoDrag4 = dragao3 + "R" + naoDrag3;
        String dragao5 = dragao4 + "L" + naoDrag4;        

        // mostra resultado
        System.out.println(dragao0);
        System.out.println(dragao1);
        System.out.println(dragao2);
        System.out.println(dragao3);
        System.out.println(dragao4);
        System.out.println(dragao5);
        
    } // fim main    
} // fim classe