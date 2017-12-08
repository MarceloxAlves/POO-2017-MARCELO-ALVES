package exercicio3_extra.model;

public class Post {
    public int countLikes;
    public Post(int initialLikes) {
        countLikes = initialLikes;
    }

    public void addLike(){
        countLikes++;
    }
}