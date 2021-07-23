package com.yhdc.backendapi.utils;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class Utilities {

	// Pagination
		public int getStartPage(Page<?> items) {
			int startPage = Math.max(1, items.getPageable().getPageNumber() - 9);
			return startPage;
		}

		public int getEndPage(Page<?> items) {
			int endPage = Math.min(items.getTotalPages(), items.getPageable().getPageNumber() + 9);
			return endPage;
		}
}
