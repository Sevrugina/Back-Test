package com.geekbrains.db.model;

public class Categories {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categories.id
     *
     * @mbg.generated Wed Sep 14 13:16:17 MSK 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categories.title
     *
     * @mbg.generated Wed Sep 14 13:16:17 MSK 2022
     */
    private String title;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categories.id
     *
     * @return the value of categories.id
     *
     * @mbg.generated Wed Sep 14 13:16:17 MSK 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categories.id
     *
     * @param id the value for categories.id
     *
     * @mbg.generated Wed Sep 14 13:16:17 MSK 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categories.title
     *
     * @return the value of categories.title
     *
     * @mbg.generated Wed Sep 14 13:16:17 MSK 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categories.title
     *
     * @param title the value for categories.title
     *
     * @mbg.generated Wed Sep 14 13:16:17 MSK 2022
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}