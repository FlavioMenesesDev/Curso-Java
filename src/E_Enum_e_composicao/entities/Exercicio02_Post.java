package E_Enum_e_composicao.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercicio02_Post {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Exercicio02_Comment> comments = new ArrayList<>();

    public Exercicio02_Post() { }

    public Exercicio02_Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Exercicio02_Comment> getComments() {
        return comments;
    }

    public void addComment(Exercicio02_Comment comment){
        comments.add(comment);
    }

    public void RemoveComment(Exercicio02_Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(formatter.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Exercicio02_Comment c : comments){
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
