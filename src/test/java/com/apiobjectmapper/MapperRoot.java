package com.apiobjectmapper;

import java.util.ArrayList;

public class MapperRoot {

	public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<ObjectMapperClass> data;
    public MapperSupport support;
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
	public ArrayList<ObjectMapperClass> getData() {
		return data;
	}
	public void setData(ArrayList<ObjectMapperClass> data) {
		this.data = data;
	}
	public MapperSupport getSupport() {
		return support;
	}
	public void setSupport(MapperSupport support) {
		this.support = support;
	}
}