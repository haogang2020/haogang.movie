package com.haogang.movie.dao;

import java.util.List;

import com.haogang.movie.domain.Movie;
import com.haogang.movie.vo.MovieVO;

public interface MovieMapper {

	List<Movie> selects(MovieVO movieVO);
}
