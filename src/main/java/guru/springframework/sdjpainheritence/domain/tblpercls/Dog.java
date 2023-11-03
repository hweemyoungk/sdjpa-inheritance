package guru.springframework.sdjpainheritence.domain.tblpercls;

import jakarta.persistence.Entity;

@Entity
public class Dog extends Mammal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
