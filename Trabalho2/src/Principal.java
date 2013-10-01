import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Imagem img = new Imagem();        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a largura da imagem: ");
        img.setLargura(ler.nextInt());
        
        System.out.println("Informe a altura da imagem: ");
        img.setAltura(ler.nextInt());
        
        System.out.println("Imagem Colorida? (S/N) ");
        img.setColorida(ler.next().charAt(0));     
        
        System.out.println("Informe o nome do arquivo: ");
        img.setNomeArquivo(ler.next());
        
        Cor cor = new Cor();
        
        if(img.getColorida() == 'S'){
            System.out.println("Informe o componente R da cor: ");
            cor.setR(ler.nextInt());
            System.out.println("Informe o componente G da cor: ");
            cor.setG(ler.nextInt());
            System.out.println("Informe o componente B da cor: ");
            cor.setB(ler.nextInt());
        } else if (img.getColorida() == 'N'){
            System.out.println("Informe o componente G da cor: ");
            cor.setG(ler.nextInt());
        }
    }
}
