import java.util.List;

public class Family {
    private List<Person> persons;
    private String address;
    public Family(List<Person> persons, String address) {
        this.persons = persons;
        this.address = address;
    }
    public List<Person> getPersons(){
        return persons;
    }
    public void setPersons(List<Person>person){
        this.persons = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Family{" +
                "presons=" + persons +
                ", address='" + address + '\'' +
                '}';
    }
}
