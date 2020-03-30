package entitites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonCRUD {
    int id = 0;
    private List<String> allPersons;
    private List<Person> personCRUD;
    private static PersonCRUD ourInstance = new PersonCRUD();

    public static PersonCRUD getInstance() {
        return ourInstance;
    }

    private PersonCRUD() {
        personCRUD = new ArrayList<>();
    }

    public void addPerson (Person person){
        personCRUD.add(person);
        id++;
        person.setIdUser(id);
    }

    public List<String> allPersons(){
        allPersons = personCRUD.stream()
               .map(Person::toString)
               .collect(Collectors.toList());
        return allPersons;
    }



    public void deletePerson(int id){
        personCRUD.remove(id);
        //allPersons.remove(id);
    }

}
