package Model;

public class Student extends Person{
    private Double math, physics, chemistry;
    

    public Student() {
        super();
    }


    public Student(String name, String address, int iD, int age, Double math, Double physics, Double chemistry) {
        super(name, address, iD, age);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }


    public Double getMath() {
        return math;
    }


    public void setMath(Double math) {
        this.math = math;
    }


    public Double getPhysics() {
        return physics;
    }


    public void setPhysics(Double physics) {
        this.physics = physics;
    }


    public Double getChemistry() {
        return chemistry;
    }


    public void setChemistry(Double chemistry) {
        this.chemistry = chemistry;
    }
    public Double getAvg(){
        return (math+physics+chemistry)/3;
    }


    @Override
    public String toString() {
        return "Student [ID=" + super.getID() + ", name=" + super.getName() + ", address=" + super.getAddress() + ", age=" + super.getAge() + "math=" + math + ", physics=" + physics + ", chemistry=" + chemistry + "]";
    }

    
}
