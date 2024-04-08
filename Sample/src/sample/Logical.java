package sample;

public class Logical {

    public static void main(String[] args) {
        int score = 59; //　成績
        
        // and:scoreが40以上、かつ５０以下
        System.out.print("scoreが４０以上、かつ５０以下　:　");
        System.out.println(score >= 40 && score <= 50);
        
        // and:scoreが40以上、または５０以下
        System.out.print("scoreが４０以上、または５０以下　:　");
        System.out.println(score >= 40 || score <= 50);
        
        // and:scoreが60以上でない
        System.out.print("scoreが6０以上でない　:　");
        System.out.println(!(score >= 60));

    }

}
