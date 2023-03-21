public class Planet {
    int numberOfMoons;
    String name;

    Planet(){
        printOfVar(this.numberOfMoons, this.name);

    }
    Planet(int numberOfMoons){
        this.numberOfMoons = numberOfMoons;
        printOfVar(this.numberOfMoons, this.name);
    }
    Planet(String name){
        this.name = name;
        System.out.println( "Я - планета " + this.name);
        printOfVar(this.numberOfMoons, this.name);
    }
    Planet(String name, int numberOfMoons){
        this.name = name;
        this.numberOfMoons = numberOfMoons;
        printOfVar(this.numberOfMoons, this.name);

    }

    static void printOfVar(int numberOfMoons, String name){
        System.out.println("Название - " + name);
        System.out.println("Количество лун: " + numberOfMoons);
        System.out.println();
    }
}
