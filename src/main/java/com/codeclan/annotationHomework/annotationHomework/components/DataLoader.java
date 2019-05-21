package com.codeclan.annotationHomework.annotationHomework.components;


import com.codeclan.annotationHomework.annotationHomework.models.File;
import com.codeclan.annotationHomework.annotationHomework.models.Folder;
import com.codeclan.annotationHomework.annotationHomework.models.User;
import com.codeclan.annotationHomework.annotationHomework.repositories.FileRepository;
import com.codeclan.annotationHomework.annotationHomework.repositories.FolderRepository;
import com.codeclan.annotationHomework.annotationHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }


    public void run(ApplicationArguments args){

        Folder media = new Folder("Media");
        folderRepository.save(media);

        Folder images = new Folder("Images");
        folderRepository.save(images);

        File jpeg = new File("Image", "jpeg", 1);
        fileRepository.save(jpeg);

        File mp3 = new File("Media", "mp3", 12);
        fileRepository.save(mp3);

        User mark = new User("Mark");
        userRepository.save(mark);
    }
}
