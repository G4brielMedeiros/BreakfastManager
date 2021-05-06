package project.gabrielmedeiros.breakfastmanager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    private String cpf;
    private String name;
    private String items;
    
    public User() {}
    
    public User(String name, String cpf, String items) {
        this.name = name;
        this.cpf = cpf;
        this.items = items;
    }


    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getItems() {
    	return items;
    }
    

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", cpf=" + cpf + ", items=" + items + "]";
	}
    

}