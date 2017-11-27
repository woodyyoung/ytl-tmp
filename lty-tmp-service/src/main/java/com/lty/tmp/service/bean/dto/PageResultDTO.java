package com.lty.tmp.service.bean.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PageResultDTO<T> extends RespondListDTO {
	/**
	 * 当前页
	 */
	@JsonProperty("current_page")
	private long currentPage;
	/**
	 * 一页显示的行数
	 */
	@JsonProperty("page_size")
	private int pageSize;
	/**
	 * 总页数
	 */
	@JsonProperty("total_page")
	private long totalPage;

	/**
	 * 总记录数
	 */
	@JsonProperty("total_record")
	private Integer totalRecord;


	public long getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(long currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

}
