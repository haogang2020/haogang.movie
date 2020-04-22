package com.haogang.movie.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.haogang.movie.domain.Movie;
import com.haogang.movie.service.MovieService;
import com.haogang.movie.vo.MovieVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class MovieServiceImplTest {

	@Resource
	private MovieService movieService;
	@Test
	public void testSelects() {
		PageInfo<Movie> info = movieService.selects(new MovieVO(), 1, 10);
		System.out.println(info);
	}

}
