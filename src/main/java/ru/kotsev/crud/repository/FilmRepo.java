package ru.kotsev.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kotsev.crud.model.Film;

public interface FilmRepo extends JpaRepository<Film, Long> {
}
