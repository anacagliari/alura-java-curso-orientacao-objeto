public class DesafioCarro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println(String.format("""
            
            Modelo do carro: %s
            Ano de lançamento: %d
            Cor do carro: %s """, modelo, ano, cor));
    }

    int idadeCarro() {
        return 2024 - ano;
    }
}
