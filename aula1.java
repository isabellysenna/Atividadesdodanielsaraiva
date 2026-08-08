public class aula1 {

    public static void main(String[] args) {

        //voto atividade

        int idade = 9;
        if (idade >= 16 && idade < 18 || idade >= 70){
            System.out.println("voto facultativo!!!");
        }
        
        else if (idade <= 15) {
           System.out.println("voto não obrigatório!!!"); 
        } 

        else {
            System.out.println("voto obrigatório!!!");
        }
    }
}