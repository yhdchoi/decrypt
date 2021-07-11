package com.yhdc.backendapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.backendapi.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/board/")
@RequiredArgsConstructor
@Log4j2
public class BoardController {

	private final BoardService boardService;
}
