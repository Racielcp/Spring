package com.indizen.cursoSpring.servicio.model.permission;

import java.io.Serializable;

import com.indizen.cursoSpring.servicio.model.EntityBase;
public class Permission implements Serializable,EntityBase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.id
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_permission.name
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_permission
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.id
     *
     * @return the value of t_permission.id
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.id
     *
     * @param id the value for t_permission.id
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_permission.name
     *
     * @return the value of t_permission.name
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_permission.name
     *
     * @param name the value for t_permission.name
     *
     * @mbggenerated Fri Apr 27 11:35:15 CEST 2012
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}