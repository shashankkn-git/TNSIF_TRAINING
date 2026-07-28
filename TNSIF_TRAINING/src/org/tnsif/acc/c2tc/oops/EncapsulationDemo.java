package org.tnsif.acc.c2tc.oops;

class Human {

    private int age;
    private String name;

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

    public class EncapsulationDemo {
        public static void main(String[] args) {
            Human obj = new Human();
            obj.setName("Shashank");
            obj.setAge(26);

            System.out.println("Name : " + obj.getName());
            System.out.println("Age  : " + obj.getAge());
        }
    
    
  }

    