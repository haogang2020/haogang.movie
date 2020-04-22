package com.haogang.movie.service;

import com.github.pagehelper.PageInfo;
import com.haogang.movie.domain.Movie;
import com.haogang.movie.vo.MovieVO;

public interface MovieService {
	
	PageInfo<Movie> selects(MovieVO movieVO,Integer pageNum,Integer pageSize);
}
