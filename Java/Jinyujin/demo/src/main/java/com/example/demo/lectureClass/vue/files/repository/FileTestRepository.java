package com.example.demo.lectureClass.vue.files.repository;

import com.example.demo.lectureClass.vue.files.entity.FileTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileTestRepository extends JpaRepository<FileTest, Long>{
}
