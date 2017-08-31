package com.zhiyou100.zyVideo.mapper;

import com.zhiyou100.zyVideo.model.FrontData;
import com.zhiyou100.zyVideo.model.SQLVO;
import com.zhiyou100.zyVideo.model.Video;
import com.zhiyou100.zyVideo.model.VideoExample;
import java.util.List;

import javax.mail.search.IntegerComparisonTerm;

import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    int countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
    
    List<Video> getAllVideo(SQLVO vo);
    Integer getVideoCount(SQLVO vo);

	void batchesDelete(@Param("ids")String str);

	FrontData getFrontData(@Param("videoId")Integer parseInt);
	
	List<Video> getFrontVideoList(@Param("subjectId") Integer subjectId);

	void addVideoPlayTimes(@Param("videoid")Integer videoid);
    
}