package kishore.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "microservices")
public class feedback {
    @Id
    private Long id;
    private String name;
    private String email;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public feedback(String name,String email,String message)
    {
        this.name = name;
        this.email = email;
        this.message = message;
    }
    public feedback()
    {

    }

}
