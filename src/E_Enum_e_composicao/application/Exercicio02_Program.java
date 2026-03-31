package E_Enum_e_composicao.application;

import E_Enum_e_composicao.entities.Exercicio02_Comment;
import E_Enum_e_composicao.entities.Exercicio02_Post;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio02_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime date1 = LocalDateTime.parse("2018-06-21T13:05:44");
        LocalDateTime date2 = LocalDateTime.parse("2018-07-28T23:14:19");

        Exercicio02_Comment comment1 = new Exercicio02_Comment("Have a Nice trip");
        Exercicio02_Comment comment2 = new Exercicio02_Comment("Wow that Awesome!");
        Exercicio02_Post post1 = new Exercicio02_Post(date1, "Traveling to New Zealand", "I´m going to visit this wonderful country!", 12);
        post1.addComment(comment1);
        post1.addComment(comment2);

        Exercicio02_Comment comment3 = new Exercicio02_Comment("Good night");
        Exercicio02_Comment comment4 = new Exercicio02_Comment("May the Force be with you");
        Exercicio02_Post post2 = new Exercicio02_Post(date2, "Good Night Guys", "See you tomorrow", 5);
        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println();
        System.out.println(post1);
        System.out.println(post2);

        sc.close();
    }
}
