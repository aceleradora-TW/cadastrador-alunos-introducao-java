package com.aceleradora.cadastrador;

import com.aceleradora.cadastrador.dominio.Aluna;
import com.aceleradora.cadastrador.dominio.Curso;
import com.aceleradora.cadastrador.dominio.Matricula;
import com.aceleradora.cadastrador.dominio.Mentora;
import com.aceleradora.cadastrador.dominio.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static List<Pessoa> pessoasAceleradora = new ArrayList<>();

  public static void main(String[] args) {
//    Curso es = new Curso("ES", "PUC-RS", 7.9);
//
//    Mentora ghi = new Mentora("Ghilherme", "1996", "cadastro", "TW", 6);
//    Aluna lia = new Aluna(
//            "Lia",
//            "xxxx",
//            "casdastro", "01/2021", "12345",
//            new Matricula("12345", "01/01/2021", es)
//    );
//    Aluna luana = new Aluna(
//            "Luana da Rosa",
//            "07/07/1996",
//            "xxx.xxx.xxx-49",
//            "12345",
//            "CC",
//            new Matricula("54321", "05/01/2021", es)
//    );

    System.out.println("Para aluna digite 1, para mentor digite 2: ");
    int opcao = scanner.nextInt();

    if (opcao == 1) {
      criaAluna();
    } else {
      criaMentor();
    }

    limpaTela();
  }

  private static void criaMentor() {
//    pessoasAceleradora.add(//pessoaCriada);
  }

  private static void criaAluna() {
//    pessoasAceleradora.add(//pessoaCriada);
  }

  private static void limpaTela() {
    System.out.print("\0g33[H\033[2J");
    System.out.flush();
  }
}
