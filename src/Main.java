import idk.inheritance;
import idk.inheritance1;

public class Main {

    public static void main(String[] args) {

    inheritance inheritance = new inheritance();
    inheritance1 inheritance1 = new inheritance1();


    inheritance.printSomething();
    inheritance.printSomething("something");
    inheritance1.printSomething();

    }
}


//ექმენით კონსოლური აპლიკაცია, სადაც წარმოაჩენთ მაგალითებს ობიექტზე ორიენტირებული პარადიგმის სამი ძირითადი პრინციპის დემონსტრირებისთვის:
//1) მემკვიდრეობითობა (საკმარისია ორდონიანი მემკვიდრეობითი იერარქიის მაგალითი)
//2) პოლიმორფიზმი (საკმარისია method overloading-ისა და method overriding-ის თითო-თითო მაგალითი)
// 3) ინკაფსულაცია (საკმარისია ყველა access modifier-ის მინიმუმ ერთხელ გამოყენება)