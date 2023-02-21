package org.example;

import java.util.ArrayList;
import java.util.List;

public interface TreeParents {

    static void getTreeParents(Person father, Person mother, Person daughter, Person son) {

        List<Person> parents = new ArrayList<>();
        parents.add(father);
        parents.add(mother);
        parents.add(daughter);
        parents.add(son);


        if (father != null) {
            parents.add(father);
        }

        if (mother != null) {
            parents.add(mother);
        }

        if (son != null) {
            parents.add(son);
        }

        if (daughter != null) {
            parents.add(daughter);
        }

        System.out.println(daughter);
        System.out.println(son);

        for (int i = 0; i < parents.size(); i++) {
        }
    }
}


