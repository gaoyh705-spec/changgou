package com.changgou.content.pojo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.io.Serializable;
import java.lang.String;
/****
 * @Author:gaoyihua
 * @Description:Content的pojo
 * @Date 2021-03-09 01:41:49
 *****/
@ApiModel(description = "Content",value = "Content")
@Table(name="tb_content")
public class Content implements Serializable{

	@ApiModelProperty(value = "",required = false)
    @Column(name = "id")
	private String id;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "category_id")
	private String categoryId;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "title")
	private String title;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "url")
	private String url;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "pic")
	private String pic;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "status")
	private String status;//

	@ApiModelProperty(value = "",required = false)
    @Column(name = "sort_order")
	private String sortOrder;//



	//get方法
	public String getId() {
		return id;
	}

	//set方法
	public void setId(String id) {
		this.id = id;
	}
	//get方法
	public String getCategoryId() {
		return categoryId;
	}

	//set方法
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	//get方法
	public String getTitle() {
		return title;
	}

	//set方法
	public void setTitle(String title) {
		this.title = title;
	}
	//get方法
	public String getUrl() {
		return url;
	}

	//set方法
	public void setUrl(String url) {
		this.url = url;
	}
	//get方法
	public String getPic() {
		return pic;
	}

	//set方法
	public void setPic(String pic) {
		this.pic = pic;
	}
	//get方法
	public String getStatus() {
		return status;
	}

	//set方法
	public void setStatus(String status) {
		this.status = status;
	}
	//get方法
	public String getSortOrder() {
		return sortOrder;
	}

	//set方法
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}


}
