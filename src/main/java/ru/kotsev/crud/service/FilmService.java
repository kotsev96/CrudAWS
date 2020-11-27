package ru.kotsev.crud.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kotsev.crud.model.Film;
import ru.kotsev.crud.repository.FilmRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class FilmService {

    private final FilmRepo filmRepo;

    public Film findById(Long id) {
        return filmRepo.getOne(id);
    }

    public List<Film> findAll() {
        return filmRepo.findAll();
    }

    public Film saveFilm(Film film) {
        return filmRepo.save(film);
    }

    public void deleteById(Long id) {
        filmRepo.deleteById(id);
    }
}
