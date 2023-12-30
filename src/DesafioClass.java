public class DesafioClass {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Gustavo";

        pessoa1.exibeMensagemSaudacao();

        Calculadora calculadora1 = new Calculadora();

        System.out.println(calculadora1.dobroDoNumero(231));

        Musica musica1 = new Musica();

        musica1.titulo = "Olha pra Cá";
        musica1.artista = "Major RD, Rock Danger";
        musica1.anoLancamento = 2023;


        musica1.avaliaMusica(7);
        musica1.avaliaMusica(8);
        musica1.avaliaMusica(10);

        musica1.exibeFichaTecnica(musica1.mediaAvaliacoes());



    }
}
