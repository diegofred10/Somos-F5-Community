package com.somosf5community.controllers;

import java.io.IOException;
import org.springframework.http.HttpHeaders;
import java.nio.file.Files;
import java.util.Map;
import java.util.Optional;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.somosf5community.models.User;
import com.somosf5community.repositories.UserRepository;
import com.somosf5community.services.StorageService;
import com.somosf5community.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("media")
@AllArgsConstructor
public class MediaController {
    private final StorageService storageService;
    private final HttpServletRequest request;
    private final UserRepository userRepository;
    private final UserService userService;

    @PostMapping("upload")
    public Map<String, String> uploadFile(@RequestParam("file") MultipartFile multiparFile, User user) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        user = userRepository.findByUsername(currentUserName)
                .orElseThrow(() -> new RuntimeException("User not found with username " + currentUserName));

                user.setImage(multiparFile.getOriginalFilename());
                userService.save(user);

        String path = storageService.store(multiparFile);
        String host = request.getRequestURL().toString().replace(request.getRequestURI(), "");
        String url = ServletUriComponentsBuilder
                .fromHttpUrl(host)
                .path("/media/")
                .path(path)
                .toUriString();

        return Map.of("url", url);
    }

    @GetMapping("{filename:.+}")
    public ResponseEntity<Resource> getFile(@PathVariable String filename) throws IOException {
        Resource file = storageService.loadAsResource(filename);
        String contentType = Files.probeContentType(file.getFile().toPath());

        return ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(file);
    }
}

// @RestController
// @RequestMapping("media")
// @AllArgsConstructor
// public class MediaController {
// private final StorageService storageService;
// private final UserService userService;
// private final UserRepository userRepository;
// private final HttpServletRequest request;

// // @Autowired
// // public FileUploadController(StorageService storageService, UserService
// userService, HttpServletRequest request) {
// // this.storageService = storageService;
// // this.userService = userService;
// // this.request = request;
// // }

// @PostMapping("upload")
// public Map<String, String> uploadFile(@RequestParam("file") MultipartFile
// multipartFile) {
// String path = storageService.store(multipartFile); // Almacena usando el
// servicio de almacenamiento
// String host =
// request.getRequestURL().toString().replace(request.getRequestURI(),""); //
// Obtiene la URL del archivo que podra ser consultada por otro metodo
// String url = ServletUriComponentsBuilder
// .fromHttpUrl(host)
// .path("/media/")
// .path(path)
// .toUriString();

// // Obtener el nombre del archivo
// String filename = multipartFile.getOriginalFilename();

// // Obtener el ID del usuario actualmente autenticado
// Authentication authentication =
// SecurityContextHolder.getContext().getAuthentication();
// String currentUserName = authentication.getName();
// User user = userRepository.findByUsername(currentUserName)
// .orElseThrow(() -> new RuntimeException("User not found with username " +
// currentUserName));

// // Guardar el nombre del archivo en la base de datos utilizando un servicio
// userService.updateUserImage(user, filename);

// return Map.of("url", url); // Retorna un mapa con un solo elemento para la
// URL
// }

// @GetMapping("{filename:.+}")
// public ResponseEntity<Resource> getFile(@PathVariable String filename) throws
// IOException { // Recupera un archivo por un resoruce a traves de un nombre
// Resource file = storageService.loadAsResource(filename);
// String contentType = Files.probeContentType(file.getFile().toPath());

// return ResponseEntity
// .ok()
// .header(HttpHeaders.CONTENT_TYPE, contentType)
// .body(file);
// }
// }
