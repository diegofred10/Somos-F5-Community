package com.somosf5community.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.somosf5community.models.User;
import com.somosf5community.repositories.UserRepository;

import lombok.AllArgsConstructor;

// @Service
// @AllArgsConstructor
// public class UserUploadAvatarService {
//     private final UserService userService;
//     private final StorageService storageService;
//     private final UserRepository userRepository;


//     public void uploadAvatar(String avatar, User user) {
       

//         userService.updateUserImage(user, avatar);
//         storageService.store(file);
//     }
// }
