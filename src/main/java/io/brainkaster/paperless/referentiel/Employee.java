package io.brainkaster.paperless.referentiel;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by melbakkali on 06/04/2016.
 */

@Data
@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;
    private String login;
    private String password;

    private Employee(){}

    public Employee(String firstName, String lastName, String description, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.login = login;
        this.password = password;
    }

}
