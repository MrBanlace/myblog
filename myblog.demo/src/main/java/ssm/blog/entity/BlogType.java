package ssm.blog.entity;


import java.io.Serializable;

/**
 * Created by xp on 2017/4/14.
 * @author xp
 * @Description 博客类别实体类
 */
public class BlogType implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String typeName;
    private Integer orderNum;

    public BlogType(Integer id, String typeName, Integer orderNum) {
        this.id = id;
        this.typeName = typeName;
        this.orderNum = orderNum;
    }

    public BlogType(String typeName, Integer orderNum) {
        this.typeName = typeName;
        this.orderNum = orderNum;
    }

    public BlogType() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "BlogType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", orderNum=" + orderNum +
                '}';
    }
}