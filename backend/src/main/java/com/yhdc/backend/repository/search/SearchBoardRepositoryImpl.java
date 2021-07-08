package com.yhdc.backend.repository.search;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.JPQLQuery;
import com.yhdc.backend.model.Board;
import com.yhdc.backend.model.QBoard;
import com.yhdc.backend.model.QComment;
import com.yhdc.backend.model.QMember;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SearchBoardRepositoryImpl extends QuerydslRepositorySupport implements SearchBoardRepository {
	
	public SearchBoardRepositoryImpl() {
		super(Board.class);
	}
	
	
	@Override
	public Board search1() {
		log.info("search1............");
		
		QBoard board = QBoard.board;
		QComment comment = QComment.comment;
		QMember member = QMember.member;
		
		JPQLQuery<Board> jpqlQuery = from(board);
		jpqlQuery.leftJoin(member).on(board.writer.eq(member));
		jpqlQuery.leftJoin(comment).on(comment.board.eq(board));
		
		JPQLQuery<Tuple> tuple = jpqlQuery.select(board, member.mno, comment.count());
		tuple.groupBy(board);
		
//		jpqlQuery.select(board).where(board.bno.eq(1L));
		
		log.info("--------------------");
		log.info(jpqlQuery);
		log.info("--------------------");
		
		List<Tuple> result = tuple.fetch();
		
		log.info(result);
		
		return null;
	}
	
	@Override
	public Page<Object[]> searchPage(String type, String keyword, Pageable pageable) {
		log.info("searchPage ------------------");
		
		QBoard board = QBoard.board;
		QComment comment = QComment.comment;
		QMember member = QMember.member;
		
		JPQLQuery<Board> jpqlQuery = from(board);
		jpqlQuery.leftJoin(member).on(board.writer.eq(member));
		jpqlQuery.leftJoin(comment).on(comment.board.eq(board));
		
		JPQLQuery<Tuple> tuple = jpqlQuery.select(board, member, comment.count());
		
		BooleanBuilder booleanBuilder = new BooleanBuilder();
		BooleanExpression booleanExpression = board.bno.gt(0L);
		
		booleanBuilder.and(booleanExpression);
		
		if(type != null) {
			String[] typeArr = type.split("");
			BooleanBuilder conditionBuilder = new BooleanBuilder();
			
			for(String t:typeArr) {
				switch (t) {
				case "t":
					conditionBuilder.or(board.title.contains(keyword));
					break;
					
				case "w":
					conditionBuilder.or(member.username.contains(keyword));
					break;
					
				case "c":
					conditionBuilder.or(board.content.contains(keyword));
					break;
				}
			}
			booleanBuilder.and(conditionBuilder);
		}
		
		tuple.where(booleanBuilder);
		
		tuple.groupBy(board);
		
		List<Tuple> result = tuple.fetch();
		
		log.info(result);
		
		return null;
	}

}
