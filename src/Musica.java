public class Musica {
    // Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
    // e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica(double mediaAvaliacoes){
        System.out.println("""
                
                * %s * - %d
                %s
               
                %.2f / 10
                %d Avaliações
                """.formatted(titulo, anoLancamento, artista, mediaAvaliacoes, numAvaliacoes));
    }
    void avaliaMusica(double avaliacaoRecebida){
        avaliacao += avaliacaoRecebida;
        numAvaliacoes++;
    }

    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }


}
