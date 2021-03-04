package com.schoolofnet.com.LiveGraphQL;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String title;
    @Column
    private String isbn = UUID.randomUUID().toString();
}
