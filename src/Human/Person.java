package Human;

import Model.AgeExcep;
import Model.LongerExcep;
import Model.WeightExcep;

public class Person {
    private double weight;
    private double longer;
    private int Age;

    public Person(int weight, int longer, int age) {
        if (weight > 0) {
            System.out.println("Бул адамдын салмагы тура келет! ");
        } else if (weight < -0) {

            throw new WeightExcep(" You make a big WRONG! ");
        }
        this.weight = weight;
        if (longer >3) {
            System.out.println("Бул адамдын бою тура келет!");
        } else if (longer < 3) {
            throw new LongerExcep(" You make a big MISTAKE");
        }
        this.longer = longer;
        if (Age < 1) {
            System.out.println(" Бул адамдын жашы тура келет!");
        } else if (Age > 1) {
            throw new AgeExcep(" WRONG!");
        }
        Age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLonger() {
        return longer;
    }

    public void setLonger(double longer) {
        this.longer = longer;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", longer=" + longer +
                ", Age=" + Age +
                '}';
    }
}
