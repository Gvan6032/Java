package entitites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class PersonCRUD {
    int id = 0;
    private static Logger log = Logger.getLogger(Person.class);
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
        log.info("Class object Person has been added;");
        //id++;
        //person.setIdUser(id);
    }

    public List<String> allPersons(){
        allPersons = personCRUD.stream()
               .map(Person::toString)
               .collect(Collectors.toList());
        log.info("Method allPersons Collection.toList();");
        return allPersons;
    }

    public void deletePerson(int id){
        personCRUD.remove(id);
        //allPersons.remove(id);
    }

}
