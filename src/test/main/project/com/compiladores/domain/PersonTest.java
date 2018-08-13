package main.project.com.compiladores.domain;

import org.junit.Test;
import project.com.compiladores.domain.Person;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class PersonTest {

    @Test
    public void shouldReturnAnErrorIfMandatoryParametersAreEmpty() {
        Person person = new Person().execute("", 0);
        assertThat(person.getErrors(), hasSize(2));
        assertThat(person.getErrors(), is(not(empty())));
    }

    @Test
    public void shouldNotReturnAnErrorIfMandatoryParametersAreNotEmpty() {
        Person person = new Person().execute("João", 18);
        assertThat(person.getErrors(), is(empty()));
    }

    @Test
    public void shouldReturnAnErrorIfAgeIsBelow18() {
        Person person = new Person().execute("João", 17);
        assertThat(person.getErrors(), hasSize(1));
        assertThat(person.getErrors(), is(not(empty())));
    }

}
