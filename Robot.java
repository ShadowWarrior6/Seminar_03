public class Robot extends Baserobot implements Runner {

    private String name;

    private int maxRun;

    private int maxJump;

    public String getName(){return name;}

    public int getMaxRun(){return maxRun;}

    public int getMaxJump(){return maxJump;}

    public Robot(String name,int maxRun,int maxJump){
        this.name=name;
        this.maxRun=maxRun;
        this.maxJump=maxJump;
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

 

    // @Override
    // public boolean run(int length) {
    //    if(length<=maxRun()){
    //     System.out.printf("%s успешно пробежал %d метров. \n",getName(),getMaxRun());
    //     return true;    
    //    }
    //    else{
    //     System.out.printf("%s не смог пробежать %d метров, остался на месте.\n",name,getMaxRun());
    //     return false;
    //    }
    // }

    // private int maxRun() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'maxRun'");
    // }
     
}
