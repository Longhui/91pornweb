package com.howtodoinjava.demo.mapper;

import com.howtodoinjava.demo.model.pornPictureVO;

import java.util.List;

/**
 * Created by raolonghui on 16-1-31.
 */
public interface PornPictureMapper {
    public List<pornPictureVO> getPornPictures();
    public List<pornPictureVO> getPornPicturesByUser(String user);
}
