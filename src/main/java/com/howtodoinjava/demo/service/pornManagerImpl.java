package com.howtodoinjava.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.howtodoinjava.demo.model.pornPictureVO;
import com.howtodoinjava.demo.mapper.PornPictureMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raolonghui on 16-1-31.
 */
@Service
public class pornManagerImpl implements pornManager {

    @Autowired
    PornPictureMapper pictureMapper;

   public List<pornPictureVO> getPictures(){
//       List<pornPictureVO> pictures= new ArrayList<pornPictureVO>();
//       pornPictureVO obj1 = new pornPictureVO();
//       obj1.setUrl("urlurl");
//       obj1.setSubjectName("subject");
//       obj1.setAuthorName("author");
//       obj1.setAuthorID(1);
//       pictures.add(obj1);
//       return pictures;
       return pictureMapper.getPornPictures();
    }

    public List<pornPictureVO> getPicturesByUser(String user){
        return pictureMapper.getPornPicturesByUser(user);
    }

    public List<pornPictureVO> getPicturesBySubject(String subject){
        return pictureMapper.getPornPicturesBySubject(subject);
    }
}
