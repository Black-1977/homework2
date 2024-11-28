public class Main {
    public static void main(String[] args) {
        // Part 1
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
            System.out.println(dog+" "+cat+" "+paper);
        // Part 2
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
            System.out.println(dog+" "+cat+" "+paper);
        // Part 3
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
            System.out.println(dog+" "+cat+" "+paper);
        // Part 4
        var friend=19;
            System.out.println(friend);
        friend=friend+2;
            System.out.println(friend);
        friend=friend/7;
            System.out.println(friend);
        // Part 5
        var frog=3.5;
            System.out.println(frog);
        frog=frog*10;
            System.out.println(frog);
        frog=frog/3.5;
            System.out.println(frog);
        frog=frog+4;
            System.out.println(frog);
        // Part 6
        var weightFighter1=78.2;
        var weightFighter2=82.7;
        var weightSum=weightFighter1+weightFighter2;
            System.out.println(weightSum);
        var weightDef=weightFighter2-weightFighter1;
            System.out.println(weightDef);
        // Part 7
        var weight1=20;
        var weight2=3;
            System.out.println(weight1%weight2);
        //Part 8
        var hours=640;
        var workers=hours/8;
            System.out.println("Всего работников в компании - "+workers+" человек");
        var workers1=workers+94;
            System.out.println("Если в компании работает "+workers1+" человек, то всего "+hours/workers1+" часов может быть поделено между сотрудниками");

    }
}