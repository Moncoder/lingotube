package com.moncoder.lingo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 赞过的视频表
 * </p>
 *
 * @author moncoder
 * @since 2024-03-28 15:51:18
 */
@Getter
@Setter
@TableName("vms_video_like")
@ApiModel(value = "VmsVideoLike对象", description = "赞过的视频表")
public class VmsVideoLike implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("唯一标识ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户ID，外键，关联用户表")
    private Integer userId;

    @ApiModelProperty("视频ID，外键，关联视频表")
    private Integer videoId;

    @ApiModelProperty("点赞时间")
    private LocalDateTime likedTime;
}
