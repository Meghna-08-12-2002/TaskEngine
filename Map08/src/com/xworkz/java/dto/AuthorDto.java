package com.xworkz.java.dto;

public class AuthorDto {
    private String name;
    private String email;
    private long contact;

    public AuthorDto(String name, String email, long contact) {
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public long getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact=" + contact +
                '}';
    }
}
