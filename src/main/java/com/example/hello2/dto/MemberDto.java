// 22 10 27

package com.example.hello2.dto;

import lombok.Builder;

public class MemberDto{
    private String name;
    private String email;
    private String oragnization;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getOragnization() {
        return oragnization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOragnization(String oragnization) {
        this.oragnization = oragnization;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.name, this.email, this.oragnization);
    }
}
