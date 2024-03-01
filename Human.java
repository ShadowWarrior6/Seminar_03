public class Human extends BaseHuman implements Runner{


    private int maxRun;
    
    private int maxJump;

    
    public static Human create(String name,int age,int maxJump,int maxRun){
        if (age<18){
            throw new RuntimeException("wrong age");
        }
        if(name==null||name.length()<3){
            throw new RuntimeException("Smth wrong with name");
        }
        return new Human(name,age,maxRun,maxJump);
         
        
    }


    public Human(String name,int age, int maxJump,int maxRun){
        super(name,age );
        this.maxJump=maxJump;
        this.maxRun=maxRun;
    }

    @Override
    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Human{" +
            "name='" + name + '\'' +
            ", age=" + age +
            "maxRun='" + maxRun + '\'' +
            "maxJump='" + maxJump +
            '}';
    }



    // @Override
    // public boolean jump(int height) {
    //     if(height<=maxJump()){
    //         System.out.printf("%s перепрыгнул через стену %d см.\n", getName(),height);
    //         return true;
    //     }
    //     else{
    //         System.out.printf("%s не смог перепрыгнуть стену высотой %d см. Остался на месте ", name, height);
    //     }
    //     return false;
    // }    

 

    // private int maxJump() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'maxJump'");
    // }

    // @Override
    // public boolean run(int length) {
    //    if(length<=maxRun()){
    //     System.out.printf("%s успешно пробежал %d метров. \n",getName(),maxRun());
    //     return true;    
    //    }
    //    else{
    //     System.out.printf("%s не смог пробежать %d метров, остался на месте.\n",name,maxRun());
    //     return false;
    //    }
    // }

    // private int maxRun() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'maxRun'");
    // }


    public int getMaxJump() {
        return maxJump;
    }


    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }


    public int getMaxRun() {
        return maxRun;
    }


    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }
     
}


