public class Person {
    private String name;
    private int age;
    private Person[] children;

    boolean hasChildren() {
        boolean hes = false;
        for (int i = 0; i < this.children.length; i++) {
            if (children[i] != null) {
                hes = true;
            }
        }
        return hes;
    }

    boolean isGrandfather() {
        boolean hes = false;
        for (int i = 0; i < this.children.length; i++) {
            if (children[i].hasChildren()) {
                hes = true;
            }
        }
        return hes;
    }

    int countChild() {
        int count = 0;
        for (int i = 0; i < this.children.length; i++) {
            if (children[i].hasChildren()) {
                count++;
            }
        }
        return count;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
    boolean addChild(Person child) {
        boolean in = false;
        if (child.getAge() < this.age - 18) {
            Person[] children1 = new Person[this.children.length + 1];
            for (int i = 0; i < children1.length; i++) {
                children1[i] = this.children[i];
                children1[children1.length - 1] = child;
                in = true;
            }
        }
        return in;
    }
    Person getYoungestChild() {
        Person result = this.children[0];
        int min = this.children[0].getAge();
        for (int i = 0; i < this.children.length; i++) {
            if (this.children[i].getAge() < min) {
                min = this.children[i].getAge();
                result = this.children[i];
            }
        }
        return result;
    }
    int compareGrandchildren(Person other){
        int number=0;
        for (int i = 0; i <children.length ; i++) {
            if (children[i].countChild()>other.countChild()){
            number=1;
            }
            else if (children[i].countChild()<other.countChild()){
                number=-1;
            }
            if (children[i].countChild()==other.countChild()){
                number=0;
            }
        }
        return number;
    }
    char mostCommonStartingLetter(){
        char c=' ';






        return c;
    }
}

