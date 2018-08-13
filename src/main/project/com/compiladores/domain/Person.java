package project.com.compiladores.domain;

import lombok.*;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString()
@Setter
@Getter
public class Person {
    private Integer age;
    private String name;
    private List<String> errors;

    public Person execute(String name, Integer age){
        this.errors = new ArrayList<>();
        Person p = new Person();
        if (StringUtils.isBlank(name)) {
            errors.add("Nome: O nome não pode ser vazio");
        }
        if(age < 18) {
            errors.add("Idade: A idade deve ser maior que 18");
        }
        if (!CollectionUtils.isEmpty(this.errors)){
            p.setErrors(errors);
            return p;
        }
        p.setName(name);
        p.setAge(age);
        p.errors = Collections.emptyList();
        return p;
    }
}
