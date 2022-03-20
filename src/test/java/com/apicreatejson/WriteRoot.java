package com.apicreatejson;

import java.util.ArrayList;
import java.util.List;

public class WriteRoot {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	public List<Writedadum> data;
	public WriteSupport support;

	public WriteRoot(int page, int per_page, int total, int total_pages, List<Writedadum> data2, WriteSupport support) {
	
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data2;
		this.support = support;

	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public List<Writedadum> getData() {
		return data;
	}

	public void setData(ArrayList<Writedadum> data) {
		this.data = data;
	}

	public WriteSupport getSupport() {
		return support;
	}

	public void setSupport(WriteSupport support) {
		this.support = support;
	}

}
