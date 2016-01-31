package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.pornPictureVO;

import java.util.List;

/**
 * Created by raolonghui on 16-1-31.
 */
public interface pornManager {
    public List<pornPictureVO> getPictures();
    public List<pornPictureVO> getPicturesByUser(String user);
    public List<pornPictureVO> getPicturesBySubject(String subject);
}
