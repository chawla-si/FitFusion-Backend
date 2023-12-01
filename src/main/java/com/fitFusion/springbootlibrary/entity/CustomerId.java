package com.fitFusion.springbootlibrary.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CustomerId implements Serializable {

    private Long userId;

    private Long fitnessPlanId;

    @Override
    public String toString() {
        return "CustomerId{" +
                "userId=" + userId +
                ", fitnessPlanId=" + fitnessPlanId +
                '}';
    }
}
