package com.encora.apprentice.ChatRoomApp.controller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NonNull
    private UUID id;
    @NonNull
    private String name;
    @NonNull
    private String password;
    private boolean connectedStatus;
    private UUID chatRoomId;
    private String nickname;
}
