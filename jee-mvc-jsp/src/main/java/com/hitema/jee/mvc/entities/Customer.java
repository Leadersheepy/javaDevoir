package com.hitema.jee.mvc.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

        @Column(name = "store_id")
        private int storeId;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "email")
        private String email;

        @Column(name = "address_id")
        private int addressId;

        @Column(name = "active")
        private boolean active;

        @Column(name = "create_date")
        @Temporal(TemporalType.TIMESTAMP)
        private Date createDate;

        @Column(name="last_update")
        private LocalDateTime lastUpdate;


    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Customer [id=" + storeId + ", firstName=" + firstName + ", lastName" + lastName + ", email" + email + ", addressId" + addressId + ", active" + active + ", createDate" + createDate + ", lastUpdate=" + lastUpdate + "]";
    }




    // Constructors, getters, and setters
}
