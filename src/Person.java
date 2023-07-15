public class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person " + this.getName() + " "+ this.getAge();
    }

    @Override
    public int compareTo(Person otherPerson) {
        // priority according to age
      //  return Integer.compare(this.age,otherPerson.getAge());
       // Priority according to the Alphabetical order or name
        return this.name.compareTo(otherPerson.getName());
        // to get reverse order put "-" sign in front of this
    }
}
