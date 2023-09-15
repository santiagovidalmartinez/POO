package exercise;

public class Persona {

    private String name;
    private String document;
    private String country;
//constructor

    public Persona(String name, String document, String country) {
        this.name = name;
        this.document = document;
        this.country = country;
    }

//get and set  
    public String getCountry() {
        return this.country;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
