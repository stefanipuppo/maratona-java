package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        
    Professor professor = new Professor();
    professor.nome = "Mestre Kami";
    professor.idade = 140;
    professor.sexo = 'M';

    System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);

    }
}
