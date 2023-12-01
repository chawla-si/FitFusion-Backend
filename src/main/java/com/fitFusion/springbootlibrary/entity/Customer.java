package com.fitFusion.springbootlibrary.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Customer {

    @EmbeddedId
    private CustomerId id;

}

