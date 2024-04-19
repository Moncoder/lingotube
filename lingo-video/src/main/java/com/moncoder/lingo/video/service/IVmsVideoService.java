package com.moncoder.lingo.video.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moncoder.lingo.entity.VmsVideo;
import com.moncoder.lingo.video.domain.dto.VideoCreateDTO;
import com.moncoder.lingo.video.domain.vo.VideoPlayVO;
import com.moncoder.lingo.video.domain.vo.VideoViewVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


/**
 * <p>
 * 视频表 服务类
 * </p>
 *
 * @author moncoder
 * @since 2024-03-20 14:59:05
 */
public interface IVmsVideoService extends IService<VmsVideo> {

    /**
     * 上传视频
     *
     * @param videoFile
     * @return
     */
    String uploadVideo(MultipartFile videoFile);

    /**
     * 上传视频缩略图
     * @param thumbnailFile
     * @return
     */
    String uploadVideoThumbnail(MultipartFile thumbnailFile);

    /**
     * 保存视频
     *
     * @param videoCreateDTO
     * @return
     */
    boolean saveVideo(VideoCreateDTO videoCreateDTO);

    /**
     * 根据id获取视频播放信息
     * @param id
     * @return
     */
    VideoPlayVO getVideo(Integer id);

    /**
     * 点赞、取消点赞视频
     *
     * @param userId
     * @param videoId
     * @return
     */
    boolean likeVideo(Integer userId, Integer videoId);

    /**
     * 收藏、取消收藏视频
     *
     * @param userId
     * @param videoId
     * @param folderIds
     * @return
     */
    boolean favoriteVideo(Integer userId, Integer videoId, List<Integer> folderIds);

    /**
     * 保存最新视频到最新视频表中
     *
     * @param videoNum 视频数量
     * @return
     */
    boolean saveLatestVideos(Integer videoNum);

    /**
     * 保存热门视频到热门视频表中
     *
     * @param videoNum 视频数量
     * @return
     */
    boolean saveTrendingVideos(Integer videoNum);

    /**
     * 保存推荐视频到推荐视频表中
     *
     * @param videoNum 视频数量
     * @return
     */
    boolean saveRecommendedVideos(Integer videoNum);


    /**
     * 获取相关视频
     * @param id
     * @param levelName
     * @return
     */
    List<VideoViewVO> getRelatedVideos(Integer id, String levelName,int num);
}
