package ru.studyfullstack.tasklist.backendspringboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.studyfullstack.tasklist.backendspringboot.entity.PriorityEntity;

//описываем все доступные способы доступа к данным
@Repository
public interface PriorityRepository extends JpaRepository<PriorityEntity, Long> {

}
