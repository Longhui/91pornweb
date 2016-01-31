package com.howtodoinjava.demo.model;

import java.io.Serializable;

/**
 * Created by raolonghui on 16-1-31.
 */
public class pornPictureVO implements Serializable {
    private static final long serialVersionUID= 2L;

    private String subjectName;
    private String url;
    private String authorName;
    private Integer authorID;

    @Override
    public String toString(){
        return "PornPictureVO [subjectName=" + subjectName + ", url=" + url +
                ", authorName=" + authorName + ", authorID=" + authorID + "]";
    }

    public String getSubjectName(){return subjectName;}

    public void setSubjectName(String value){ subjectName = value;}

    public String getUrl(){return url;}

    public void setUrl(String value){url=value;}

    public String getAuthorName(){return authorName;}

    public void setAuthorName(String value){authorName=value;}

    public Integer getAuthorID(){return authorID;}

    public void setAuthorID(Integer value){authorID=value;}
}
