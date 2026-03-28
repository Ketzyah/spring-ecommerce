package com.curso.ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadFileService {

    private String folder="images//";

    public String saveImage(MultipartFile file) throws IOException {

        if (!file.isEmpty()) {

            // ✅ Crear carpeta si no existe
            Path folderPath = Paths.get(folder);
            if (!Files.exists(folderPath)) {
                Files.createDirectories(folderPath);
            }

            // ✅ Ruta segura
            String nombreArchivo = file.getOriginalFilename();
            Path path = Paths.get(folder, nombreArchivo);

            Files.write(path, file.getBytes());

            return nombreArchivo;
        }

        return "default.jpg";
    }

    public void deleteImage(String nombre){
        String ruta="images//";
        File file = new File(ruta + nombre);
        file.delete();
    }



}
