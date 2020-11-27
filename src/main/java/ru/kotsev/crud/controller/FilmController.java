package ru.kotsev.crud.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kotsev.crud.model.Film;
import ru.kotsev.crud.service.FilmService;

import java.util.List;

@Controller
@AllArgsConstructor
public class FilmController {

    private final FilmService filmService;

    @GetMapping("/films")
    public String findAll(Model model) {
        List<Film> films = filmService.findAll();
        model.addAttribute("films", films);
        return "film-list";
    }

    @GetMapping("/film-create")
    public String createFilmForm(Film film) {
        return "film-create";
    }

    @PostMapping("/film-create")
    public String createFilm(Film film) {
        filmService.saveFilm(film);
        return "redirect:/films";
    }

    @GetMapping("film-delete/{id}")
    public String deleteFilm(@PathVariable("id") Long id) {
        filmService.deleteById(id);
        return "redirect:/films";
    }

    @GetMapping("film-update/{id}")
    public String updateFilmForm(@PathVariable("id") Long id, Model model) {
        Film film = filmService.findById(id);
        model.addAttribute("film", film);
        return "film-update";
    }

    @PostMapping("/film-update")
    public String updateFilm(Film film) {
        filmService.saveFilm(film);
        return "redirect:/films";
    }
}
