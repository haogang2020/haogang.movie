package com.haogang.movie.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.haogang.movie.domain.Movie;
import com.haogang.movie.service.MovieService;
import com.haogang.movie.vo.MovieVO;

@Controller
public class MovieController {

	@Resource
	private MovieService movieService;
	
	@RequestMapping("selects")
	public String selects(Model model,MovieVO movieVO,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "3")Integer pageSize) {
		PageInfo<Movie> info = movieService.selects(movieVO, pageNum, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("movieVO", movieVO);
		return "movies";
	}
}
