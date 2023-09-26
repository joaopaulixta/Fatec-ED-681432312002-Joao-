import javax.swing.JOptionPane;

// Classe para a estrutura dos nós da árvore
class NoArvore<T extends Comparable<T>> {
    T dado;
    NoArvore<T> esquerda;
    NoArvore<T> direita;

    public NoArvore(T dado) {
        this.dado = dado;
        this.esquerda = null;
        this.direita = null;
    }
}

// Classe para entrada de dados
class Entrada {
    public static <T extends Comparable<T>> NoArvore<T> construirArvoreBinaria() {
        String entrada = JOptionPane.showInputDialog("Digite um valor (ou 'sair' para encerrar):");
        if (entrada == null || entrada.equalsIgnoreCase("sair")) {
            return null;
        }

        T dado = (T) entrada;
        NoArvore<T> no = new NoArvore<>(dado);

        no.esquerda = construirArvoreBinaria();
        no.direita = construirArvoreBinaria();

        return no;
    }
}

// Classe para saída de dados
class Saida {
    public static <T extends Comparable<T>> void imprimirEmOrdem(NoArvore<T> raiz) {
        if (raiz != null) {
            imprimirEmOrdem(raiz.esquerda);
            System.out.print(raiz.dado + " ");
            imprimirEmOrdem(raiz.direita);
        }
    }
}

public class PesquisaArvoreBinaria {
    public static void main(String[] args) {
        NoArvore<String> raiz = Entrada.construirArvoreBinaria();

        if (raiz == null) {
            System.out.println("Árvore vazia.");
        } else {
            System.out.println("Travessia em ordem (in-order):");
            Saida.imprimirEmOrdem(raiz);
        }
    }
    public class PesquisanaArvoreBinaria {
  
    	  // Solicita ao usuário o número a ser pesquisado
        String valorPesquisado = JOptionPane.showInputDialog("Digite um valor para pesquisar:");
        
        // Executa a pesquisa na árvore com o valor fornecido pelo usuário
        <raiz> void pesquisaNaArvore(raiz valorPesquisado) {
            System.out.println("\nO valor está na árvore.");
        
            System.out.println("\nO valor não está na árvore.");
        }
        public static <T extends Comparable<T>> boolean pesquisaNaArvore(NoArvore<T> raiz, T valor) {
            if (raiz == null) {
                return false; // A árvore está vazia, o valor não está presente.
            }

            int comparacao = valor.compareTo(raiz.dado);

            if (comparacao == 0) {
                return true; // Encontrou o valor na raiz.
            } else if (comparacao < 0) {
                return pesquisaNaArvore(raiz.esquerda, valor); // Pesquisar na subárvore esquerda.
            } else {
                return pesquisaNaArvore(raiz.direita, valor); // Pesquisar na subárvore direita.
            }
        }

        public static void main(String[] args) {
            NoArvore<String> raiz = Entrada.construirArvoreBinaria();

            if (raiz == null) {
                System.out.println("Árvore vazia.");
            } else {
                System.out.println("Travessia em ordem (in-order):");
                Saida.imprimirEmOrdem(raiz);

                // Exemplo de pesquisa de um valor na árvore
                String valorPesquisado = JOptionPane.showInputDialog("Digite um valor para pesquisar:");
                if (pesquisaNaArvore(raiz, valorPesquisado)) {
                    System.out.println("\nO valor está na árvore.");
                } else {
                    System.out.println("\nO valor não está na árvore.");
                }
            }
        }
    }
    
}
