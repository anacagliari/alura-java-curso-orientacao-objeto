public class DesafioAluno {
    String nome;
    int idade;

    void exibeFichaTecnica() {
        System.out.println(String.format("""
            
        Nome aluno: %s
        Idade aluno: %d """, nome, idade));
    }
}
