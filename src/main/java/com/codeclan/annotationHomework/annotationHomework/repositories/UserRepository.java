package com.codeclan.annotationHomework.annotationHomework.repositories;

import com.codeclan.annotationHomework.annotationHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
