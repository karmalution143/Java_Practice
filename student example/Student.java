public class Student {
    private String name;
    private int average;

    // the job of a constructor is to set up an object for first use!
    public Student(String name) {
        this.name = name;
    }

    //Getters
    public String getName() {
        return this.name;
    }
    public int getAverage() {
        return this.average;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAverage(int average) {
        this.average = average;
    }
}