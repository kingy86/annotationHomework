package com.codeclan.annotationHomework.annotationHomework;

import com.codeclan.annotationHomework.annotationHomework.models.File;
import com.codeclan.annotationHomework.annotationHomework.models.Folder;
import com.codeclan.annotationHomework.annotationHomework.models.User;
import com.codeclan.annotationHomework.annotationHomework.repositories.FileRepository;
import com.codeclan.annotationHomework.annotationHomework.repositories.FolderRepository;
import com.codeclan.annotationHomework.annotationHomework.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationHomeworkApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFolderThenSave(){
		Folder media = new Folder("Media");
		folderRepository.save(media);

		User mark = new User("Mark");
		userRepository.save(mark);
	}

	@Test
	public void createFolderAndFileThenSave(){
		Folder media = new Folder("Media");
		folderRepository.save(media);

		File mp3 = new File("Media", "mp3", 12);
		fileRepository.save(mp3);
	}

}
