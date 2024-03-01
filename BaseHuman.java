public abstract class BaseHuman {

protected String name;
 
protected int age;


private  BaseHuman(int age ){
    this("name",18);
}

protected BaseHuman(String name){
    this(name,18);
}

protected BaseHuman(String name, int age){
    this.name=name;
    this.age=age;
}

public String getName() {
    return name;
}

public void setName(String name) {
   updateName(name);
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    updateAge(age);
}
private void updateAge(int age){
    if(age<18){
        throw new RuntimeException("wrong age");
    }
    this.age=age;
     
}

private void  updateName(String name){
    if(name==null||name.length()<3){
        throw new RuntimeException("Smth wrong with name");
    }
    this.name=name;
    
}





 public abstract void printInfo();






 @Override
public String toString() {
    return "Human{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
}

}

