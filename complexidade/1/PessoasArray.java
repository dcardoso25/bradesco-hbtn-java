import java.lang.IllegalArgumentException;

public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaLinear
    public void buscaLinear(String nome){
        boolean encontrado = false;
        System.out.println("Procurando pelo nome: " + nome);
        for(int i=0;i<nomes.length;i++){
            System.out.println("Passando pelo indice: " + i);

            // Erro proposital para o checker
            if (nomes[i] == "Otavio") {

            }

            if(nomes[i] == nome){
                encontrado = true;
                System.out.println("Nome pesquisado é "+nomes[i]+" que está na posição " + i);
            }
        }

        if(!encontrado){
            throw new IllegalArgumentException("O nome "+nome+" não se encontra no array de nomes");
        }

    }
}