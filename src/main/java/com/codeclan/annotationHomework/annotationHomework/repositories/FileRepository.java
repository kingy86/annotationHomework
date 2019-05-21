package com.codeclan.annotationHomework.annotationHomework.repositories;

import com.codeclan.annotationHomework.annotationHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
