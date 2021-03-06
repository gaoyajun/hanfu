package com.hanfu.product.center.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class StoneInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stone_info.id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stone_info.stone_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private Integer stoneId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stone_info.attribute
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private String attribute;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stone_info.value
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stone_info.create_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stone_info.modify_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private LocalDateTime modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stone_info.is_deleted
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private Boolean isDeleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stone_info
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stone_info.id
     *
     * @return the value of stone_info.id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stone_info.id
     *
     * @param id the value for stone_info.id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stone_info.stone_id
     *
     * @return the value of stone_info.stone_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public Integer getStoneId() {
        return stoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stone_info.stone_id
     *
     * @param stoneId the value for stone_info.stone_id
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setStoneId(Integer stoneId) {
        this.stoneId = stoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stone_info.attribute
     *
     * @return the value of stone_info.attribute
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stone_info.attribute
     *
     * @param attribute the value for stone_info.attribute
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stone_info.value
     *
     * @return the value of stone_info.value
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stone_info.value
     *
     * @param value the value for stone_info.value
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stone_info.create_time
     *
     * @return the value of stone_info.create_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stone_info.create_time
     *
     * @param createTime the value for stone_info.create_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stone_info.modify_time
     *
     * @return the value of stone_info.modify_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stone_info.modify_time
     *
     * @param modifyTime the value for stone_info.modify_time
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stone_info.is_deleted
     *
     * @return the value of stone_info.is_deleted
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stone_info.is_deleted
     *
     * @param isDeleted the value for stone_info.is_deleted
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stone_info
     *
     * @mbg.generated Thu Jan 09 14:56:41 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stoneId=").append(stoneId);
        sb.append(", attribute=").append(attribute);
        sb.append(", value=").append(value);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}