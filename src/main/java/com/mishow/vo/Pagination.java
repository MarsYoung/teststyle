package com.mishow.vo;

import java.util.List;

/**
 * 网站端分页使用，封装分页显示所需的各项属性值，配合pager-taglib标签库
 * 
 * @author MarsYoung
 * 
 */
public class Pagination {
	// 分页索引链接页码显示个数
	private int maxIndexPages = 5;
	// 分页的大小
	private int pageSize = 10;
	// 总的页数
	private int total;
	// 当前页码
	private int pageNumber;
	// 总记录数
	private int maxElements;
	// 要显示的当前页第1条数据在总记录中的偏移量
	private int offset;

	// 分页后该页数据的集合
	private List<?> list;
	// 链接url的基本部分
	private String url;
	
	public Pagination() {
		super();
	}

	//含四个参数的构造器
	public Pagination(int maxIndexPages, int pageSize, int maxElements,
			int offset) {
		this.maxIndexPages = maxIndexPages;
		this.pageSize = pageSize;
		this.maxElements = maxElements;

		// 设置offset
		if (this.maxElements == 0) {
			this.offset = offset;
		} else {
			if (offset < 0) {
				this.offset = 0;
			} else if (offset > this.maxElements - 1) {
				this.offset = this.maxElements - 1;
			} else {
				this.offset = offset;
			}
		}

		// 设置total
		this.total = (int) Math.ceil((double) this.maxElements / this.pageSize);

		// 设置pageNumber
		this.pageNumber = (int) Math.ceil((double) (this.offset + 1)
				/ this.pageSize);
	}

	//含三个参数的构造器
	public Pagination(int pageSize, int maxElements, int offset) {
		this.pageSize = pageSize;
		this.maxElements = maxElements;

		// 设置offset
		if (this.maxElements == 0) {
			this.offset = offset;
		} else {
			if (offset < 0) {
				this.offset = 0;
			} else if (offset > this.maxElements - 1) {
				this.offset = this.maxElements - 1;
			} else {
				this.offset = offset;
			}
		}

		// 设置total
		this.total = (int) Math.ceil((double) this.maxElements / this.pageSize);

		// 设置pageNumber
		this.pageNumber = (int) Math.ceil((double) (this.offset + 1)
				/ this.pageSize);
	}

	public int getPageNumber() {
		return pageNumber;
	}

	//限制当前页面页码
	public void setPageNumber(int pageNumber) {
		int total = (int) Math.ceil((double) maxElements / pageSize);
		if (pageNumber > total) {
			this.pageNumber = total;
		} else if (pageNumber < 1) {
			this.pageNumber = 1;
		} else {
			this.pageNumber = pageNumber;
		}
	}

	public int getMaxElements() {
		return maxElements;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		if (maxElements == 0) {
			this.offset = offset;
		} else {
			if (offset < 0) {
				this.offset = 0;
			} else if (offset > maxElements - 1) {
				this.offset = maxElements - 1;
			} else {
				this.offset = offset;
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	@SuppressWarnings("rawtypes")
	public void setList(List list) {
		this.list = list;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getMaxIndexPages() {
		return maxIndexPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
