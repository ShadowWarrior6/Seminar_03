public class Championship {
    public static void main(String[] args) {
     Runner[]runners={
        new Cat("Vzg", 1500, 300),
        new Cat("Sv", 1000, 210),
        new Robot("Vasili", 9999, 0),
        new Robot("Srapion", 5000, 50),
        Human.create("Ando", 21, 3000, 450),
        Human.create("Smbat", 84, 2500, 300)

     };

     Obstacle[]obstacles={
        new Track(1200),
        new Wall(30),
        new Track(2000),
        new Wall(140),
        new Track(3000),
        new Wall(300)
    };
    for (Runner runner: runners){
        for(Obstacle obstacle:obstacles){
            if (obstacle instanceof Track){    
            if(!runner.run(obstacle.getLength()));
            break;
            }
            else if(obstacle instanceof Wall){
            if(!runner.jump(obstacle.getHeight()));
            break;
            }

        }
    }

    }
}
