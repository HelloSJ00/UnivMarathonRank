package com.runningRank.runningRank.auth.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UserUpdateRequest {
    private String profileImageUrl;
    private String name;
    private LocalDate birthDate;
    private String gender;
    private String universityEmail;
    private String universityName;
    private String major;
    private boolean isChangeUniversity;
}
